package Ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número del mes (1-12): ");
        int monthNumber = scanner.nextInt();

        String season = null;

        switch (monthNumber) {
            case 12, 1, 2 -> season = "Invierno";
            case 3, 4, 5 -> season = "Primavera";
            case 6, 7, 8 -> season = "Verano";
            case 9, 10, 11 -> season = "Otoño";
        }

        System.out.printf("El mes %d corresponde a: %s", monthNumber, season);

        scanner.close();

    }

}
