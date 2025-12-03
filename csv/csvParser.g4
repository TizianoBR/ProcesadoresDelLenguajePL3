parser grammar csvParser;

options{
  tokenVocab=csvLexer;
  language=Java;
}

prog:   firstRow NEWLINE(row NEWLINE)*;

firstRow: field (SEP field)*;
row:    field (SEP field)*;
field:  TEXT | NUMBER | STRING;
