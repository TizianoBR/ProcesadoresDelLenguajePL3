.class public Ejemplo06_IfAnidados
.super java/lang/Object

; Constructor por defecto
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

; Método main
.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 2
    
    ; int x = 15;
    bipush 15
    istore_1
    
    ; if (x > 10)
    iload_1
    bipush 10
    if_icmple else1
    
    ; if (x < 20)
    iload_1
    bipush 20
    if_icmpge else2
    
    ; x está entre 10 y 20
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "x esta entre 10 y 20"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto fin
    
else2:
    ; x es mayor o igual a 20
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "x es mayor o igual a 20"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto fin
    
else1:
    ; x es menor o igual a 10
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "x es menor o igual a 10"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    
fin:
    return
.end method
