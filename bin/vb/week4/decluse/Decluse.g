grammar Decluse;

options {
    k=1;                                // LL(1) - do not use LL(*)
    language=Java;                      // target language is Java (= default)
    output=AST;                         // build an AST
}

tokens {
	LPAREN		= 	'('		;
	RPAREN		=	')'		;
	DECLTOKEN	=	'D:'	;
	USETOKEN	=	'U:'	;

	SERIE		=	'serie'	;	
}

@lexer::header {
package vb.week4.decluse;
}

@header {
package vb.week4.decluse;
}

// Parser rules

decluse
    :   LPAREN! serie RPAREN! EOF
    ;
    
serie
	:	unit*
            ->  ^(SERIE unit*)
	;
	
unit
	:	decl
	| 	use
	|	LPAREN! serie RPAREN!
	;
	
decl
	:	DECLTOKEN^ ID
	;
	
use
	:	USETOKEN^ ID
	;


// Lexer rules

ID
    :   (LETTER)+
    ;


	
COMMENT
    :   '//' .* '\n' 
            { $channel=HIDDEN; }
    ;

WS
    :   (' ' | '\t' | '\f' | '\r' | '\n')+
            { $channel=HIDDEN; }
    ;

fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER ;

// EOF