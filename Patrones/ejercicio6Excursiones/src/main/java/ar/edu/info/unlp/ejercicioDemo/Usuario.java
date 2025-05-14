package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Usuario {

	private String nombre;
	private String apellido;
	private String mail;
	
	
	public Usuario(String nombre, String apellido, String mail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public String getMail() {
		return mail;
	}
	
	

	
}
