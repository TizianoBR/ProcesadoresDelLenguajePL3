.class public Ejemplo07_BucleFor
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
    
    ; for (int i = 0; i < 5; i++)
    iconst_0        ; i = 0
    istore_1
    
inicio_for:
    ; Condición: i < 5
    iload_1
    iconst_5
    if_icmpge fin_for
    
    ; Cuerpo del bucle: System.out.println(i);
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(I)V
    
    ; Incremento: i++
    iinc 1 1
    goto inicio_for
    
fin_for:
    return
.end method
