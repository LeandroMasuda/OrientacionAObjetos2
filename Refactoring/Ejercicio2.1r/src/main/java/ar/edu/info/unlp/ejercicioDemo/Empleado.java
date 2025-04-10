package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Empleado {

	private String nombre;
	private String apellido;
	protected double sueldoBasico;
	
	


	public Empleado(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBasico = 0;
	}




	abstract double calcularSueldo(); 

}
