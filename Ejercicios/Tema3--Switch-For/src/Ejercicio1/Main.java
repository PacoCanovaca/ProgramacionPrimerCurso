package Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número (1-7):");
        int day = scanner.nextInt();

        Day dayOfWeek = new Day();
        System.out.printf("El día %d es: %s", day, dayOfWeek.dayOfTheWeek(day));

        scanner.close();

    }

}
