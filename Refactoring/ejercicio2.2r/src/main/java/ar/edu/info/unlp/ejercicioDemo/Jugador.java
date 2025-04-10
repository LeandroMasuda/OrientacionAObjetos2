package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Jugador {

	private String nombre;
	private String apellido;
	private int puntuacion;
	
	public Jugador(String nombre,String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.puntuacion=0;
	}
	public void bajarPuntuacion() {
		this.puntuacion-=50;
	}
	public void subirPuntuacion() {
		this.puntuacion+=100;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
