.class public Ejemplo11_FuncionUnParametro
.super java/lang/Object

; Constructor por defecto
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

; Función que duplica un número
.method public static duplicar(I)I
    .limit stack 2
    .limit locals 1
    
    ; return numero * 2;
    iload_0
    iconst_2
    imul
    ireturn
.end method

; Método main
.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 2
    
    ; int resultado = duplicar(8);
    bipush 8
    invokestatic Ejemplo11_FuncionUnParametro/duplicar(I)I
    istore_1
    
    ; System.out.println(resultado);
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(I)V
    
    return
.end method
