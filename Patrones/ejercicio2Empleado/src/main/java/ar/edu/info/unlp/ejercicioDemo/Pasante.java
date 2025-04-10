package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Pasante extends Empleado {
	private int cantidadExamenesRendidos;
	
	
	
	public Pasante(int cantidadHijos, boolean casado, int cantidadExamenesRendidos) {
		super(cantidadHijos, casado);
		this.cantidadExamenesRendidos = cantidadExamenesRendidos;
	}
	public double calcularSueldoAdicional() {
		return 2000 * this.cantidadExamenesRendidos;
	}
	public double calcularSueldoBasico() {
		return 20000;
	}

}
