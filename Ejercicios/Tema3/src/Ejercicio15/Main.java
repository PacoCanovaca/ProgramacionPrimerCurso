package Ejercicio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el peso del paquete (kg):");
        double weight = scanner.nextDouble();
        System.out.println("Introduce la distancia del envío (km):");
        int distance = scanner.nextInt();
        System.out.println("¿Es envío urgente? (true/false)");
        boolean isUrgent = scanner.nextBoolean();

        double basePrice = 5;
        System.out.printf("Precio base: %.2f€%n", basePrice);

        double excedent = 0;
        if (weight > 5) {
            excedent = weight - 5;
        }
        double additionalCostExcedent = excedent * 2;
        System.out.println("Excedente: " + excedent + " kg.");
        System.out.printf("Coste adicional por peso: %.2f€%n", additionalCostExcedent);

        double additionalCostDistance = 0;
        if (distance > 100) {
            System.out.println("Distancia: " + distance + "km. Mayor que 100km");
            additionalCostDistance = 10;
        } else {
            System.out.println("Distancia: " + distance + "km. Menor que 100km");
        }
        System.out.printf("Coste adicional por distancia: %.2f€%n", additionalCostDistance);

        double subtotal = basePrice + additionalCostDistance + additionalCostExcedent;
        System.out.printf("Subtotal: %.2f€%n", subtotal);

        double total = subtotal;
        if (isUrgent) {
            System.out.println("Recargo por urgencia (x1,5 al subtotal)");
            total = subtotal * 1.5;
        }

        System.out.printf("Coste total de envío: %.2f%n", total);


        scanner.close();

    }

}
