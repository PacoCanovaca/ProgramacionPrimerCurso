package controller;

import model.Usuario;

import java.io.*;

public class GestorFicheros {

    public GestorFicheros() {}

    public void escribirObjetos() {
        File file = new File("src/main/java/ressources/objetos.obj");
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeInt(56);
        } catch (IOException e) {
            System.out.println("Error: no hay permiso de escritura");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error: no se ha podido cerrar el flujo de salida");
            }
        }
    }

    public void leerObjeto() {
        File file = new File("src/main/java/ressources/objetos.obj");
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            int dato = objectInputStream.readInt();
            System.out.println(dato);
        } catch (IOException e) {
            System.out.println("Error: no hay permiso de lectura");
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                System.out.println("Error: no se ha podido cerrar el flujo de entrada");
            }
        }
    }

    public void escribirUsuario(Usuario usuario) {
        File file = new File("src/main/java/ressources/objetos.obj");
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true));
            objectOutputStream.writeObject(usuario);
        } catch (IOException e) {
            System.out.println("Error: no hay permisos de escritura");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error: no se ha podido cerrar el flujo de salida");
            }
        }
    }

    public void leerUsuario() {
        File file = new File("src/main/java/ressources/objetos.obj");
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Usuario usuario = (Usuario) objectInputStream.readObject();
            System.out.println(usuario);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: no hay permisos de lectura");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: clase no encontrada");
        } catch (ClassCastException e) {
            System.out.println("Error: no ha sido posible realizar el casteo");
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error: no se ha podido cerrar el flujo de entrada");
            }
        }
    }

}
