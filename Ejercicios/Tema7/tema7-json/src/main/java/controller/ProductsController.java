package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Product;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ProductsController {

    private final List<Product> listaProductos;
    private Product productoEncontrado;

    public ProductsController() {
        listaProductos = new ArrayList<>();
    }

    public void importarProductos() {
        try {
            URL url = new URL("https://dummyjson.com/products");
            ObjectMapper objectMapper = new ObjectMapper();
            for (int i = 1; i <= 5; i++) {
                URL urlProducto = new URL(url + "/" + i);
                listaProductos.add(objectMapper.readValue(urlProducto, Product.class));
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void buscarProducto(long id) {
        try {
            URL url = new URL("https://dummyjson.com/products/" + id);
            ObjectMapper objectMapper = new ObjectMapper();
            productoEncontrado = objectMapper.readValue(url, Product.class);
            productoEncontrado.mostrarDatos2();
        } catch (MalformedURLException e) {
            System.out.println("Producto no encontrado");
        } catch (FileNotFoundException e) {
            System.out.println("Producto no encontrado");
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void buscarProductoPorId(long id) {
        for (Product producto : listaProductos) {
            if (producto.getId() == id) {
                producto.mostrarDatos2();
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }

    public void mostrarInfoProductos() {
        listaProductos.forEach(Product::mostrarDatos1);
    }

}
