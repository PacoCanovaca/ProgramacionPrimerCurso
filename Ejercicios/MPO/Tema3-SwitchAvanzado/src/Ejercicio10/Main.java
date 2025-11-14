package Ejercicio10;

public class Main {
    static void main() {
        EstadoPedido estadoPedido;
        String mensaje = null;
        switch (obtenerEstadoActual()) {
            case 1 -> {
                estadoPedido = EstadoPedido.Pendiente;
                mensaje = estadoPedido.mensaje;
            }
            case 2 -> {
                estadoPedido = EstadoPedido.Procesando;
                mensaje = estadoPedido.mensaje;
            }
            case 3 -> {
                estadoPedido = EstadoPedido.Enviado;
                mensaje = estadoPedido.mensaje;
            }
            case 4 -> {
                estadoPedido = EstadoPedido.En_transito;
                mensaje = estadoPedido.mensaje;
            }
            case 5 -> {
                estadoPedido = EstadoPedido.Entregado;
                mensaje = estadoPedido.mensaje;
            }
            case 6 -> {
                estadoPedido = EstadoPedido.Cancelado;
                mensaje = estadoPedido.mensaje;
            }
        }
        System.out.println(mensaje);
    }
    public static int obtenerEstadoActual() {
        return (int) (Math.random() * 6) + 1;
    }
}
