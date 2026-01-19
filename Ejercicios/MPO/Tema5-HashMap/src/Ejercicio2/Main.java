package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        InventarioAlmacen inventarioAlmacen = new InventarioAlmacen();

        System.out.println("Sistema de Inventario");
        System.out.println("=====================");

        inventarioAlmacen.agregarProducto("PROD001", 50);
        inventarioAlmacen.agregarProducto("PROD002", 30);
        inventarioAlmacen.agregarProducto("PROD003", 15);

        System.out.println("\nStock total: " + inventarioAlmacen.calcularStockTotal() + " unidades\n");

        inventarioAlmacen.venderProducto("PROD001", 20);

        inventarioAlmacen.listarProductosBajoStock(20);

        System.out.println(inventarioAlmacen.productoConMasStock());

        inventarioAlmacen.listarInventario();

    }

}
