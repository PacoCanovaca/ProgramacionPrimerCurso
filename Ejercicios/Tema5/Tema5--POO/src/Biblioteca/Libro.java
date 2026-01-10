package Biblioteca;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Libro {
    private String titulo, autor, ISBN;
    private boolean disponible;



}
