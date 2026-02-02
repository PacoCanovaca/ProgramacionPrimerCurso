import Ejercicios.Funciones;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Funciones funciones = new Funciones();

        /* Ejercicio 1
        System.out.println(funciones.cuadrado.apply(1));
        System.out.println(funciones.cuadrado.apply(2));
        System.out.println(funciones.cuadrado.apply(3));
        System.out.println(funciones.cuadrado.apply(4));
        System.out.println(funciones.cuadrado.apply(5));
        */

        /* Ejercicio 2
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.print("Lista original:");
        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 21));
            System.out.print(" " + numeros.get(i));
        }
        System.out.print("\nLista de pares:");
        numeros.forEach(item -> {
            if (funciones.esPar.test(item)) {
                System.out.print(" " + item);
            }
        });
        */

        /* Ejercicio 3
        System.out.println(funciones.suma.apply(5, 2));
        System.out.println(funciones.resta.apply(5, 2));
        System.out.println(funciones.multiplicacion.apply(5, 2));
        System.out.println(funciones.division.apply(5, 2));
        */

        /* Ejercicio 4
        System.out.println(funciones.tieneMismaLongitud.test("patata", "circo"));
        System.out.println(funciones.tieneMismaLongitud.test("coche", "fuego"));
        System.out.println(funciones.tieneMismaLongitud.test("botella", "willy11"));
        System.out.println(funciones.tieneMismaLongitud.test("roca", "piedra"));
        */

        /* Ejercicio 5
        funciones.impresion.accept("Paco", 28);
        */


    }

}
