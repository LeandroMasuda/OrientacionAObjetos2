package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Subway {
	private Builder builder;
	
	public Subway(Builder builder) {
		this.builder = builder;
	}

	public void hacerSandwich() {
		this.builder.reset();
		this.builder.agregarPan();
		this.builder.agregarAderezo();
		this.builder.agregarPrincipal();
		this.builder.agregarAdicional();
	}
	
	public void cambiarConstructor(Builder builder) {
		this.builder = builder;	
	}
}
