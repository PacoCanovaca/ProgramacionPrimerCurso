package Ejercicio2;

public class Calculator {

    public double ivaPrice(double price, int iva){
        return ((double)iva / 100) * price;
    }

    public double totalPrice(double price, int iva){
        return ivaPrice(price, iva) + price;
    }

}
