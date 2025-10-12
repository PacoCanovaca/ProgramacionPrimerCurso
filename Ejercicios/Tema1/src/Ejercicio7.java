public class Ejercicio7 {
    public static void main(String[] args) {
        String name = "Elena García";
        int age = 24;
        String city = "Barcelona";
        boolean employed = true;
        System.out.println("¡Hola! Me llamo " + name + ".");
        System.out.println("Tengo " + age + " años y vivo en " + city + ".");
        if (employed) {
            System.out.println("Tengo trabajo.");
        } else {
            System.out.println("Actualmente, estoy en paro");
        }
    }
}
