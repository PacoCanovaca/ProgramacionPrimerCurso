package controller;

import lombok.Getter;
import model.Alumno;

import java.util.ArrayList;
import java.util.function.*;

@Getter

public class GestorNotas {

    private final ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public BiFunction<Double, Double, Double> calcularNotaFinal = (t, p) -> (t * 0.6) + (p * 0.4);

    public Predicate<Double> estaAprobado = n -> n >= 5;

    public Function<Double, String> convertirALetra = n -> {
        if (n < 3) {
            return "F";
        } else if (n >= 3 && n < 5) {
            return "D";
        } else if (n >= 5 && n < 7) {
            return "C";
        } else if (n >= 7 && n < 9) {
            return "B";
        } else {
            return "A";
        }
    };

    public Consumer<Alumno> imprimirInforme = alumno -> {
        double notaFinal = calcularNotaFinal.apply(alumno.getNotaTeorica(), alumno.getNotaPractica());
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Nota teórica: " + alumno.getNotaTeorica());
        System.out.println("Nota práctica: " + alumno.getNotaPractica());
        System.out.println("Nota final: " + notaFinal);
        System.out.println("¿Está aprobado?: " + (estaAprobado.test(notaFinal) ? "Si" : "No"));
        System.out.println("Nota en formato letra: " + convertirALetra.apply(notaFinal));
        System.out.println();
    };

    public void listarAlumnos() {
        String aprobados = "";
        String suspensos = "";
        for (Alumno alumno : listaAlumnos) {
            double notaFinal = calcularNotaFinal.apply(alumno.getNotaTeorica(), alumno.getNotaPractica());
            if (estaAprobado.test(notaFinal)) {
                aprobados += (alumno.getNombre() + ". ");
            } else {
                suspensos += (alumno.getNombre() + ". ");
            }
        }
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos suspensos: " + suspensos);
    }

}
