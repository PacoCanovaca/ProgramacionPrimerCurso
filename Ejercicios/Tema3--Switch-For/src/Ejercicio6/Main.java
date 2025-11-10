package Ejercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = scanner.nextInt();
        System.out.printf("Tabla del %d:%n", num);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num*i);
        }

        scanner.close();

    }

}
