package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
import java.text.MessageFormat;

public class Supermercado {

    public void notificarPedido(long nroPedido, Cliente cliente) {
        // Usamos MessageFormat con formato correcto para la cadena
        String notificacion = MessageFormat.format(
            "Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}.",
            nroPedido,
            cliente.getDireccionFormateada()
        );

        // Imprimimos la notificación en pantalla
        System.out.println(notificacion);
    }
}
