lexer grammar eppLexer;

ASIGNAR : 'asignar';
MOSTRAR : 'mostrar';
SI      : 'si';
NO      : 'no';
TERMINAR: 'terminar';
MIENTRAS: 'mientras';
ARROW   : '->';
QMARKS  : '???';
END     : ';' [ \t]* 'P';

AND     : '&&';
OR      : '||';
NOT     : '!';

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
