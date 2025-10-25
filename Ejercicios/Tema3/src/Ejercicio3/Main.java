package Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nota:");
        double mark = scanner.nextDouble();
        if (mark >= 0 && mark <= 10) {
            if (mark >= 5) {
                System.out.println("¡Enhorabuena! Has aprobado.");
            } else {
                System.out.println("Has suspendido. Vuelve a intentarlo.");
            }
        } else {
            System.out.println("El valor que has introducido no está dentro del rango esperado.");
        }

        scanner.close();
    }

}
