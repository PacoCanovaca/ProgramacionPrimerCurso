package Ejercicio3;

public class Main {

    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.generateMatrix(sum.matrix);
        System.out.print("Suma total de elementos: " + sum.sumElements(sum.matrix));
    }

}
