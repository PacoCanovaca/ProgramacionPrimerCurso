package Ejercicio10;

import java.util.Scanner;

public class GradeReport {

    private double[][] generateArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes hay?: ");
        int students = scanner.nextInt();
        System.out.print("¿Cuántas asignaturas hay?: ");
        int subjects = scanner.nextInt();
        System.out.println();
        double[][] gradeArray = new double[students][subjects];
        for (int i = 0; i < gradeArray.length; i++) {
            for (int j = 0; j < gradeArray[i].length; j++) {
                System.out.printf("Introduce la nota del estudiante %d, asignatura %d: ", i+1, j+1);
                gradeArray[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
        return gradeArray;
    }

    private void showGradeTable(double[][] array) {
        System.out.println("\n--- TABLA DE NOTAS ---");
        System.out.println("\t\tAsig1\tAsig2\tAsig3\tAsig4");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Est %d:\t", i+1);
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%.1f\t\t", array[i][j]);
            }
            System.out.println();
        }
    }

    private void showStudentsAverage(double[][] array) {
        System.out.println("\n--- PROMEDIOS POR ESTUDIANTE ---");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Estudiante %d: ", i+1);
            double total = 0;
            for (double mark : array[i]) {
                total += mark;
            }
            double average = total / array[i].length;
            System.out.printf("%.2f%n", average);
        }
    }

    private void showSubjectsAverage(double[][] array) {
        System.out.println("\n--- PROMEDIOS POR ASIGNATURA ---");
        int subjects = array[0].length;
        double[] subjectsTotals = new double[subjects];
        for (double[] row : array) {
            for (int i = 0; i < row.length; i++) {
                subjectsTotals[i] += row[i];
            }
        }
        double[] subjectsAverage = new double[subjects];
        for (int i = 0; i < subjectsAverage.length; i++) {
            subjectsAverage[i] = subjectsTotals[i] / array.length;
            System.out.printf("Asignatura %d : %.2f%n", i+1, subjectsAverage[i]);
        }
    }

    private void showHighestGrade(double[][] array) {
        System.out.println("\n--- NOTA MÁS ALTA ---");
        double highestGrade = 0;
        int student = 0;
        int subject = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > highestGrade) {
                    highestGrade = array[i][j];
                    student = i+1;
                    subject = j+1;
                }
            }

        }
        System.out.printf("La nota más alta es %.2f (Estudiante %d, Asignatura %d)", highestGrade, student, subject);
    }

    public void showReport() {
        double[][] gradeArray = generateArray();
        showGradeTable(gradeArray);
        showStudentsAverage(gradeArray);
        showSubjectsAverage(gradeArray);
        showHighestGrade(gradeArray);
    }

}
