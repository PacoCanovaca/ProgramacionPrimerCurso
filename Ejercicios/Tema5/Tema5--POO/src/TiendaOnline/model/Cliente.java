package TiendaOnline.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;

@Getter

public class Cliente {
    private String nombre, email;
    private final ArrayList<Producto> carrito = new ArrayList<Producto>();
    private final HashMap<String, Integer> cantidades = new HashMap<String, Integer>();

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

}
