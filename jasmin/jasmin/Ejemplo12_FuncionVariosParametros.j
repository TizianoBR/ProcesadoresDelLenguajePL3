.class public Ejemplo12_FuncionVariosParametros
.super java/lang/Object

; Constructor por defecto
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

; Función que suma tres números
.method public static sumarTres(III)I
    .limit stack 2
    .limit locals 3
    
    ; return a + b + c;
    iload_0    ; a
    iload_1    ; b
    iadd
    iload_2    ; c
    iadd
    ireturn
.end method

; Método main
.method public static main([Ljava/lang/String;)V
    .limit stack 3
    .limit locals 2
    
    ; int resultado = sumarTres(10, 20, 30);
    bipush 10
    bipush 20
    bipush 30
    invokestatic Ejemplo12_FuncionVariosParametros/sumarTres(III)I
    istore_1
    
    ; System.out.println(resultado);
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(I)V
    
    return
.end method
