package Ejercicio1;

public class Password {
    public boolean validatePassword(String password) {

        if (password.length() < 8 || !containsUpper(password) || !containsNum(password)) {
            return false;
        }
        return true;
    }

    private boolean containsUpper(String password) {
        for (char character : password.toCharArray()) {
            if (character >= 'A' && character <= 'Z') {
                return true;
            }
        }
        return false;
    }

    private boolean containsNum(String password) {
        for (char character : password.toCharArray()) {
            if (character >= '0' && character <= '9') {
                return true;
            }
        }
        return false;
    }
}
