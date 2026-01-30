package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class ElementoMultimedia {
    private int id;
    private String titulo, formato;
    private double tamanio;

    public ElementoMultimedia() {}

    public ElementoMultimedia(String titulo, String formato, double tamanio) {
        this.titulo = titulo;
        this.formato = formato;
        this.tamanio = tamanio;
    }

    public void mostrarDatos() {
        System.out.println("id = " + id);
        System.out.println("Título = " + titulo);
        System.out.println("Formato = " + formato);
        System.out.println("Tamaño = " + tamanio + "MB");
    }

}
