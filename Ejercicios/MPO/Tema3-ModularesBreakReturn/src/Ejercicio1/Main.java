package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Password password = new Password();
        String password1 = "qwerg2Fasdf";
        String password2 = "asdfxwasfsd";
        String password3 = "qdsfg2F";
        String password4 = "12354320s20";
        String password5 = "FGWGRSDEW";
        String password6 = "FGWGRSDE2";
        System.out.printf("¿La contraseña 1 es válida?: %b%n", password.validatePassword(password1));
        System.out.printf("¿La contraseña 2 es válida?: %b%n", password.validatePassword(password2));
        System.out.printf("¿La contraseña 3 es válida?: %b%n", password.validatePassword(password3));
        System.out.printf("¿La contraseña 4 es válida?: %b%n", password.validatePassword(password4));
        System.out.printf("¿La contraseña 5 es válida?: %b%n", password.validatePassword(password5));
        System.out.printf("¿La contraseña 6 es válida?: %b%n", password.validatePassword(password6));
    }
}
