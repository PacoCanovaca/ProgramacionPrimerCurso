package Ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--Menu--\n1. Ver perfil\n2. Configuración\n3. Ayuda\n4. Salir\nElige una opción: ");
        int option = scanner.nextInt();

        System.out.printf("Has seleccionado: %s", getOption(option));

        scanner.close();

    }

    public static String getOption(int optionSelected) {
        switch (optionSelected) {
            case 1 -> {
                return "Ver perfil";
            }
            case 2 -> {
                return "Configuración";
            }
            case 3 -> {
                return "Ayuda";
            }
            case 4 -> {
                return "Salir";
            }
            default -> {
                return "Error";
            }
        }
    }

}
