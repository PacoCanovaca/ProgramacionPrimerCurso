package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println("Introduce el segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("Introduce la operación que quieres llevar a cabo (+, -, *, /):");
        String operador = scanner.next();

        switch (operador) {
            case "+" -> {
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1+num2);
            }
            case "-" -> {
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1-num2);
            }
            case "*" -> {
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1*num2);
            }
            case "/" -> {
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1/num2);
            }
        }


        scanner.close();

    }
}
