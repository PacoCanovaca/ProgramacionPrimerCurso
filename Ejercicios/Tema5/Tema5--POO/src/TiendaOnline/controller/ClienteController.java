package TiendaOnline.controller;

import TiendaOnline.model.Cliente;
import TiendaOnline.model.Producto;
import TiendaOnline.model.Tienda;

import java.util.Scanner;

public class ClienteController {

    // Crear cliente

    public static Cliente crearCliente(Scanner scanner) {
        System.out.println("--Identificación de cliente--");
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.next();
        System.out.print("Introduce tu email: ");
        String email = scanner.next();
        System.out.println();
        return new Cliente(nombre, email);
    }

    // Mostrar carrito

    private static void mostrarCarrito(Cliente cliente) {
        System.out.println("--Carrito de compra--");
        for (Producto producto : cliente.getCarrito()) {
            System.out.printf("- %s (%d) | Código: %s", producto.getNombre(), cliente.getCantidades().get(producto.getCodigo()), producto.getCodigo());
        }
        System.out.println();
    }

    // Añadir producto al carrito

    private static void anadirProducto(Cliente cliente, Scanner scanner, Tienda tienda){
        TiendaController.mostrarProductos(tienda);
        System.out.print("Introduce el código del producto: ");
        String codigo = scanner.next();
        for (Producto producto : tienda.getListaProductos()) {
            if (producto.getCodigo().equals(codigo)) {
                System.out.print("Introduce la cantidad: ");
                int cantidad = scanner.nextInt();
                if (cantidad > producto.getStock()) {
                    System.out.println("No hay suficiente stock. Vuelve a intentarlo.\n");
                    return;
                }
                cliente.getCarrito().add(producto);
                cliente.getCantidades().put(producto.getCodigo(), cantidad);
                producto.setStock(producto.getStock() - cantidad);
                System.out.println("Producto añadido al carrito.\n");
            }
        }
        System.out.println("El código no corresponde a ningún producto.\n");
    }

    // Eliminar producto del carrito
    private static void eliminarProducto(Cliente cliente, Scanner scanner){
        mostrarCarrito(cliente);
        System.out.print("Introduce el código del producto: ");
        String codigo = scanner.next();
        for (Producto producto : cliente.getCarrito()) {
            if (producto.getCodigo().equals(codigo)) {
                System.out.println("Producto eliminado.\n");
                cliente.getCarrito().remove(producto);
                producto.setStock(producto.getStock() + cliente.getCantidades().get(producto.getCodigo()));
                cliente.getCantidades().remove(producto.getCodigo());
                return;
            }
        }
        System.out.println("No se ha encontrado el código de producto introducido en el carrito.\n");
    }

    // Calcular el total del carrito
    private static void calcularTotal(Cliente cliente) {
        double total = 0;
        for (Producto producto : cliente.getCarrito()) {
            total += (producto.getPrecio() * cliente.getCantidades().get(producto.getCodigo()));
        }
        System.out.printf("El total de la compra es de %.2f€%n", total);
    }

    // Finalizar compra

    // Gestionar carrito (switch)

    public static void gestionarCarrito(Cliente cliente, Scanner scanner, int opcion, Tienda tienda) {
        switch (opcion) {
            case 1 -> anadirProducto(cliente, scanner, tienda);
            case 2 -> eliminarProducto(cliente, scanner);
            case 3 -> calcularTotal(cliente);
            case 4 -> mostrarCarrito(cliente);
            case 5 -> System.out.println("Finalizando compra...\n✓ Compra realizada con éxito");
        }
    }
}
