package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public  class EmpleadoPlanta extends Empleado{

	private int cantHijos;

	


	public EmpleadoPlanta(String nombre, String apellido) {
		super(nombre, apellido);
		this.cantHijos = 0;
	}
	@Override
	public double calcularSueldo() {
		return sueldoBasico 
				+ (this.cantHijos*2000)
				- (sueldoBasico *0.13);
	}


}
