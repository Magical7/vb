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
    :   program_lines EOF
            ->  ^(PROGRAM program_lines)
    ;
    
program_lines
	:	((statement | declaration) SEMICOLON!)*
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
    :   lvalue BECOMES^ expr_if
    ;

print_stat
    :   PRINT^ LPAREN! expr_if RPAREN!
    ;
    
swap_stat
	:	SWAP^ LPAREN! IDENTIFIER COMMA! IDENTIFIER RPAREN!
	;

lvalue
    :   IDENTIFIER
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
    |   LPAREN! expr_plus RPAREN!
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

