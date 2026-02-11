package controller;

import model.Producto;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class GestorProductos {

    private final ArrayList<Producto> listaProductos = new ArrayList<>();

    public GestorProductos() {}

    public void agregarProducto(Producto producto) {
        if (listaProductos.stream().anyMatch(prod -> prod.getCodigo().equals(producto.getCodigo()))) {
            System.out.println("El producto no ha podido ser añadido. Ya existe el código asignado.\n");
        } else {
            listaProductos.add(producto);
            System.out.println("El producto ha sido añadido con éxito.\n");
        }
    }

    public void asignarPrecios() {
        listaProductos.forEach(prod -> {
            if (prod.getPrecio() < 0) {
                prod.setPrecio(Math.random() * 100);
            }
        });
    }

    public void mostrarProductos() {
        listaProductos.forEach(Producto::mostrarDatos);
    }

    public double calcularPrecioMedio() {
        List<Double> precios = listaProductos.stream().map(Producto::getPrecio).toList();
        return precios.stream().mapToDouble(Double::doubleValue).sum() / precios.size();
    }

    public long getNumeroProductosCaros(double limite) {
        long[] productosCaros = new long[]{0};
        listaProductos.forEach(producto -> {
            if (producto.getPrecio() > limite) {
                productosCaros[0] += 1;
            }
        });
        return productosCaros[0];
    }

    public List<Producto> getProductosCaros(double limite) {
        return listaProductos.stream().filter(producto -> producto.getPrecio() > limite).toList();
    }

    public Optional<Producto> buscarPorCodigo(String codigo) {
        return listaProductos.stream().filter(producto -> producto.getCodigo().equalsIgnoreCase(codigo)).findFirst();
    }

    public void ordenarPorPrecioDesc() {
        listaProductos.sort(Comparator.comparingDouble(Producto::getPrecio));
    }

    public List<Producto> getProductosPorCondicion(Predicate<Producto> condicion) {
        return listaProductos.stream().filter(condicion).toList();
    }

}
