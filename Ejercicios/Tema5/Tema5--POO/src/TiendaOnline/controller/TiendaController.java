package TiendaOnline.controller;

import TiendaOnline.model.Producto;
import TiendaOnline.model.Tienda;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TiendaController {

    // Buscar código en la tienda

    private static boolean estaCodigo(String codigo, Tienda tienda) {
        for (Producto producto : tienda.getListaProductos()) {
            if (producto == null) {
                continue;
            }
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }

    // Añadir producto a la tienda
    private static void anadirProducto(Scanner scanner, Tienda tienda, int posicion) {
        System.out.print("Código del producto: ");
        String codigo;
        do {
            codigo = scanner.next();
            if (estaCodigo(codigo, tienda)) {
                System.out.print("El código introducido ya está asignado a un producto. Introduce otro código: ");
            }
        } while (estaCodigo(codigo, tienda));
        System.out.print("Nombre del producto: ");
        String nombre = scanner.next();
        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Stock del producto: ");
        int stock = scanner.nextInt();
        tienda.getListaProductos()[posicion] = new Producto(codigo, nombre, precio, stock);
        System.out.println("¡Producto añadido con éxito!\n");
    }

    // Mostrar productos
    protected static void mostrarProductos(Tienda tienda) {
        System.out.println("--Lista de productos disponibles--");
        for (Producto producto : tienda.getListaProductos()) {
            System.out.printf("- %s (%d) | Código: %s%n", producto.getNombre(), producto.getStock(), producto.getCodigo());
        }
        System.out.println();
    }

    // Gestionar tienda
    public static Tienda crearTienda(Scanner scanner) {
        System.out.println("--Creación Tienda--");
        System.out.print("¿Cuántos productos hay en la tienda?: ");
        int productos = scanner.nextInt();
        Tienda tienda = new Tienda(new Producto[productos]);
        System.out.println();
        for (int i = 0; i < tienda.getListaProductos().length; i++) {
            System.out.printf("Producto %d:%n", i+1);
            anadirProducto(scanner, tienda, i);
        }
        System.out.println("¡Tienda creada!\n");
        return tienda;
    }

}
