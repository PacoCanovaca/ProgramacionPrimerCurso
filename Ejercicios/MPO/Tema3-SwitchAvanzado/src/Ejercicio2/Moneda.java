package Ejercicio2;

public enum Moneda {
    DOLAR(1.16), LIBRA(0.88), YEN(179.71), PESO(21.27);

    double conversionEuros;

    Moneda(double conversion) {
        conversionEuros = conversion;
    }
}
