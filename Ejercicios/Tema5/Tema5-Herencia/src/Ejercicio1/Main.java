package Ejercicio1;

import Ejercicio1.model.Gato;
import Ejercicio1.model.Perro;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Rex", 5);
        Gato gato = new Gato("Mishi", 3);

        perro.mostrarDatos();
        perro.hacerSonido();

        gato.mostrarDatos();
        gato.hacerSonido();

    }
}
