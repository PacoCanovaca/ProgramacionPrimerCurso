package Ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes hay?: ");
        int totalStudents = scanner.nextInt();

        Grade grade = new Grade();
        grade.getGrade(totalStudents);

        scanner.close();

    }
}
