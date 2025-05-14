package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ConcreteBuilderVegetariano extends Builder{
	@Override
	public void agregarPan() {
		this.obtenerSandwich().setPan(120);
	}
	public void agregarAderezo() {
		this.obtenerSandwich().setAderezo(0);
	}
	public void agregarPrincipal() {
		this.obtenerSandwich().setPrincipal(200);
	}
	public void agregarAdicional() {
		this.obtenerSandwich().setAdicional(100);
	}
}
