package Ejercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int age = scanner.nextInt();
        System.out.println("Introduce tus ingresos mensuales:");
        int income = scanner.nextInt();
        System.out.println("¿Tienes deudas pendientes? (true/false)");
        boolean haveDebt = scanner.nextBoolean();
        boolean ageRange = age >= 21 && age <= 65;
        boolean incomeRange = income >= 1000;
        if (ageRange) {
            if (incomeRange) {
                if (!haveDebt) {
                    System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo.");
                } else {
                    System.out.println("No eres elegible porque tienes deudas pendientes");
                }
            } else {
                System.out.println("No eres elegible porque no tienes unos ingresos iguales o mayores a 1000€");
            }
        } else {
            System.out.println("No eres elegible porque no tienes entre 21 y 65 años");
        }

        scanner.close();
    }

}
