import model.LlamadaLocal;
import model.LlamadaNacional;
import model.LlamadaProvincial;

public class Main {
    public static void main(String[] args) {

        LlamadaLocal llamadaLocal = new LlamadaLocal(123, 123, 5);
        llamadaLocal.mostrarDatos();
        LlamadaProvincial llamadaProvincial = new LlamadaProvincial(123, 123, 5);
        llamadaProvincial.mostrarDatos();
        LlamadaNacional llamadaNacional = new LlamadaNacional(123, 123, 5, 3);
        llamadaNacional.mostrarDatos();

    }
}
