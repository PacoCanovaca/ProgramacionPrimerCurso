package Ejercicio9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = scanner.nextInt();
        System.out.printf("Calculando %d!%n", num);

        Factorial factorial = new Factorial();
        System.out.printf("El factorial de %d es: %d", num, factorial.getFactorial(num));

        scanner.close();

    }

}
