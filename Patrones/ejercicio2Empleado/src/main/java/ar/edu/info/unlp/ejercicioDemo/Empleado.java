package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Empleado {
	private int cantidadHijos;
	private boolean casado;
	
	
	
	public Empleado(int cantidadHijos, boolean casado) {
		this.cantidadHijos = cantidadHijos;
		this.casado = casado;
	}
	
	
	public int getCantidadHijos() {
		return cantidadHijos;
	}
	public boolean isCasado() {
		return casado;
	}
	private double calcularDescuento() {
		return this.calcularSueldoBasico() * 0.13 + this.calcularSueldoAdicional() * 0.5;
	}
	
	// Este es el template method
	public double calcularSueldo() {
		return (this.calcularSueldoBasico() + this.calcularSueldoAdicional()) - this.calcularDescuento();
		// cada uno de estos metodos son los hooks
	}
	public abstract double calcularSueldoAdicional();
	public abstract double calcularSueldoBasico();

}
