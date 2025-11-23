package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int correctNum = (int) (Math.random() * 10) + 1;
        System.out.println("¡Adivina el núimero entre 1 y 10!");
        int guess;
        int tries = 0;

        do {
            System.out.print("Introduce tu intento: ");
            guess = scanner.nextInt();
            if (guess > correctNum) {
                System.out.println("El número es menor. Intenta de nuevo");
            } else if (guess < correctNum) {
                System.out.println("El número es mayor. Intenta de nuevo");
            }
            tries++;
        } while (guess != correctNum);

        System.out.printf("¡Correcto! Has adivinado el número en %d intentos", tries);

        scanner.close();

    }
}
