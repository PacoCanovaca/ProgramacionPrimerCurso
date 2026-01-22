package Ejercicio5.model;

public class Gerente extends Empleado {

    private double bonus;

    public Gerente(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public void mostrarDatos(String puesto) {
        super.mostrarDatos(puesto);
        System.out.printf("Bonus: %.2f€%n", bonus);
        System.out.printf("Salario total: %.2f€%n%n", super.getSalarioBase() + bonus);
    }
}
