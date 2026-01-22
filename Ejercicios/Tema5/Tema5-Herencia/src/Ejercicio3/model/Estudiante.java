package Ejercicio3.model;

public class Estudiante extends Persona {

    private int curso;

    public Estudiante(String nombre, int edad, int curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.printf("Estoy estudiando %dº de DAM%n%n", curso);
    }
}
