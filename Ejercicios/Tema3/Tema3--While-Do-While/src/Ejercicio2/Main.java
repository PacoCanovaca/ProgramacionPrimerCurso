package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int correctPassword = 1234;
        int guess;

        do {
            System.out.println("Introduce la contraseña: ");
            guess = scanner.nextInt();
            if (guess != correctPassword) {
                System.out.println("Contraseña incorrecta. Intenta de nuevo");
            }
        } while (guess != correctPassword);

        System.out.println("¡Contraseña correcta! Acceso permitido.");

        scanner.close();

    }
}
