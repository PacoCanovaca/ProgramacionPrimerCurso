import java.io.*;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public void copiarArchivo(String original, String copia) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(original);
            out = new FileOutputStream(copia);
            in.transferTo(out);
            System.out.println("Contenido copiado con éxito");
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error: no se puede transferir la información");
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                System.out.println("Error: no se puede cerrar el Stream");
            }

        }

    }

    public void obtenerInformacion(String path) {
        File file = new File(path);
        System.out.println("Información del archivo: " + path);
        double tamanioMb = (double) file.length() / 1000000;
        System.out.printf("- Tamaño: %d bytes (%.1f MB)%n", file.length(), tamanioMb);
        Date fecha = new Date(file.lastModified());
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.printf("- Última modificación: %s%n", formatoFecha.format(fecha));
        String permisoLectura = file.canRead() ? "Sí" : "No";
        String permisoEscritura = file.canWrite() ? "Sí" : "No";
        String permisoEjecucion = file.canExecute() ? "Sí" : "No";
        System.out.printf("- Permisos: Lectura (%s), Escritura (%s), Ejecución (%s)%n", permisoLectura, permisoEscritura, permisoEjecucion);
        System.out.printf("- Archivo oculto: %s%n", file.isHidden() ? "sí" : "no");
        System.out.printf("- Ruta absoluta: %s%n", file.getAbsolutePath());
    }

}
