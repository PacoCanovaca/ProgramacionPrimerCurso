package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public abstract class Llamada {
    private long nOrigen, nDestino;
    private int duracion;
    private double coste;

    public Llamada(){}

    public Llamada(long nOrigen, long nDestino, int duracion) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
        // coste = 0 por defecto
    }

    public void mostrarDatos() {
        System.out.println("nOrigen = " + nOrigen);
        System.out.println("nDestino = " + nDestino);
        System.out.println("duracion = " + duracion);
        System.out.println("coste = " + coste);
    }

}
