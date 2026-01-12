package TiendaOnline;

import TiendaOnline.controller.ClienteController;
import TiendaOnline.controller.TiendaController;
import TiendaOnline.model.Cliente;
import TiendaOnline.model.Tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tienda tienda = TiendaController.crearTienda(scanner);
        Cliente cliente = ClienteController.crearCliente(scanner);

        int opcion;
        do {
            System.out.print("--Menú de opciones--\n\t1. Añadir producto al carrito\n\t2. Eliminar producto del carrito\n\t3. Calcular el total del carrito\n\t4. Ver carrito\n\t5. Finalizar compra\n¿Qué quieres hacer?. Introduce tu opción: ");
            opcion = scanner.nextInt();
            System.out.println();
            ClienteController.gestionarCarrito(cliente, scanner, opcion, tienda);
        } while (opcion != 5);

        scanner.close();
    }
}
