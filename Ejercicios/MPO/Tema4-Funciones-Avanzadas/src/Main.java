import controller.GestorNotas;
import model.Alumno;

public class Main {

    public static void main(String[] args) {

        GestorNotas gestorNotas = new GestorNotas();

        Alumno alumno1 = new Alumno("Ana García", 8.5, 9.0);
        Alumno alumno2 = new Alumno("Luis Pérez", 4.0, 5.5);
        Alumno alumno3 = new Alumno("Marta Soler", 7.2, 6.8);
        Alumno alumno4 = new Alumno("Carlos Ruiz", 2.5, 3.0);
        Alumno alumno5 = new Alumno("Sofía Torres", 10.0, 9.5);
        Alumno alumno6 = new Alumno("Jorge Sanz", 5.0, 5.0);
        Alumno alumno7 = new Alumno("Elena Belmonte", 6.4, 8.2);
        Alumno alumno8 = new Alumno("Mario Valls", 3.8, 4.2);

        gestorNotas.getListaAlumnos().add(alumno1);
        gestorNotas.getListaAlumnos().add(alumno2);
        gestorNotas.getListaAlumnos().add(alumno3);
        gestorNotas.getListaAlumnos().add(alumno4);
        gestorNotas.getListaAlumnos().add(alumno5);
        gestorNotas.getListaAlumnos().add(alumno6);
        gestorNotas.getListaAlumnos().add(alumno7);
        gestorNotas.getListaAlumnos().add(alumno8);

        for (Alumno alumno : gestorNotas.getListaAlumnos()) {
            gestorNotas.imprimirInforme.accept(alumno);
        }

        gestorNotas.listarAlumnos();

    }

}
