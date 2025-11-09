package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu calificación (A-F):");
        String grade = scanner.next();

        Grade getGrade = new Grade();
        System.out.printf("Calificación %s: %s", grade.toUpperCase(), getGrade.getMark(grade.toUpperCase()));

        scanner.close();

    }

}
