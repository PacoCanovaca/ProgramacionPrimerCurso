package model;

import lombok.Getter;

@Getter

public class Libro extends ElementoMultimedia {

    private String autor, isbn;
    private int paginas;

    public Libro(){};

    public Libro(String titulo, String formato, double tamanio, String autor, String isbn, int paginas) {
        super(titulo, formato, tamanio);
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Autor = " + autor);
        System.out.println("ISBN = " + isbn);
        System.out.println("Número de páginas = " + paginas);
        System.out.println();
    }
}
