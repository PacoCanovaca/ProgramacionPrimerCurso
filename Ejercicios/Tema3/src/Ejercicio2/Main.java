package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("El número es positivo");
        } else if (number == 0) {
            System.out.println("El número es cero");
        } else {
            System.out.println("El número es negativo");
        }

        scanner.close();
    }

}
