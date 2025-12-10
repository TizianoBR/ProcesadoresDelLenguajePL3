.class public Ejemplo08_BucleWhile
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
    
    ; int contador = 0;
    iconst_0
    istore_1
    
inicio_while:
    ; while (contador < 3)
    iload_1
    iconst_3
    if_icmpge fin_while
    
    ; Cuerpo del bucle: System.out.println(contador);
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(I)V
    
    ; contador++
    iinc 1 1
    goto inicio_while
    
fin_while:
    return
.end method
