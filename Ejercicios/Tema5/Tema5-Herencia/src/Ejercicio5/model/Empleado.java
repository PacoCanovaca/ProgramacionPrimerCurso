package Ejercicio5.model;

public abstract class Empleado {

    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void mostrarDatos(String puesto) {
        System.out.printf("Empleado: %s%n", nombre);
        System.out.printf("Puesto: %s%n", puesto);
        System.out.printf("Salario base: %.2f€%n", salarioBase);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
