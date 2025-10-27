package Ejercicio9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu peso en kg:");
        double weight = scanner.nextDouble();
        System.out.println("Introduce tu altura en metros:");
        double height = scanner.nextDouble();
        double imc = (weight/Math.pow(height, 2));
        System.out.printf("Tu IMC es %.2f%n", imc);
        if (imc < 18.5) {
            System.out.println("Estás por debajo de tu peso normal");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Estás en peso normal");
        } else {
            System.out.println("Estás por encima de tu peso normal");
        }

    }

}
