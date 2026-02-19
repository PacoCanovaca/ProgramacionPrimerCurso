public class AparicionPalabras {

    private final String palabra;
    private int apariciones;

    public AparicionPalabras(String palabra, int apariciones) {
        this.palabra = palabra;
        this.apariciones = apariciones;
    }

    public String getPalabra() {
        return palabra;
    }

    public int getApariciones() {
        return apariciones;
    }

    public void setApariciones(int apariciones) {
        this.apariciones = apariciones;
    }
}
