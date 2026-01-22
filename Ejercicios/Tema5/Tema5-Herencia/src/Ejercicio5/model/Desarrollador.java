package Ejercicio5.model;

public class Desarrollador extends Empleado {

    private String lenguajePrincipal;

    public Desarrollador(String nombre, double salarioBase, String lenguajePrincipal) {
        super(nombre, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public void mostrarDatos(String puesto) {
        super.mostrarDatos(puesto);
        System.out.printf("Lenguaje principal: %s%n", lenguajePrincipal);
    }
}
