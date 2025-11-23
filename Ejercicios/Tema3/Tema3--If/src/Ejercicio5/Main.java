package Ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("El número " + number + " es par");
        } else {
            System.out.println("El número " + number + " es impar");
        }


        scanner.close();
    }

}
