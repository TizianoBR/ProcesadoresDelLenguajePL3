parser grammar eppParser;

options{
    tokenVocab=eppLexer;
    language=Java;
}

prog
    : (line | NEWLINE)* EOF
    ;

line
    : statement
    | COMMENT_LINE
    ;

statement
    : assignment
    | simpleAssign
    | show
    | ifStmt
    | whileStmt
    | forStmt
    ;

assignment
    : ASIGNAR ID IGUAL expr END
    ;

simpleAssign
    : ID IGUAL expr END
    ;

show
    : MOSTRAR expr END
    ;

cond_line
    : boolExpr QMARKS
    ;

ifStmt
    : (boolExpr QMARKS (NEWLINE)*)? SI ARROW (NEWLINE)* block
      (NO ARROW (NEWLINE)* block)?
      terminarStmt
    ;

whileStmt
    : (boolExpr QMARKS (NEWLINE)*)? MIENTRAS ARROW (NEWLINE)* block terminarStmt
    ;

forStmt
    : REPETIR expr ARROW (NEWLINE)* block terminarStmt
    ;

terminarStmt
    : TERMINAR (END)?
    ;

block
    : (NEWLINE | statement | COMMENT_LINE)*
    ;

expr
    : expr MAS term
    | expr MENOS term
    | term
    ;

term
    : term POR factor
    | term DIV factor
    | term MOD factor
    | factor
    ;

factor
    : ABREPAREN expr CIERRAPAREN
    | (MENOS)? NUMBER
    | ID
    | STRING
    ;

boolExpr
    : boolExpr OR boolExprT
    | NOT boolExpr
    | boolExprT
    ;

boolExprT
    : boolExprT AND boolExprF
    | boolExprF
    ;

boolExprF
    : TRUE
    | FALSE
    | ABREPAREN boolExpr CIERRAPAREN
    | expr compOp expr
    ;

compOp
    : IGUALIGUAL | NOIGUAL | MENORIGUAL | MAYORIGUAL | MENOR | MAYOR
    ;