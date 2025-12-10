// Equivalente Java del Ejemplo 6: If anidados
public class Ejemplo06_IfAnidados {
    public static void main(String[] args) {
        int x = 15;
        
        if (x > 10) {
            if (x < 20) {
                System.out.println("x esta entre 10 y 20");
            } else {
                System.out.println("x es mayor o igual a 20");
            }
        } else {
            System.out.println("x es menor o igual a 10");
        }
    }
}
