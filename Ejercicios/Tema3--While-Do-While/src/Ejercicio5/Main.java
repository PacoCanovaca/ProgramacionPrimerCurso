package Ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.print("--- MENÚ ---\n1. Saludar\n2. Decir cómo está\n3. Ver hora\n4. Salir\nElige una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("¡Hola! ¿Cómo estás?");
                }
                case 2 -> {
                    System.out.println("Estoy bien. ¡Gracias!");
                }
                case 3 -> {
                    System.out.println("La hora actual es: 10:30");
                }
                case 4 -> {
                    System.out.println("¡Hasta luego!");
                }

            }

        } while (option != 4);

        scanner.close();

    }

}
