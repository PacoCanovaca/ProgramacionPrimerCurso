package Ejercicio10;

public class Main {
    static void main() {
        String[] productos = {"Camiseta", "Yogur", "Colacao", "Patatas fritas", "Hamburguesa"};
        int[] cantidades = {2, 54, 8, 15, 19};
        int[] stocks = {10, 90, 10, 12, 20};
        double[] precios = {5.5, 0.1, 2, 3.5, 3};

        OrderManagement orderManagement = new OrderManagement();
        double purchaseCost = orderManagement.processOrder(productos, cantidades, stocks, precios);
        System.out.printf("%nPrecio total de la compra: %.2f€%n", purchaseCost);
    }
}
