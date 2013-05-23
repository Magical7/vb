grammar Calc;

options {
    k=1;                                // LL(1) - do not use LL(*)
    language=Java;                      // target language is Java (= default)
    output=AST;                         // build an AST
}

tokens {
    COLON       =   ':'     ;
    SEMICOLON   =   ';'     ;
    LPAREN      =   '('     ;
    RPAREN      =   ')'     ;
    COMMA		=	','		;

    // operators
    BECOMES     =   ':='    ;
    PLUS        =   '+'     ;
    MINUS       =   '-'     ;
    TIMES		=	'*'		;
    QUOTIENT	=	'/'		;
    // relational operators
    GREATER		=	'>'		;
    SMALLER		=	'<'		;
    GREATEREQ	=	'>='	;
    SMALLEREQ	=	'<='	;
    EQUALS		=	'=='	;
    NOTEQUALS	=	'!='	;

    // keywords
    PROGRAM     =   'program'   ;
    VAR         =   'var'       ;
    PRINT       =   'print'     ;
    INTEGER     =   'integer'   ;
    SWAP		= 	'swap'		;
    IF			=	'if'		;
    THEN		=	'then'		;
    DO			=	'do'		;
    WHILE		=	'while'		;
    ELSE		=	'else'		;
}

@lexer::header {
package vb.week4.xcalc;
}

@header {
package vb.week4.xcalc;
}

// Parser rules

program
    :   program_lines EOF
            ->  ^(PROGRAM program_lines)
    ;
    
program_lines
	:	((statement | declaration) SEMICOLON!)*
	;

declaration
    :   VAR^ IDENTIFIER COLON! type
    ;
    
dowhileStatement : DO^ statements WHILE expr_if ;
statements : (statement SEMICOLON!)+ ;
    
statement
    :   assignment
    |	dowhileStatement
    |   print_stat
    |	swap_stat
    ;

assignment
    :   lvalue BECOMES^ expr
    ;

print_stat
    :   PRINT^ LPAREN! expr RPAREN!
    ;
    
swap_stat
	:	SWAP^ LPAREN! IDENTIFIER COMMA! IDENTIFIER RPAREN!
	;

lvalue
    :   IDENTIFIER
    ;
    
expr
	:	expr_assign
	;
	
expr_assign
	:	expr_if (BECOMES^ expr_assign)?
	;
    
expr_if
	:	IF^ expr_if THEN! expr_if ELSE! expr_if
	|	expr_rel
	;
    
expr_rel
	:	expr_plus ((GREATER^ | SMALLER^ | GREATEREQ^ | SMALLEREQ^ | EQUALS^ | NOTEQUALS^ ) expr_plus)*
	;
    
expr_plus
    :   expr_times ((PLUS^ | MINUS^) expr_times )*
    ;
    
expr_times
	:	operand ((TIMES^ | QUOTIENT^) operand )*
	;

operand
    :   IDENTIFIER
    |   NUMBER
    |   LPAREN! expr RPAREN!
    ;

type
    :   INTEGER
    ;


// Lexer rules

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

