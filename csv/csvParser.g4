parser grammar csvParser;

options{
  tokenVocab=csvLexer;
  language=Java;
}

prog:   FirstRow=firstRow NEWLINE Rows=rows;
rows:   Row=row NEWLINE   #SingleRow
    |   Rows=rows SEP Row=row  #ManyRows
    ;
firstRow: Field=field   #SingleFieldFR
    |     Field=field SEP FirstRow=firstRow   #ManyFieldsFR
    ;
row:    Field=field   #SingleFieldR
    |   Field=field SEP Row=row   #ManyFieldsR
    ;
field:  TEXT | NUMBER | STRING;
