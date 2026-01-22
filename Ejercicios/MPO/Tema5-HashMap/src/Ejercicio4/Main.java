package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de calificaciones");
        System.out.println("=========================");

        SistemaCalificaciones sistema = new SistemaCalificaciones();
        sistema.agregarEstudiante("Ana");
        sistema.agregarEstudiante("Carlos");
        sistema.agregarEstudiante("María");

        sistema.agregarCalificacion("Ana", 8.5);
        sistema.agregarCalificacion("Ana", 9.0);
        sistema.agregarCalificacion("Ana", 7.5);
        sistema.agregarCalificacion("Carlos", 6);
        sistema.agregarCalificacion("Carlos", 7);
        sistema.agregarCalificacion("Carlos", 6.5);
        sistema.agregarCalificacion("María", 9.5);
        sistema.agregarCalificacion("María", 9);
        sistema.agregarCalificacion("María", 10);

        sistema.mostrarCalificaciones("Ana");
        sistema.mostrarCalificaciones("Carlos");
        sistema.mostrarCalificaciones("María");

        sistema.mejorEstudiante();

        sistema.listarEstudiantesAprobados(7);

        System.out.printf("Promedio general de la clase: %.2f%n", sistema.promedioGeneral());


    }

}
