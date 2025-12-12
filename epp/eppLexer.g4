lexer grammar eppLexer;

ASIGNAR : 'asignar';
MOSTRAR : 'mostrar';
SI      : 'si';
NO      : 'no';
TERMINAR: 'terminar';
MIENTRAS: 'mientras';
REPETIR : 'repetir';
ARROW   : '->';
QMARKS  : '???';
END     : ';' [ \t]* 'P';

MAS     : '+';
MENOS   : '-';
POR     : '*';
DIV     : '/';

TRUE    : 'T';
FALSE   : 'F';

AND     : '&&';
OR      : '||';
NOT     : '!';

IGUALIGUAL : '==';
NOIGUAL   : '!=';
MENORIGUAL : '<=';
MAYORIGUAL : '>=';
MENOR      : '<';
MAYOR      : '>';

IGUAL   : '=';

ABREPAREN : '(';
CIERRAPAREN : ')';

ID      : [a-zA-Z_] [a-zA-Z0-9_]*;
NUMBER  : [0-9]+ ('.' [0-9]+)?;
STRING  : '"' ~["\r\n]* '"';

COMMENT_LINE
    : '#' ~[\r\n]* -> skip
    ;

NEWLINE
    : '\r\n' | '\r' | '\n'
    ;

WS
    : [ \t]+ -> skip
    ;
