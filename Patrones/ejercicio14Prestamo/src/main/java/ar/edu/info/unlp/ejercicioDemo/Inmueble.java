package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Inmueble implements Prenda{
	private String direccion;
	private double superficie;
	private double costoMcuadrado;
	
	public double getPrecio() {
		return this.superficie*this.costoMcuadrado;
	}
	public double getPrecioTotal() {
		return this.getPrecio()*0.2;
	}
	public void add(Prenda p) {}
	public void remove(Prenda p) {}
	
	public Inmueble(String direccion, double superficie, double costoMcuadrado) {
		super();
		this.direccion = direccion;
		this.superficie = superficie;
		this.costoMcuadrado = costoMcuadrado;
	}
}
