package Ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el importe de la compra:");
        double originalCost = scanner.nextDouble();
        double discount;
        if (originalCost >= 100){
            discount = originalCost * 0.1;
        } else {
            discount = 0;
        }
        double finalCost = originalCost - discount;
        System.out.printf("Importe original: %.2f€%n", originalCost);
        System.out.printf("Descuento aplicado: %.2f€%n", discount);
        System.out.printf("Importe final: %.2f€%n", finalCost);

        scanner.close();
    }

}
