package Ejercicio9.controller;

import Ejercicio9.model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorUsuarios {

    ArrayList<Usuario> listaUsuarios;

    public GestorUsuarios() {
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(String nombre, String apellido, String dni){
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getDni().equalsIgnoreCase(dni)) {
                System.out.println("El DNI ya existe. No se ha podido crear contacto.\n");
                return;
            }
        }
        listaUsuarios.add(new Usuario(nombre, apellido, dni));
        System.out.println("Usuario agregado correctamente.\n");
    }

    public void listarUsuarios() {
        System.out.println("Lista de usuarios:");
        listaUsuarios.forEach(Usuario::mostrarDatos);
        System.out.println();
    }

    public void exportarUsuarios(String path) {
        File file = new File(path);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(file));
            for (Usuario usuario : listaUsuarios) {
                writer.println(usuario);
            }
            System.out.println("Exportación realizada con éxito.\n");
            listaUsuarios.clear();
        } catch (IOException e) {
            System.out.println("Error: no se encuentra el fichero.\n");
        } finally {
            try {
                writer.close();
            } catch (NullPointerException e) {
                System.out.println("Error: no se ha podido cerrar el escritor.\n");
            }
        }
    }

    public void importarUsuarios(String path) {
        File file = new File(path);
        BufferedReader lector = null;
        try {
            lector = new BufferedReader(new FileReader(file));
            String linea = null;
            String[] datos = null;
            while ((linea = lector.readLine()) != null) {
                datos = linea.split(",");
                listaUsuarios.add(new Usuario(datos[0], datos[1], datos[2]));
            }
            System.out.println("Importación realizada con éxito.\n");
        } catch (FileNotFoundException e) {
            System.out.println("Error: no se encuentra el fichero.\n");
        } catch (IOException e) {
            System.out.println("Error: no se ha podido leer el fichero.\n");
        } finally {
            try {
                lector.close();
            } catch (IOException e) {
                System.out.println("Error: no se puede cerrar el lector.\n");
            }
        }
    }

}
