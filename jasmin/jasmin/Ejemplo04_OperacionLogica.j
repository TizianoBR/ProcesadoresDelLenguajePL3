.class public Ejemplo04_OperacionLogica
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
    .limit locals 1
    
    ; (true AND false)
    iconst_1    ; true = 1
    iconst_0    ; false = 0
    iand        ; 1 AND 0 = 0
    
    ; (resultado OR true)
    iconst_1    ; true = 1
    ior         ; 0 OR 1 = 1
    
    ; System.out.println(resultado)
    getstatic java/lang/System/out Ljava/io/PrintStream;
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    
    return
.end method
