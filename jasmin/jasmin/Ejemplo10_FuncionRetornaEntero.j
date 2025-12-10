.class public Ejemplo10_FuncionRetornaEntero
.super java/lang/Object

; Constructor por defecto
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

; Función que retorna el cuadrado de 7
.method public static calcularCuadrado()I
    .limit stack 2
    .limit locals 0
    
    ; return 7 * 7;
    bipush 7
    bipush 7
    imul
    ireturn
.end method

; Método main
.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 2
    
    ; int resultado = calcularCuadrado();
    invokestatic Ejemplo10_FuncionRetornaEntero/calcularCuadrado()I
    istore_1
    
    ; System.out.println(resultado);
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(I)V
    
    return
.end method
