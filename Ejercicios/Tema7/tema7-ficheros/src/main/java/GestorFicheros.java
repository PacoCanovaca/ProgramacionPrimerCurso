import java.io.*;

public class GestorFicheros {

    public void leerFichero(String path){
        File file = new File(path);
        BufferedReader bufferedReader = null;
        System.out.println("Contenido del archivo:");
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error: lectura fallida del archivo");
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error: no se ha podido cerrar el lector");
            }
        }
    }

    public void contarApariciones(String path, String palabraBuscada) {
        File file = new File(path);
        BufferedReader bufferedReader = null;
        int contador = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            while ((linea = bufferedReader.readLine()) != null) {
                for (String palabra : linea.split(" ")) {
                    if (palabra.equalsIgnoreCase(palabraBuscada)) {
                        contador++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error: lectura fallida del archivo");
        } finally {
            System.out.printf("La palabra '%s' aparece %d veces en el archivo%n", palabraBuscada, contador);
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error: no se ha podido cerrar el lector");
            }
        }
    }

}
