package model;

public class LlamadaLocal extends Llamada {

    public LlamadaLocal(){}

    public LlamadaLocal(long nOrigen, long nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
        // coste = 0 ya incluido
    }

    /* @Override
    public void calcularCoste() {
        setCoste(0);
    }
    No haría falta porque ya viene incluido por defecto, heredado de la superclase */

    @Override
    public void mostrarDatos() {
        System.out.println("Llamada LOCAL");
        super.mostrarDatos();
    }

}
