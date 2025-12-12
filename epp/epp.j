.class public Ejemplo01_ProgramaVacio
.super java/lang/Object

.method public static main([Ljava/lang/String;)V

   ; reservar espacio en la pila, podria ser 0 aqui
   .limit stack 100
   .limit locals 100

ldc 10
istore 0
ldc 5
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
iload 1
iadd
invokevirtual java/io/PrintStream/println(I)V
iload 0
ldc 5
if_icmpgt LABEL_TRUE_1
ldc 0
goto LABEL_END_1
LABEL_TRUE_1:
ldc 1
LABEL_END_1:
ldc 1
ifeq ELSE_LABEL_0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
invokevirtual java/io/PrintStream/println(I)V
goto END_IF_LABEL_0
ELSE_LABEL_0:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 0
invokevirtual java/io/PrintStream/println(I)V
END_IF_LABEL_0:
ldc 0
istore 2
ldc 5
istore 98
ldc 0
istore 99
START_FOR_LABEL_2:
iload 99
iload 98
if_icmpge END_FOR_LABEL_2
iload 2
ldc 1
iadd
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V
iload 99
ldc 1
iadd
istore 99
goto START_FOR_LABEL_2
END_FOR_LABEL_2:
; terminar el main
   return

.end method