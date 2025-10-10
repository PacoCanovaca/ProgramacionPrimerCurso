import model.Multiplicacion;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Proyecto métodos");
        System.out.println("Vamos a realizar llamadas a métodos");
        saludar("Borja");
        saludar("Laura");
        despedir();
        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(1, 4);
        operacionesMatematicas.restar(8, 2);
        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.multiplicacion(2, 5);
    }

    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
        System.out.println("Encantado de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el llamado de métodos");
        System.out.println("Ánimo, no decaigas en tu tarea");
    }

    public static void despedir() {
        System.out.println("A cerrar el portátil, a pasar la noche a casa");
    }
}
