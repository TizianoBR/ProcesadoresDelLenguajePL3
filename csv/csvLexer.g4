lexer grammar csvLexer;
TEXT:   ~[;,|\r\n \t] (~[;,|\r\n]* ~[;,|\r\n \t])?;
NUMBER: '-'?[0-9]+('.'[0-9]+)?;
STRING: '"' ~["\r\n]* '"' ;
SEP:    ',' | ';' | '|';
NEWLINE:'\r\n' | '\r' | '\n' ;
BLANK:  [ \t]+ -> skip;