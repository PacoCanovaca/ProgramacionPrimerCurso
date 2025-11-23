package Ejercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int age = scanner.nextInt();
        if (age >= 0 && age <= 120){
            if (age >= 16) {
                System.out.println("Acceso permitido");
            } else {
                System.out.println("Acceso denegado. Debes tener al menos 16 años.");
            }
        } else {
            System.out.println("Has introducido un valor inadecuado. La edad debe estar entre 0 y 120 años");
        }


        scanner.close();

    }

}
