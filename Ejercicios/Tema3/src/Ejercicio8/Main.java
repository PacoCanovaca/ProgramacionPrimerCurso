package Ejercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int firstNumber = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("El número " + firstNumber + " es mayor que " + secondNumber + ".");
        } else if (secondNumber > firstNumber) {
            System.out.println("El número " + secondNumber + " es mayor que " + firstNumber + ".");
        } else {
            System.out.println("Ambos números son iguales.");
        }

    }

}
