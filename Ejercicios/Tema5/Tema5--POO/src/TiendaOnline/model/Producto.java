package TiendaOnline.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Producto {
    private String codigo, nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = Math.max(0, stock);
    }
}


