public class Ejercicio8 {

    public static void main(String[] args) {
        int base1 = 5;
        int height1 = 3;
        System.out.println("Base del rectángulo: " + base1);
        System.out.println("Altura del rectángulo: " + height1);
        System.out.println("El área del rectángulo es: " + rectangle_area(base1, height1));
    }

    public static int rectangle_area(int base, int height){
        return base * height;
    }

}
