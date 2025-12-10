.class public Ejemplo09_FuncionSinParametros
.super java/lang/Object

; Constructor por defecto
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

; Función que imprime un mensaje
.method public static saludar()V
    .limit stack 2
    .limit locals 0
    
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Hola desde la funcion saludar!"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    
    return
.end method

; Método main
.method public static main([Ljava/lang/String;)V
    .limit stack 0
    .limit locals 1
    
    ; Llamar a la función saludar()
    invokestatic Ejemplo09_FuncionSinParametros/saludar()V
    
    return
.end method
