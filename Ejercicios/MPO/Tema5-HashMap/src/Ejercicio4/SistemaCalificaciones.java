package Ejercicio4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class SistemaCalificaciones {

    private final HashMap<String, ArrayList<Double>> calificaciones = new HashMap<>();

    public SistemaCalificaciones() {}

    public void agregarEstudiante(String nombre) {
        calificaciones.put(nombre, new ArrayList<>());
        System.out.printf("Estudiante agregado: %s%n%n", nombre);
    }

    public void agregarCalificacion(String nombre, double calificacion) {
        calificaciones.get(nombre).add(calificacion);
    }

    public double calcularPromedio(String nombre) {
        double suma = 0;
        ArrayList<Double> notasAlumno = calificaciones.get(nombre);
        for (double nota : notasAlumno) {
            suma += nota;
        }
        return suma / notasAlumno.size();
    }

    public void mostrarCalificaciones(String nombre) {
        ArrayList<Double> notasAlumno = calificaciones.get(nombre);
        String notas = "[";
        if (notasAlumno.isEmpty()) {
            System.out.println("El alumno introducido no tiene aún ninguna calificación\n");
            return;
        }
        for (int i = 0; i < notasAlumno.size(); i++) {
            double nota = notasAlumno.get(i);
            if (i + 1 == notasAlumno.size()) {
                notas += nota + "]";
            } else {
                notas += nota + ", ";
            }
        }
        System.out.println("Notas de " + nombre + ": " + notas + "\n");
    }

    public void mejorEstudiante() {
        String mejorEstudiante = null;
        double mayorPromedio = 0;
        for (String alumno : calificaciones.keySet()) {
            if (mejorEstudiante == null) {
                mejorEstudiante = alumno;
            }
            double promedio = calcularPromedio(alumno);
            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
                mejorEstudiante = alumno;
            }
        }
        System.out.printf("Mejor estudiante: %s (%.2f)%n%n", mejorEstudiante, mayorPromedio);
    }

    public void listarEstudiantesAprobados(double notaMinima) {
        System.out.printf("Estudiantes aprobados (nota mínima %.2f):%n", notaMinima);
        for (String estudiante : calificaciones.keySet()) {
            double promedio = calcularPromedio(estudiante);
            if (promedio >= notaMinima) {
                System.out.printf("- %s: %.2f%n", estudiante, promedio);
            }
        }
        System.out.println();
    }

    public double promedioGeneral() {
        double suma = 0;
        for (String estudiante : calificaciones.keySet()) {
            suma += calcularPromedio(estudiante);
        }
        return suma / calificaciones.size();
    }

}
