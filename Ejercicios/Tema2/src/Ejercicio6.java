import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto:");
        double price = scanner.nextDouble();
        System.out.println("Introduce el porcentaje de descuento:");
        double percentage = scanner.nextDouble();
        double discount = price * (percentage / 100);
        double discountApplied = price - discount;
        System.out.println("Precio original: " + price + "€");
        System.out.printf("Descuento (" + percentage + "): %.2f%s%n", discount, "€");
        System.out.printf("Precio final: %.2f%s", discountApplied, "€");


    }

}
