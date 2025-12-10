.class public Ejemplo05_ConcatenarTextoNumero
.super java/lang/Object

; Constructor por defecto
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

; Método main
.method public static main([Ljava/lang/String;)V
    .limit stack 3
    .limit locals 2
    
    ; int numero = 42;
    bipush 42
    istore_1
    
    ; Crear StringBuilder para concatenar
    new java/lang/StringBuilder
    dup
    invokespecial java/lang/StringBuilder/<init>()V
    
    ; Agregar texto
    ldc "El resultado es: "
    invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    
    ; Agregar número
    iload_1
    invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
    
    ; Convertir a String
    invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
    
    ; Mostrar resultado
    getstatic java/lang/System/out Ljava/io/PrintStream;
    swap
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    
    return
.end method
