public class Ejercicio2 {
    public static void main(String[] args) {
        // Modificando el valor de la variable puntuación
        int puntuacion = 0;
        System.out.println("Puntuación inicial: " + puntuacion);
        puntuacion += 5;
        System.out.println("Después de primera modificación: " + puntuacion);
        puntuacion += 5;
        System.out.println("Después de segunda modificación: " + puntuacion);
        puntuacion += 5;
        System.out.println("Puntuación final: " + puntuacion);

        // Creando una variable para cada modificación de la puntuación
        int puntuacion2 = 0;
        int primeraModificacion = puntuacion2 + 5;
        int segundaModificacion = primeraModificacion + 5;
        int puntuacionFinal = segundaModificacion + 5;
        System.out.println("Puntuación inicial: " + puntuacion2);
        System.out.println("Después de primera modificación: " + primeraModificacion);
        System.out.println("Después de segunda modificación: " + segundaModificacion);
        System.out.println("Puntuación final: " + puntuacionFinal);
    }
}
