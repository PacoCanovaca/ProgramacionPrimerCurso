package Ejercicio10;

public class OrderManagement {

    private boolean checkStock(int quantity, int stock) {
        return quantity <= stock;
    }

    private double calculateDiscount(double price, int quantity) {
        if (quantity <= 3) {
            return price;
        } else if (quantity <= 10) {
            return price * 2/3;
        } else if (quantity <= 25) {
            return price * 1/2;
        } else {
            return price * 1/3;
        }
    }

    public double processOrder(String[] products, int[] quantities, int[] stocks, double[] prices) {
        double total = 0;
        System.out.println("Imprimiendo productos:");
        for (int i = 0; i < products.length; i++) {
            String product = products[i];
            int quantity = quantities[i];
            int stock = stocks[i];
            double price = prices[i];
            String haveStock = checkStock(quantity, stock) ? "Sí" : "No";
            double discountedPrice = calculateDiscount(price, quantity);
            double finalPrice = discountedPrice * quantity;
            System.out.printf("%nProducto %d: %s%n", i+1, product);
            System.out.printf("Se piden %d unidades%n", quantity);
            System.out.printf("¿Hay stock?: %s%n", haveStock);
            if (!checkStock(quantity, stock)) {
                System.out.println("Pasando al siguiente producto");
                continue;
            }
            System.out.printf("Precio original: %.2f€%n", price);
            System.out.printf("Precio con descuento aplicado: %.2f€%n", discountedPrice);
            System.out.printf("Precio total del producto: %.2f€%n", finalPrice);
            total += finalPrice;
        }
        return total;
    }



}
