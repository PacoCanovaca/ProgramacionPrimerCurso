import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int firstOp = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int secondOp = scanner.nextInt();
        int addition = add(firstOp, secondOp);
        int subtraction = subtract(firstOp, secondOp);
        int multiplication = multiply(firstOp, secondOp);
        double division = divide(firstOp, secondOp);
        System.out.println("Suma: " + addition);
        System.out.println("Resta: " + subtraction);
        System.out.println("Multiplicación: " + multiplication);
        System.out.println("División: " + division);
    }

    public static int add(int op1, int op2) {
        return op1 + op2;
    }

    public static int subtract(int op1, int op2) {
        return op1 - op2;
    }

    public static int multiply(int op1, int op2) {
        return op1 * op2;
    }

    public static double divide(double op1, double op2) {
        return op1 / op2;
    }

}
