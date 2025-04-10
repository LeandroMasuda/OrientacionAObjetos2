package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Post {

	private String texto;
	private LocalDateTime fecha;
	private Usuario user;
	
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	public Usuario getUser() {
		return user;
	}
	public boolean esElUsuario(Usuario usuario) {
		return this.getUser().equals(usuario);
	}

}
