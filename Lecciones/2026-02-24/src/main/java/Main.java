import controller.GestorFicheros;
import model.Usuario;

public class Main {

    public static void main(String[] args) {

        GestorFicheros gestorFicheros = new GestorFicheros();

        // gestorFicheros.escribirObjetos();
        // gestorFicheros.leerObjeto();
        gestorFicheros.escribirUsuario(new Usuario("Paco", "Canovaca", "46265617J"));
        gestorFicheros.leerUsuario();

    }

}
