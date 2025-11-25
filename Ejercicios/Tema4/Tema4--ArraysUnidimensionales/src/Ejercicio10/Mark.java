package Ejercicio10;

import java.util.Arrays;
import java.util.Scanner;

public class Mark {
    public double[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes hay?: ");
        int students = scanner.nextInt();
        double[] marks = new double[students];
        for (int i = 0; i < students; i++) {
            System.out.printf("Introduce la nota del estudiante %d: ", i+1);
            double nota = scanner.nextDouble();
            marks[i] = nota;
        }
        return marks;
    }
    public void generateReport(double[] numbersList) {
        System.out.println("\n--- REPORTE DE CALIFICACIONES ---");
        System.out.printf("Calificaciones: %s%n", Arrays.toString(numbersList));
        double total = 0;
        int passedStudents = 0;
        double highestMark = numbersList[0];
        double lowestMark = numbersList[0];
        for (double mark : numbersList) {
            total += mark;
            if (mark >= 5) {
                passedStudents++;
            }
            if (mark > highestMark) {
                highestMark = mark;
            } else if (mark < lowestMark) {
                lowestMark = mark;
            }
        }
        double average = total / numbersList.length;
        System.out.printf("Promedio de la clase: %.2f%n", average);
        System.out.printf("Estudiantes aprobados: %d%n", passedStudents);
        System.out.printf("Nota más alta: %.2f%n", highestMark);
        System.out.printf("Nota más baja: %.2f%n", lowestMark);
    }
}
