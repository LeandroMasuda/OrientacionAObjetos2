package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Builder{
	private Sandwich sandwich;
	
	public void reset() {
		this.sandwich = new Sandwich();
	}
	
	public Sandwich obtenerSandwich() {
		return this.sandwich;
	}
	
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();
}
