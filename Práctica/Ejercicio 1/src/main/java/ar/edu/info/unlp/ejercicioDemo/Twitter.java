package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.Map;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Twitter {

	private Map<String,Usuario> users;
	
	// Método para agregar solo si el valor no existe
    public boolean agregarSiNoExiste(String clave, Usuario usuario) {
        if (users.containsKey(clave)) {
            return false;
        } else {
            users.put(clave, usuario);
            return true;
        }
    }
    // Elimina un usuario
    public boolean eliminarUsuario(String clave) {
    	boolean eliminado=false;
    	if(users.containsKey(clave)) {
    		users.get(clave).EliminarTweets();
    		users.remove(clave);
    		eliminado=true;
    	}
    	
    	return eliminado;
    }

}
