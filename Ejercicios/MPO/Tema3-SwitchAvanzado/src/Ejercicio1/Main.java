package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la calificación: ");
        double calificacion = scanner.nextDouble();
        int notaEntera = (int) calificacion;

        switch (notaEntera) {
            case 0, 1, 2, 3:
                System.out.println("Calificación: F");
                break;
            case 4:
                System.out.println("Calificación: D");
                break;
            case 5, 6:
                System.out.println("Calificación: C");
                break;
            case 7, 8:
                System.out.println("Calificación: B");
                break;
            case 9, 10:
                System.out.println("Calificación: A");
                break;
        }

        scanner.close();

    }
}
