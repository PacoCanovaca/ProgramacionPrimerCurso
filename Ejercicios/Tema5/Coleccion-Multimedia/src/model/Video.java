package model;

import lombok.Getter;

@Getter

public class Video extends ElementoMultimedia {

    private String director;
    private String[] actores;

    public Video(){}

    public Video(String titulo, String formato, double tamanio, String director, String[] actores) {
        super(titulo, formato, tamanio);
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director = " + director);
        System.out.println("Actores =");
        for (int i = 0; i < actores.length; i++) {
            System.out.println("\t" + (i+1) + ". " + actores[i]);
        }
        System.out.println();
    }
}
