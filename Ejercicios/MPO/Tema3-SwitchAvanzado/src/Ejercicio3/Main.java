package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la temperatura en grados Celsius (sólo el número):");
        int temperatura = scanner.nextInt();

        boolean helado = temperatura < 0;
        boolean frio = temperatura >= 0 && temperatura <= 15;
        boolean templado = temperatura > 15 && temperatura <= 25;
        boolean calor = temperatura > 25 && temperatura <= 35;
        boolean muchoCalor = temperatura > 35;

        int rango = 0;

        if (helado) {
            rango = 1;
        } else if (frio) {
            rango = 2;
        } else if (templado) {
            rango = 3;
        } else if (calor) {
            rango = 4;
        } else if (muchoCalor) {
            rango = 5;
        }

        switch (rango) {
            case 0 -> {
                System.out.println("Error. Temperatura no válida");
            }
            case 1 -> {
                System.out.println("El tiempo es helado. ¡Abrígate mucho!");
            }
            case 2 -> {
                System.out.println("El tiempo es frío. Al menos una sudadera y una chaqueta son necesarias");
            }
            case 3 -> {
                System.out.println("El tiempo es templado. Con una manga larga fina es suficiente");
            }
            case 4 -> {
                System.out.println("El tiempo es caluroso. Ponte manga corta y evita exponerte al sol mucho rato");
            }
            case 5 -> {
                System.out.println("El tiempo es muy caluroso. ¡Mejor no salir de la piscina!");
            }
        }

        scanner.close();

    }
}
