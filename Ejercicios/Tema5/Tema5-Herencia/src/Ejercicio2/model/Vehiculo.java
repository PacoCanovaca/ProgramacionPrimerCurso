package Ejercicio2.model;

public class Vehiculo {

    private String marca, modelo;

    public Vehiculo() {}

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDatos() {
        System.out.printf("Vehículo: %s %s%n", marca, modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
