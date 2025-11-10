package Ejercicio10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("--- EJERCICIOS ---%n1. Flexiones%n2. Abdominales%n3. Sentadillas%nElige un ejercicio (1-3): ");
        int exerciseNum = scanner.nextInt();
        System.out.print("¿Cuántas repeticiones?: ");
        int reps = scanner.nextInt();

        Exercise exercise = new Exercise();
        String exerciseName = exercise.getExercise(exerciseNum);
        System.out.printf("Has elegido: %s%n", exerciseName);
        exercise.doReps(reps);
        System.out.printf("¡Ejercicio completado! Has hecho %d %s.", reps, exerciseName.toLowerCase());

        scanner.close();

    }

}
