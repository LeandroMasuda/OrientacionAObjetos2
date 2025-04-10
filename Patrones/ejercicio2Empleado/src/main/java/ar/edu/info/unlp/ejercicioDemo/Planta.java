package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Planta extends Empleado {
	private int antiguedad;
	
	public Planta(int cantidadHijos, boolean casado, int antiguedad) {
		super(cantidadHijos, casado);
		this.antiguedad = antiguedad;
	}
	
	public double calcularSueldoAdicional() {
		double sueldo=0;
		if(this.isCasado()) {
			sueldo+=5000;
		}
		return sueldo + (this.getCantidadHijos() * 2000)
				+(this.antiguedad* 2000);
	
	}
	public double calcularSueldoBasico() {
		return 50000;
	}
}
