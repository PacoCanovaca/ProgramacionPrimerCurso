package Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Eres mayor de edad. Puedes votar.");
        } else {
            System.out.println("Eres menor de edad. No puedes votar.");
        }


        scanner.close();

    }

}
