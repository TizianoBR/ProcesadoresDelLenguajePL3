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
    | cond_line
    | terminarStmt
    | COMMENT_LINE
    ;

statement
    : assignment
    | simpleAssign
    | show
    | ifStmt
    | whileStmt
    ;

assignment
    : ASIGNAR ID '=' expr END
    ;

simpleAssign
    : ID '=' expr END
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

terminarStmt
    : TERMINAR (END)?
    ;

block
    : (NEWLINE | statement | COMMENT_LINE)*
    ;

expr
    : expr '+' term
    | expr '-' term
    | term
    ;

term
    : term '*' factor
    | term '/' factor
    | factor
    ;

factor
    : '(' expr ')'
    | '-' factor
    | NUMBER
    | ID
    | STRING
    ;

boolExpr
    : boolExpr OR boolExpr
    | boolExpr AND boolExpr
    | NOT boolExpr
    | expr compOp expr
    | '(' boolExpr ')'
    | expr
    ;

compOp
    : '==' | '!=' | '<=' | '>=' | '<' | '>'
    ;