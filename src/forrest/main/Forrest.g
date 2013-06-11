grammar Forrest;

options {
	k = 1; 
	language=Java;
	output=AST;
}

tokens {
    SEMICOLON   =   ';'     ;
    LPAREN      =   '('     ;
    RPAREN      =   ')'     ;
    COMMA		=	','		;
    LCURLY		=	'{'		;
    RCURLY		=	'}'		;

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
    COMPOUND	= 	'compound'	;
    PROGRAM		=	'program'	;
    CONSTANT	=	'const'		;
    ENDIF		=	'endif'		;
}

@lexer::header {
package forrest.main;
}

@header {
package forrest.main;
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
	:	expr_if (BECOMES^ expr_if)*
	;
	
expr_if
	:	IF^ expr_if THEN! expr_if (ELSE! expr_if)? ENDIF
	|	expr_or
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
	:	(MINUS^ | PLUS^ | NOT^)? expr_compound
	;
	
expr_compound
	:	LCURLY program_lines RCURLY
			->  ^(COMPOUND program_lines)	
	|	IDENTIFIER
	|	NUMBER
	|	LPAREN! expr RPAREN!
	| 	READ^ LPAREN! IDENTIFIER (COMMA! IDENTIFIER)* RPAREN!
	|	PRINT^ LPAREN! expr (COMMA! expr)* RPAREN!
	;
	
//LEXer rules

IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
    ;

NUMBER
    :   DIGIT+
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