package Ejercicio9;

import java.util.Scanner;

public class Grade {
    public void getGrade(int studentsNum) {
        Scanner scanner = new Scanner(System.in);
        int student = 1;
        String report = "--- REPORTE DE CALIFICACIONES ---";
        while (student <= studentsNum) {
            System.out.printf("Introduce la nota del estudiante %d (0-10): ", student);
            int number = scanner.nextInt();
            report += "\nEstudiante " + student + ": " + number + " puntos = Calificación ";
            switch (number) {
                case 0, 1, 2:
                    report += "F";
                    break;
                case 3, 4:
                    report += "D";
                    break;
                case 5, 6:
                    report += "C";
                    break;
                case 7, 8:
                    report += "B";
                    break;
                case 9, 10:
                    report += "A";
            }
            student++;
        }
        System.out.println(report);


        scanner.close();
    }
}
