package Ejercicio9;

public class Main {
    static void main() {
        TextAnalyser textAnalyser = new TextAnalyser();
        String[] forbiddenWordsList = {"coche", "moto", "barco", "tren"};

        String text1 = "Hola, me llamo Paco.";
        System.out.printf("El texto tiene %d vocales.%n", textAnalyser.countVowels(text1));
        System.out.printf("¿El texto contiene alguna de las palabras prohibidas?: %b%n", textAnalyser.containsForbiddenWord(text1, forbiddenWordsList));
        System.out.printf("Primera palabra larga del texto: %s%n", textAnalyser.firstLongWord(text1, 4));

        String text2 = "A Paula le gusta mi coche amarillo.";
        System.out.printf("El texto tiene %d vocales.%n", textAnalyser.countVowels(text2));
        System.out.printf("¿El texto contiene alguna de las palabras prohibidas?: %b%n", textAnalyser.containsForbiddenWord(text2, forbiddenWordsList));
        System.out.printf("Primera palabra larga del texto: %s%n", textAnalyser.firstLongWord(text2, 5));
    }
}
