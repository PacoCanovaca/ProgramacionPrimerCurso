import controller.ControladorColeccion;
import model.ElementoMultimedia;
import model.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ControladorColeccion controladorColeccion = new ControladorColeccion();
        int opcion;
        do {
            System.out.println("-- MENÚ --\n\t1. Registrar elemento\n\t2. Eliminar elemento\n\t3. Listar colección\n\t4. Buscar libros por autor\n\t5. Buscar películas por director\n\t6. Buscar películas por actor\n\t0. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> controladorColeccion.registrarElemento();
                case 2 -> controladorColeccion.eliminarElemento();
                case 3 -> controladorColeccion.listarElementos();
                case 4 -> controladorColeccion.buscarPorAutor();
                case 5 -> controladorColeccion.buscarPorDirector();
                case 6 -> controladorColeccion.buscarPorActor();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no contemplada\n");
            }
        } while (opcion != 0);

    }

}
