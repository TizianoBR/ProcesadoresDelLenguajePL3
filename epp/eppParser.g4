parser grammar eppParser;

options{
    tokenVocab=eppLexer;
    language=Java;
}

prog
    : (line | NEWLINE)* EOF
    ;

line
    : statement     #lineStatement
    | COMMENT_LINE  #lineComment
    ;

statement
    : assignment    #statementAssignment
    | simpleAssign  #statementSimpleAssign
    | show          #statementShow
    | ifStmt        #statementIf
    | whileStmt     #statementWhile
    | forStmt       #statementFor
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
    : expr MAS term     #exprMas
    | expr MENOS term   #exprMenos
    | term              #exprTerm
    ;

term
    : term POR factor   #termPor
    | term DIV factor   #termDiv
    | term MOD factor   #termMod
    | factor            #termFactor
    ;

factor
    : ABREPAREN expr CIERRAPAREN    #factorParen
    | (MENOS)? NUMBER               #factorNumber
    | ID                            #factorId
    | STRING                        #factorString
    ;

boolExpr
    : boolExpr OR boolExprT #boolExprOr
    | boolExprT             #boolExprExprT
    ;

boolExprT
    : boolExprT AND boolExprF #boolExprTAnd
    | boolExprF               #boolExprTExprF
    ;

boolExprF
    : TRUE                              #boolExprFTrue
    | FALSE                             #boolExprFFalse
    | NOT boolExpr                      #boolExprFNot
    | ABREPAREN boolExpr CIERRAPAREN    #boolExprFParen
    | expr compOp expr                  #boolExprFComp
    ;

compOp
    : IGUALIGUAL    #compOpIgualIgual
    | NOIGUAL       #compOpNoIgual
    | MENORIGUAL    #compOpMenorIgual
    | MAYORIGUAL    #compOpMayorIgual
    | MENOR         #compOpMenor
    | MAYOR         #compOpMayor
    ;