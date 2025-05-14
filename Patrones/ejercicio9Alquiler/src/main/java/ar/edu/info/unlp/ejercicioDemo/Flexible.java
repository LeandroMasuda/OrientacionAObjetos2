package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Flexible implements Reembolso {

	@Override 
	public double calcularReembolso(LocalDate fecha,LocalDate fechaCancelacion, double monto) {
		double total=0;
		if(fecha.isBefore(fechaCancelacion)) {
			total=monto;
		}
		return total;
	}

}
