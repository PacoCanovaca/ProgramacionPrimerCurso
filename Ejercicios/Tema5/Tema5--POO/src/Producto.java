import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio + "€" +
                ", cantidad=" + cantidad +
                '}';
    }
}
