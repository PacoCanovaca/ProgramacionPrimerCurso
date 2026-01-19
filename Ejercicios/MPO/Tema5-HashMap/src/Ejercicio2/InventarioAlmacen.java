package Ejercicio2;

import java.util.*;

public class InventarioAlmacen {

    private final HashMap<String, Integer> inventario = new HashMap<>();

    public InventarioAlmacen() {};

    public void agregarProducto(String codigo, int cantidad) {
        if (!inventario.containsKey(codigo)) {
            System.out.printf("Producto añadido: %s - %d unidades%n", codigo, cantidad);
        } else {
            System.out.printf("Producto actualizado: %s - %d unidades%n", codigo, cantidad);
        }
        inventario.put(codigo, cantidad);
    }

    public boolean venderProducto(String codigo, int cantidad) {
        int cantidadActual = inventario.get(codigo);
        if (cantidadActual > cantidad) {
            inventario.put(codigo, (cantidadActual - cantidad));
            System.out.printf("Venta de %d unidades de producto %s%nVenta realizada. Stock restante: %d%n%n", cantidad, codigo, inventario.get(codigo));
            return true;
        } else {
            System.out.printf("Venta de %d unidades de producto %s%nLa venta no es posible. Sólo quedan %d unidades actualmente%n%n", cantidad, codigo, cantidadActual);
            return false;
        }
    }

    public Integer consultarStock(String codigo) {
        return inventario.get(codigo);
    }

    public void listarInventario() {
        System.out.println("Inventario actual");
        for (String producto: inventario.keySet()) {
            System.out.printf("%s - %s unidades%n", producto, inventario.get(producto));
        }
        System.out.println();
    }

    public void listarProductosBajoStock(int minimo) {
        System.out.printf("Productos con bajo stock (menos de %d productos)%n", minimo);
        for (String producto: inventario.keySet()) {
            if (inventario.get(producto) < minimo) {
                System.out.printf("%s - %s unidades%n", producto, inventario.get(producto));
            }
        }
        System.out.println();
    }

    public int calcularStockTotal() {
        int total = 0;
        for (String producto: inventario.keySet()) {
            total += inventario.get(producto);
        }
        return total;
    }

    public String productoConMasStock() {
        int mayorStock = 0;
        String productoMayorStock = null;
        for (String producto: inventario.keySet()) {
            if (inventario.get(producto) > mayorStock) {
                mayorStock = inventario.get(producto);
                productoMayorStock = producto;
            }
        }
        return "El producto con más stock es " + productoMayorStock;
    }

}
