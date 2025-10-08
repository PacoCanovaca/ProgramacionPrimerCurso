public class Main {
    // Comentario de una línea
        /* Comentario de
        varias líneas
         */
    /**
     * Definición de la clase
     * @param args Esto es la información de entrada (parámetros y argumentos)
     * @return type Esto es el retorno
     * @version version
     * @author nombre del autor
     */
    // TODO Tarea pendiente
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        String nombreCompleto = "Paco Canovaca";
        int edad = 27;
        edad = edad + 1;
        System.out.println("Me llamo " + nombreCompleto);
        System.out.println("Tengo " + edad + " años");

        float altura = 1.75f;
        double peso = 80.4385348582;

        System.out.println("Mi altura es " + altura);
        System.out.println("Peso " + peso + " kilos");

        char letraCarnet = 'J';

        System.out.println("La letra de mi DNI es " + letraCarnet);

        boolean experiencia = false;

        System.out.println("Experiencia: " + experiencia);


        final String NUMERO_DNI = "45434259J"; // Esta variable no se puede modificar
    }

}
