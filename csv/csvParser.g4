parser grammar csvParser;

options{
  tokenVocab=csvLexer;
  language=Java;
}

prog:   FirstRow=firstRow NEWLINE Rows=rows;
rows:   row (NEWLINE row)* NEWLINE?;
firstRow: field (SEP field)*;
row:    field (SEP field)*;
field:  TEXT | NUMBER | STRING;
