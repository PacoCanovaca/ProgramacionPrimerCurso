package Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int firstNum = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int secondNum = scanner.nextInt();
        System.out.println("Introduce la operación (+, -, *, /):");
        String op = scanner.next();

        Operation operation = new Operation();
        System.out.printf("Resultado: %d %s %d = %d", firstNum, op, secondNum, operation.solveOperation(firstNum, secondNum, op));

        scanner.close();

    }

}
