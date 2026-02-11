package model;

public class Producto {

    private String nombre, categoria, codigo;
    private double precio;

    public Producto(){}

    public Producto(String nombre, String categoria, String codigo, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.codigo = codigo;
        this.precio = precio;
    }

    public Producto(String nombre, String categoria, String codigo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.codigo = codigo;
        precio = -1;
    }

    public void mostrarDatos() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Categoría : " + categoria);
        System.out.println("Código: " + codigo);
        System.out.printf("Precio: %.2f€%n%n", precio);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
