package model;

public class Profesor extends Persona {
    private int nExperiencia, salario;

    public Profesor() {}

    public Profesor(String nombre, String apellido, int salario) {
        super(nombre, apellido);
        this.salario = salario;
        //Profesor sin experiencia, automáticamenete nExperiencia = 0
    }

    public Profesor(String nombre, String apellido, int salario, int nExperiencia) {
        super(nombre, apellido);
        this.salario = salario;
        this.nExperiencia = nExperiencia;
    }

    public void corregirExamen() {

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("salario = " + salario);
        System.out.println("nExperiencia = " + nExperiencia);
    }

    @Override
    public void saludar() {
        System.out.println("Soy un profesor y voy a enseñarte");
    }

    public int getnExperiencia() {
        return nExperiencia;
    }

    public void setnExperiencia(int nExperiencia) {
        this.nExperiencia = nExperiencia;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
