package Ejercicio7;

import java.util.Scanner;

public class Average {

    public void getAverage(int total) {
        Scanner scanner = new Scanner(System.in);
        int califNum = 1;
        double totalSum = 0;

        while (califNum <= total) {
            System.out.printf("Introduce la calificación %d: ", califNum);
            double calif = scanner.nextFloat();
            totalSum += calif;
            califNum++;
        }

        double avg = totalSum/total;

        System.out.printf("Suma total: %.2f%n", totalSum);
        System.out.printf("Promedio de calificaciones: %.2f", avg);

        scanner.close();
    }



}
