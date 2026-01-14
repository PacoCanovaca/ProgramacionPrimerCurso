import model.Alumno;
import model.Persona;
import model.Profesor;

import java.util.ArrayList;

public class Main {
    static void main() {
        System.out.println("Bienvenido al gestor escolar");
        /* Persona borja = new Persona("Borja", "Martín");
        borja.saludar();
        borja.mostrarDatos(); */

        Alumno alumno = new Alumno("Borja", "Martín", 1234, "DAM");
        /* alumno.setNombre("Borja");
        alumno.setApellido("Martín");
        alumno.setCurso("DAM");
        alumno.setnMatricula(1234);*/
        alumno.mostrarDatos();
        alumno.realizarExamen();

        Profesor profesor = new Profesor("María", "López", 30000, 6);
        profesor.saludar();
        profesor.mostrarDatos();

        Alumno alumno1 = new Alumno("Borja1", "Martín", 1234, "DAM");
        Alumno alumno2 = new Alumno("Borja2", "Martín", 1234, "DAM");
        Alumno alumno3 = new Alumno("Borja3", "Martín", 1234, "DAM");
        Alumno alumno4 = new Alumno("Borja4", "Martín", 1234, "DAM");
        Profesor profesor1 = new Profesor("María1", "López", 30000, 6);
        Profesor profesor2 = new Profesor("María2", "López", 30000, 6);
        Profesor profesor3 = new Profesor("María3", "López", 30000, 6);
        Profesor profesor4 = new Profesor("María4", "López", 30000, 6);

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);
        listaPersonas.add(alumno3);
        listaPersonas.add(alumno4);
        listaPersonas.add(profesor1);
        listaPersonas.add(profesor2);
        listaPersonas.add(profesor3);
        listaPersonas.add(profesor4);

        for (Persona persona : listaPersonas) {
            persona.saludar();
            persona.mostrarDatos();
            if (persona instanceof Alumno) {
                ((Alumno) persona).realizarExamen();
            } else if (persona instanceof Profesor) {
                ((Profesor) persona).corregirExamen();

            }
        }
    }
}
