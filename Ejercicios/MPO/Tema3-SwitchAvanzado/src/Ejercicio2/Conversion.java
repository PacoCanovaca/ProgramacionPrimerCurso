package Ejercicio2;

public class Conversion {
    public void hacerConversion(double cantidadEuros, int monedaCambio) {
        Moneda dolar = Moneda.DOLAR;
        double conversionDolar = dolar.conversionEuros;
        Moneda libra = Moneda.LIBRA;
        double conversionLibra = libra.conversionEuros;
        Moneda yen = Moneda.YEN;
        double conversionYen = yen.conversionEuros;
        Moneda peso = Moneda.PESO;
        double conversionPeso = peso.conversionEuros;

        switch (monedaCambio) {
            case 1 -> {
                System.out.printf("%.2f euros son %.2f dólares", cantidadEuros, cantidadEuros*conversionDolar);
            }
            case 2 -> {
                System.out.printf("%.2f euros son %.2f libras", cantidadEuros, cantidadEuros*conversionLibra);
            }
            case 3 -> {
                System.out.printf("%.2f euros son %.2f yenes", cantidadEuros, cantidadEuros*conversionYen);
            }
            case 4 -> {
                System.out.printf("%.2f euros son %.2f pesos", cantidadEuros, cantidadEuros*conversionPeso);
            }
        }
    }
}
