package Ejercicio10;

public enum EstadoPedido {
    Pendiente("Pedido pendiente. Termina tu pedido.", 1), Procesando("Procesando pedido. En breves será enviado.",2), Enviado("Pedido enviado. Tardará entre 24h y 72h", 3), En_transito("Pedido en reparto. El repartidor te avisará de cualquier incidencia.", 4), Entregado("Pedido entregado", 5), Cancelado("Pedido cancelado", 6);

    final String mensaje;
    final int numero;

    EstadoPedido(String mensajeEstado, int numeroEstado) {
        mensaje = mensajeEstado;
        numero = numeroEstado;
    }

}
