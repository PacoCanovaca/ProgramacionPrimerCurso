import controller.ProductsController;
import model.UserController;

public class Main {

    public static void main(String[] args) {

        /* Ejercicio 1

        UserController userController = new UserController();
        userController.importUser();
        userController.printUserInfo();

         */

        ProductsController productsController = new ProductsController();
        productsController.importarProductos();
        productsController.mostrarInfoProductos();

    }

}
