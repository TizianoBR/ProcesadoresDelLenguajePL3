.class public Ejemplo03_MultiplicarNumeros
.super java/lang/Object

; Constructor por defecto
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

; Método main
; Variables: local_0=args, local_1=a, local_2=b
.method public static main([Ljava/lang/String;)V
    .limit stack 3
    .limit locals 3
    
    ; a = 15
    bipush 15
    istore_1
    
    ; b = 4
    bipush 4
    istore_2
    
    ; System.out.println(a * b)
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    iload_2
    imul
    invokevirtual java/io/PrintStream/println(I)V
    
    return
.end method
