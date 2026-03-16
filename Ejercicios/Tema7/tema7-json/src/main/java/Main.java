import controller.PlaceholderController;
import controller.PokemonController;
import controller.ProductsController;
import controller.TriviaController;
import model.UserController;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Ejercicio 1

        UserController userController = new UserController();
        userController.importUser();
        userController.printUserInfo();

         */

        /* Ejercicio 2
        ProductsController productsController = new ProductsController();
        productsController.importarProductos();
        productsController.mostrarInfoProductos();

         */

        /* Ejercicio 3
        Scanner scanner = new Scanner(System.in);
        ProductsController productsController = new ProductsController();
        System.out.print("Introduce el id del producto a buscar: ");
        long id = scanner.nextLong();

        Forma 1
        productsController.buscarProducto(id);

        Forma 2
        productsController.importarProductos();
        productsController.buscarProductoPorId(id);

         */

        /* Ejercicio 4

        PlaceholderController placeholderController = new PlaceholderController();
        placeholderController.printInfo();

         */

        /* Ejercicio 5

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del pokemon: ");
        String pokemon = scanner.next();
        try {
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/" + pokemon);
            PokemonController pokemonController = new PokemonController(url);
            pokemonController.mostrarDatos();
        } catch (MalformedURLException e) {
            System.out.println("El nombre de pokemon introducido es incorrecto");
        }

         */

        TriviaController triviaController = new TriviaController();
        triviaController.importarDatos();
        triviaController.mostrarDatos();

    }
}
