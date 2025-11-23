package Ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean validAge = false;

        do {
            System.out.print("Introduce tu edad: ");
            int age = scanner.nextInt();
            if (age >= 0 && age <= 120) {
                validAge = true;
                System.out.println("Edad válida: " + age + " años. ¡Gracias!");
            } else {
                System.out.println("Edad no válida. Debe estar entre 0 y 120");
            }
        } while (!validAge);


        scanner.close();

    }
}
