package model;

public class Audio extends ElementoMultimedia {

    private int duracionSegundos;
    private String soporte;

    public Audio(){}

    public Audio(String titulo, String formato, double tamanio, int duracionSegundos, String soporte) {
        super(titulo, formato, tamanio);
        this.duracionSegundos = duracionSegundos;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duración = " + duracionSegundos + " segundos");
        System.out.println("Soporte = " + soporte);
        System.out.println();
    }
}
