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
    QUOTIENT	=	'%'		;

    // keywords
    PROGRAM     =   'program'   ;
    VAR         =   'var'       ;
    PRINT       =   'print'     ;
    INTEGER     =   'integer'   ;
    SWAP		= 	'swap'		;
    IF			=	'if'		;
    THEN		=	'then'		;
    ELSE		=	'else'		;
}

@lexer::header {
package vb.week3.calc;
}

@header {
package vb.week3.calc;
}

// Parser rules

program
    :   declarations statements EOF
            ->  ^(PROGRAM declarations? statements)
    ;
    
declarations
    :   (declaration SEMICOLON!)*
    ;
    
statements
    :   (statement SEMICOLON!)+
    ;

declaration
    :   VAR^ IDENTIFIER COLON! type
    ;
    
statement
    :   assignment
    |   print_stat
    |	swap_stat
    ;

assignment
    :   lvalue BECOMES^ expr1
    ;

print_stat
    :   PRINT^ LPAREN! expr1 RPAREN!
    ;
    
swap_stat
	:	SWAP^ LPAREN! IDENTIFIER COMMA! IDENTIFIER RPAREN!
	;

lvalue
    :   IDENTIFIER
    ;
    
expr1
    :   expr2 ((PLUS^ | MINUS^) expr2 )*
    |	if_expr
    ;
    
expr2
	:	operand ((TIMES^ | QUOTIENT^) operand )*
	;
	
if_expr
	:	IF^ expr1 THEN! expr1 ELSE! expr1
	;
	

operand
    :   IDENTIFIER
    |   NUMBER
    |   LPAREN! expr1 RPAREN!
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

