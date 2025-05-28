package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Alquiler implements Prenda{
	private LocalDate comienzoContrato;
	private LocalDate finContrato;
	private double costoMensual;
	
	public double getPrecio() {
		return this.costoMensual*(ChronoUnit.MONTHS.between(comienzoContrato, finContrato));
	}
	public double getPrecioTotal() {
		return this.getPrecio()*0.9;
	}
	public void add(Prenda p) {}
	public void remove(Prenda p) {}
	
	public Alquiler(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual) {
		super();
		this.comienzoContrato = comienzoContrato;
		this.finContrato = finContrato;
		this.costoMensual = costoMensual;
	}
}
