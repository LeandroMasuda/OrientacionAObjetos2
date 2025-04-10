package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public  class EmpleadoPasante extends Empleado{




	public EmpleadoPasante(String nombre, String apellido) {
		super(nombre, apellido);
	}
	@Override
	public double calcularSueldo() {
		return sueldoBasico 
				- (sueldoBasico *0.13);
	}


}
