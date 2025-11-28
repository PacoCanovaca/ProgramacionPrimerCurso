package Ejercicio8;

public class Main {
    static void main() {
        AgeValidator ageValidator = new AgeValidator();
        int[] agesList = {1, 534, 23, 67, 23, 42, 98, -231, 44, 329};
        System.out.printf("Hay %d edades válidas en la lista", ageValidator.countValidAges(agesList));
    }
}
