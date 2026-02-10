package model;

import util.EdadInvalidaExcepcion;

public class Ejercicios {

    public Ejercicios() {}

    public int dividir(int num1, int num2) throws ArithmeticException{
        return num1 / num2; // Hago el resultado en entero porque si fuera double, Java devolvería Infinity como resultado
    }

    public int transformarTextoANumero(String num) throws NumberFormatException{
        return Integer.parseInt(num);
    }

    public void validarEdad(int edad) throws EdadInvalidaExcepcion {
        if (edad < 0) {
            throw new EdadInvalidaExcepcion("Error: La edad no puede ser negativa.");
        } else if (edad > 120) {
            throw new EdadInvalidaExcepcion("Error: La edad no puede ser mayor a 120.");
        }
    }

}
