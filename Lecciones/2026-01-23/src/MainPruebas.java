import model.Alumno;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class MainPruebas {
    static void main() {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno("Borja", "Martín", "1234A", 8);
        Alumno alumno2 = new Alumno("María", "López", "2345A");
        Alumno alumno3 = new Alumno("Juan", "Gómez", "3456A");
        Alumno alumno4 = new Alumno("Pepe", "Jimenez", "4567B");
        Alumno alumno5 = new Alumno("Laura", "Gomez", "5678B");

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);

        alumnos.forEach(element -> {
            System.out.println("Vamos a imprimir los datos de " + element.getNombre());
            element.mostrarDatos();
        });

        // alumnos.forEach(Alumno::mostrarDatos);

        alumnos.stream().map(Alumno::getNota).forEach(System.out::println);
        alumnos.stream()
                .map(Alumno::getNota)
                .forEach(nota -> System.out.println(nota*2));

        BiFunction<Integer, Integer, Integer> funcionMulti = (p1, p2) -> p1*p2;
        /*
        public int suma(int p1, int p2) {
            return p1 * p2;
        }
         */

        System.out.println(funcionMulti.apply(2, 4));

    }
}
