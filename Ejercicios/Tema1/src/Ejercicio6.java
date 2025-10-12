public class Ejercicio6 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("Suma: " + suma(num1, num2));
        System.out.println("Resta: " + resta(num1, num2));
        System.out.println("Multiplicación: " + multiplicacion(num1, num2));
        System.out.println("División: " + division(num1, num2));
    }

    public static int suma(int op1, int op2){
        return op1 + op2;
    }

    public static int resta(int op1, int op2){
        return op1 - op2;
    }

    public static int multiplicacion(int op1, int op2){
        return op1 * op2;
    }

    public static int division(int op1, int op2){
        return op1 / op2;
    }

}
