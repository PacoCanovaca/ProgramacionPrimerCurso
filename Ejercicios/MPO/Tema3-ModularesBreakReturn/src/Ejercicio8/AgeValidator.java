package Ejercicio8;

public class AgeValidator {
    public int countValidAges(int[] ages) {
        int counter = 0;
        for (int age : ages) {
            if(age > 120 || age < 0) {
                continue;
            }
            counter++;
        }
        return counter;
    }
}
