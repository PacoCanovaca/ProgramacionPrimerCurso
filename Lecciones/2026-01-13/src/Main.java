import model.Alumno;
import model.Persona;
import model.Profesor;

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
    }
}
