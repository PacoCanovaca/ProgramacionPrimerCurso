package Ejercicio7;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas calificaciones vas a introducir?: ");
        int califTotal = scanner.nextInt();

        Average average = new Average();
        average.getAverage(califTotal);

        scanner.close();

    }
}
