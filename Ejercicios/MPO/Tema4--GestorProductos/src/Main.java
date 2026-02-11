import controller.GestorProductos;
import model.Producto;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        GestorProductos gestorProductos = new GestorProductos();

        gestorProductos.agregarProducto(new Producto("Monitor Gaming", "Periféricos", "MON-001", 199.99));
        gestorProductos.agregarProducto(new Producto("Teclado Mecánico", "Periféricos", "MON-001", 85.50));
        gestorProductos.agregarProducto(new Producto("Ratón Óptico", "Periféricos", "RAT-003", 45.00));
        gestorProductos.agregarProducto(new Producto("Alfombrilla XL", "Accesorios", "ALF-004"));
        gestorProductos.agregarProducto(new Producto("Soporte Cascos", "Accesorios", "SOP-005"));

        gestorProductos.mostrarProductos();

        gestorProductos.asignarPrecios();
        gestorProductos.mostrarProductos();

        double precioMedio = gestorProductos.calcularPrecioMedio();
        System.out.printf("El precio medio de los productos es %.2f€%n%n", precioMedio);

        long cantidadProductosCaros = gestorProductos.getNumeroProductosCaros(50);
        System.out.printf("Hay %d productos más caros que 50%n%n", cantidadProductosCaros);

        List<Producto> productosCaros = gestorProductos.getProductosCaros(50);
        System.out.println("Los productos caros son:\n");
        productosCaros.forEach(Producto::mostrarDatos);

        Optional<Producto> productoBuscado = gestorProductos.buscarPorCodigo("RAT-003");
        productoBuscado.ifPresentOrElse(Producto::mostrarDatos, () -> System.out.println("Producto no encontrado\n"));

        gestorProductos.ordenarPorPrecioDesc();
        gestorProductos.mostrarProductos();

        Predicate<Producto> condicion = producto -> producto.getPrecio()>50;
        List<Producto> productosFiltrados = gestorProductos.getProductosPorCondicion(condicion);
        productosFiltrados.forEach(Producto::mostrarDatos);

    }

}
