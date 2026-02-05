package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Alumno {

    private String nombre;
    private double notaTeorica, notaPractica;

    public Alumno(String nombre, double notaTeorica, double notaPractica) {
        this.nombre = nombre;
        this.notaTeorica = notaTeorica;
        this.notaPractica = notaPractica;
    }

}
