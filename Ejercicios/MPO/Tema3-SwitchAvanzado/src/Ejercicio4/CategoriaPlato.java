package Ejercicio4;

public enum CategoriaPlato {
    Entrada("Ensalada César", "Sopa de verduras", "Croquetas caseras"), Principal("Pollo con patatas", "Pasta carbonara", "Lasaña de verduras"), Postre("Tarta de queso", "Helado de vainilla", "Fruta de temporada"), Bebida("Agua", "Coca Cola", "Zumo de naranja");

    String opcion1;
    String opcion2;
    String opcion3;

    CategoriaPlato(String primeraOpcion, String segundaOpcion, String terceraOpcion) {
        opcion1 = primeraOpcion;
        opcion2 = segundaOpcion;
        opcion3 = terceraOpcion;
    }
}
