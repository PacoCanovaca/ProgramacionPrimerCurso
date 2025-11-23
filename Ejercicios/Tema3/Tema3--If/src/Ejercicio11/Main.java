package Ejercicio11;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el importe de la compra:");
        double price = scanner.nextDouble();
        System.out.println("¿Eres socio? (true/false):");
        boolean isMember = scanner.nextBoolean();
        System.out.printf("Importe original: %.2f€%n", price);
        boolean haveDiscount = true;
        int discountPercentage = 0;
        if (price >= 200 && isMember) {
            System.out.println("Eres socio y tu compra es igual o mayor a 200€");
            discountPercentage = 20;
        } else if (price < 200 && isMember) {
            System.out.println("Eres socio pero tu compra es menor a 200€");
            discountPercentage = 10;
        } else if (price >= 300 && !isMember) {
            System.out.println("No eres socio, aunque tu compra es igual o mayor a 300€");
            discountPercentage = 5;
        } else {
            haveDiscount = false;
        }
        double finalPrice = price;
        if (haveDiscount) {
            double discount = price * ((double)discountPercentage / 100);
            System.out.println("Descuento aplicado (" + discountPercentage + "%): " + discount + "€");
            finalPrice -= discount;
        }
        System.out.printf("Importe final: %.2f€%n", finalPrice);

        scanner.close();
    }

}
