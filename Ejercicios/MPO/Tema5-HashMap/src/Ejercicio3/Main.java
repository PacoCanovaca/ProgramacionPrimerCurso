package Ejercicio3;

public class Main {

    public static void main(String[] args) {

        DiccionarioEspanolIngles diccionarioEspanolIngles = new DiccionarioEspanolIngles();

        String[][] nuevasPalabras = new String[][]{{"hola", "hello"}, {"gato", "cat"}, {"casa", "house"}, {"el", "the"}, {"la", "the"}, {"en", "in"}, {"está", "is"}};

        diccionarioEspanolIngles.agregarVariasTraducciones(nuevasPalabras);

        diccionarioEspanolIngles.listarDiccionario();

        diccionarioEspanolIngles.traducirFrase("el gato está en la casa");

        System.out.println("Total de palabras del diccionario: " + diccionarioEspanolIngles.tamanioDiccionario());
    }

}
