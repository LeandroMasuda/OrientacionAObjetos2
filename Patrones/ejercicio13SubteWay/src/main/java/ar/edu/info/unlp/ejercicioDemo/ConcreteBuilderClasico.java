package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ConcreteBuilderClasico extends Builder{
	public void agregarPan() {
		this.obtenerSandwich().setPan(100);
	}
	public void agregarAderezo() {
		this.obtenerSandwich().setAderezo(20);
	}
	public void agregarPrincipal() {
		this.obtenerSandwich().setPrincipal(300);
	}
	public void agregarAdicional() {
		this.obtenerSandwich().setAdicional(80);
	}

}
