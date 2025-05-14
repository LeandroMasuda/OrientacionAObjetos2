package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Reserva {

	private int cantidadDeDias;
	private LocalDate fecha;
	private Usuario usuario;
	private AutoEnAlquiler auto;
	
	public Reserva(int cantidadDias, Usuario conductor, AutoEnAlquiler auto) {
		this.cantidadDeDias = cantidadDias;
		this.fecha = LocalDate.now();
		this.usuario = conductor;
		this.auto = auto;
	}
	
	public double montoAPagar() {
		return (auto.getPrecioPorDia()*this.cantidadDeDias);
	}
	public double MontoAReembolsar(LocalDate fechaCancelacion) {
		return auto.calcularAReembolso(fecha, fechaCancelacion, this.montoAPagar());
	}
}
