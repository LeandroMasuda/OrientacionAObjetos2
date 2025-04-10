package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Temporario extends Empleado {
	private int cantidadHoras;
	
	public Temporario(int cantidadHijos, boolean casado, int cantidadHoras) {
		super(cantidadHijos, casado);
		this.cantidadHoras = cantidadHoras;
	}

	public double calcularSueldoAdicional() {
		double sueldo=0;
		if(this.isCasado()) {
			sueldo+=5000;
		}
		return sueldo + (this.getCantidadHijos() * 2000);
	}
	
	public double calcularSueldoBasico() {
		return 20000 + (this.cantidadHoras*300);
	}

}
