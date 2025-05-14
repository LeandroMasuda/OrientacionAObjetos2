package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ConcreteBuilderSinTACC extends Builder{
	public void agregarPan() {
		this.obtenerSandwich().setPan(150);
	}
	public void agregarAderezo() {
		this.obtenerSandwich().setAderezo(18);
	}
	public void agregarPrincipal() {
		this.obtenerSandwich().setPrincipal(250);
	}
	public void agregarAdicional() {
		this.obtenerSandwich().setAdicional(200);
	}

}
