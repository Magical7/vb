grammar Forrest;

options {
	k = 1; 
	language=Java;
	output=AST;
	ASTLabelType=ForrestTree;
}

tokens {
    SEMICOLON   =   ';'     ;
    COLON		=	':'		;
    LPAREN      =   '('     ;
    RPAREN      =   ')'     ;
    COMMA		=	','		;
    LCURLY		=	'{'		;
    RCURLY		=	'}'		;
    SQUOTE		=	'\'' 	;

    // operators
    BECOMES     =   '='    	;
    PLUS        =   '+'     ;
    MINUS       =   '-'     ;
    TIMES		=	'*'		;
    DIVIDE		=	'/'		;
    MODULO		=	'%'		;
    
    // relational operators
    GREATER		=	'>'		;
    SMALLER		=	'<'		;
    GREATEREQ	=	'>='	;
    SMALLEREQ	=	'<='	;
    EQUALS		=	'=='	;
    NOTEQUALS	=	'!='	;
    NOT			=	'!'		;
    LOGAND		=	'&&'	;
    LOGOR		=	'||'	;
    
    //keywords
    READ		=	'read'		;
    PRINT		=	'print'		;
    VAR			=	'var'		;
    INT			=	'int'		;
    BOOL		= 	'bool'		;
    CHAR		=	'char'		;
    IF			=	'if'		;
    THEN		= 	'then'		;
    ELSE		=	'else'		;
    EXPR_IF		=	'7EXPRIF'	;
    WHILE		=	'while'		;
    DO			=	'do'		;
    EXPR_WHILE	=	'7EXPRWHILE';
    ENDWHILE	=	'endwhile'	;
    COMPOUND	= 	'7COMPOUND'	;
    PROGRAM		=	'7PROGRAM'	;
    CONSTANT	=	'const'		;
    ENDIF		=	'endif'		;
    POSITIVE	=	'7POSITIVE'	;
    NEGATIVE	=	'7NEGATIVE'	;
    TRUE		=	'true'		;
    FALSE		=	'false'		;
}

@lexer::header {
package forrest;
}

@header {
package forrest;
}

//Parser rules

forrest
	:   program_lines EOF
            ->  ^(PROGRAM program_lines)
    ;
    
program_lines
	:	((declaration SEMICOLON!)* (expr SEMICOLON!))*
	;
	
declaration
	:	VAR^ IDENTIFIER (CHAR | BOOL | INT)
	|	CONSTANT^ IDENTIFIER BECOMES! expr
	;

expr
	: 	expr_assign
	;
	
expr_assign
options {k=2;}
	:	IDENTIFIER BECOMES^ expr_assign
	|	expr_or
	;
	
expr_while
	:	while_comp do_comp ENDWHILE
			->	^(EXPR_WHILE while_comp do_comp)
	;
	
while_comp
	:	WHILE^ COLON! program_lines
	;

do_comp
	:	DO^ COLON! program_lines
	;
	
expr_if
	:	if_comp then_comp else_comp? ENDIF
			->	^(EXPR_IF if_comp then_comp else_comp?)
	;

if_comp
	:	IF^ COLON! program_lines
	;

then_comp
	:	THEN^ COLON! program_lines
	;

else_comp
	:	ELSE^ COLON! program_lines
	;
	
expr_or
	:	expr_and (LOGOR^ expr_and)*
	;
	
expr_and
	:	expr_comp (LOGAND^ expr_comp)*
	;
	
expr_comp
	:	expr_add ((GREATER^ | SMALLER^ | GREATEREQ^ | SMALLEREQ^ | EQUALS^ | NOTEQUALS^ ) expr_add)*
	;
	
expr_add
	:	expr_mult ((PLUS^ | MINUS^) expr_mult)*
	;

expr_mult
	:	expr_unary ((TIMES^ | DIVIDE^ | MODULO^) expr_unary)*
	;
	
expr_unary
	:	(NOT^)? expr_compound
	|	PLUS expr_compound
			-> ^(POSITIVE expr_compound)
	|	MINUS expr_compound
			-> ^(NEGATIVE expr_compound)
	;
	
expr_compound
	:	LCURLY program_lines RCURLY
			->  ^(COMPOUND program_lines)	
	|	IDENTIFIER
	|	NUMBER
	|	TRUE | FALSE
	|	CHARACTER
	|	LPAREN! expr RPAREN!
	| 	read
	|	print
	|	expr_if
	|	expr_while
	;
	
read
	:	READ^ LPAREN! IDENTIFIER (COMMA! IDENTIFIER)* RPAREN!
	;

print
	:	PRINT^ LPAREN! expr (COMMA! expr)* RPAREN!
	;
	
//LEXer rules

IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
    ;

NUMBER
    :   DIGIT+
    ;
    
CHARACTER
	:	SQUOTE LETTER SQUOTE   
	;

COMMENT
    :   '//' .* '\n' 
            { $channel=HIDDEN; }
    ;

WS
    :   (' ' | '\t' | '\f' | '\r' | '\n')+
            { $channel=HIDDEN; }
    ;

fragment DIGIT  :   ('0'..'9') ;
fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER ;


// EOF