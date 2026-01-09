import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Libro {
    private String titulo, autor;
    private int paginas;

    public Libro() {
        titulo = "Sin título";
        autor = "Autor desconocido";
        paginas = 0;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        paginas = 0;
    }

}
