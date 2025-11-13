package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la categoría de plato que quieras pedir (ENTRADA/PRINCIPAL/POSTRE/BEBIDA):");
        String categoria = scanner.next();
        System.out.println("Las opciones son: ");

        switch (categoria.toUpperCase()) {
            case "ENTRADA" -> {
                CategoriaPlato entrada = CategoriaPlato.Entrada;
                System.out.println("1. " + entrada.opcion1);
                System.out.println("2. " + entrada.opcion2);
                System.out.println("3. " + entrada.opcion3);
            }
            case "PRINCIPAL" -> {
                CategoriaPlato principal = CategoriaPlato.Principal;
                System.out.println("1. " + principal.opcion1);
                System.out.println("2. " + principal.opcion2);
                System.out.println("3. " + principal.opcion3);
            }
            case "POSTRE" -> {
                CategoriaPlato postre = CategoriaPlato.Postre;
                System.out.println("1. " + postre.opcion1);
                System.out.println("2. " + postre.opcion2);
                System.out.println("3. " + postre.opcion3);
            }
            case "BEBIDA" -> {
                CategoriaPlato bebida = CategoriaPlato.Bebida;
                System.out.println("1. " + bebida.opcion1);
                System.out.println("2. " + bebida.opcion2);
                System.out.println("3. " + bebida.opcion3);
            }
        }

        scanner.close();

    }
}
