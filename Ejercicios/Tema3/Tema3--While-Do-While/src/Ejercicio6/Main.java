package Ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        System.out.println("Cuenta atrás");

        while (num > 0) {
            System.out.println(num);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num--;
        }
        System.out.println("¡Despegue!");

        scanner.close();

    }
}
