package Ejercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nota:");
        double mark = scanner.nextDouble();
        Grade grade = new Grade();
        System.out.println(grade.getGrade(mark));
    }

}
