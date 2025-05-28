package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Automovil implements Prenda{
	private int modelo;
	private double kilometraje;
	private double costo0km;
	
	public Automovil(int modelo, double kilometraje, double costo0km) {
		super();
		this.modelo = modelo;
		this.kilometraje = kilometraje;
		this.costo0km = costo0km;
	}
	public double getPrecio() {
		return Math.max(0, costo0km * (1 - (0.10 * (LocalDate.now().getYear() - modelo))));
	}
	public double getPrecioTotal() {
		return this.getPrecio()*0.7;
	}
	public void add(Prenda p) {}
	public void remove(Prenda p) {}
}
