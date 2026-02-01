import controller.Gestor;
import model.Alumno;

public class Main {
    static void main() {

        Gestor gestor = new Gestor();
        gestor.agregarAlumno(new Alumno("Alumno1", "Alumno1", "123A", 5));
        gestor.agregarAlumno(new Alumno("Alumno1", "Alumno1", "123A"));
        gestor.agregarAlumno(new Alumno("Alumno2", "Alumno2", "435B", 8));
        gestor.agregarAlumno(new Alumno("Alumno3", "Alumno3", "832C"));
        gestor.agregarAlumno(new Alumno("Alumno4", "Alumno4", "666C"));
        gestor.mostrarAlumnos();
        gestor.calificarAlumnos();
        gestor.mostrarAlumnos();
        gestor.calcularMedia();

    }
}
