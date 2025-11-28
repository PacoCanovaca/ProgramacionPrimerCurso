package Ejercicio9;

public class TextAnalyser {

    public int countVowels(String text) {
        int counter = 0;
        for (char character : text.toLowerCase().toCharArray()) {
            if (character != 'a' && character != 'e' && character != 'i' && character != 'o' && character != 'u') {
                continue;
            }
            counter++;
        }
        return counter;
    }

    public boolean containsForbiddenWord(String text, String[] forbiddenWords) {
        for (String word : forbiddenWords) {
            if(text.contains(word)) {
                return true;
            }
        }
        return false;
    }

    public String firstLongWord(String text, int minimumLength) {

    }
}
