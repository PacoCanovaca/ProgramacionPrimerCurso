package Ejercicio9;

import Ejercicio9.controller.GestorUsuarios;

import java.util.Scanner;

public class MainUsuarios {

    static void main() {

        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-- MENÚ --\n\t1. Añadir usuario\n\t2. Listar usuarios\n\t3. Exportar usuarios\n\t4. Importar usuarios\n\t0. Salir");
            System.out.print("Introduce tu opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Introduce el apellido: ");
                    String apellido = scanner.next();
                    System.out.print("Introduce el DNI: ");
                    String dni = scanner.next();
                    gestorUsuarios.agregarUsuario(nombre, apellido, dni);
                }
                case 2 -> gestorUsuarios.listarUsuarios();
                case 3 -> {
                    System.out.print("Introduce la ruta del archivo: ");
                    String path = scanner.next();
                    gestorUsuarios.exportarUsuarios(path);
                }
                case 4 -> {
                    System.out.print("Introduce la ruta del archivo: ");
                    String path = scanner.next();
                    gestorUsuarios.importarUsuarios(path);
                }
                case 0 -> System.out.println("Saliendo...");
            }
        } while (opcion != 0);

        scanner.close();
    }

}
