package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Product;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ProductsController {

    private final List<Product> listaProductos;

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

    public void mostrarInfoProductos() {
        listaProductos.forEach(Product::mostrarDatos);
    }

}
