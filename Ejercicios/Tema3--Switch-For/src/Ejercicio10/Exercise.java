package Ejercicio10;

public class Exercise {

    public String getExercise(int exNumber) {

        switch (exNumber) {
            case 1 -> {
                return "Flexiones";
            }
            case 2 -> {
                return "Abdominales";
            }
            case 3 -> {
                return "Sentadillas";
            }
            default -> {
                return "Error. Has introducido un valor inadecuado";
            }
        }

    }

    public void doReps(int repsNumber) {

        for (int i = 1; i <= repsNumber; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Repetición %d completada%n", i);


        }

    }

}
