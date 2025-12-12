package model;

public class Coche {
    private String marca, modelo, bastidor, color;
    private int cv, velocidad;
    private double precio;

    public Coche() {}

    public Coche(String marca, String modelo, String bastidor, String color, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
        this.color = color;
        this.cv = cv;
        this.precio = 2000.00;
    }

    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getCv() {
        return cv;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getBastidor() {
        return bastidor;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCv(int cv) {
        this.cv += cv;
    }

    public String toString() {
        return super.toString();
    }

}
