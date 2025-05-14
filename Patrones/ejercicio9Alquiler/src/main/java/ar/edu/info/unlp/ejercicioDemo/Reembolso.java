package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public interface Reembolso {

	public double calcularReembolso(LocalDate fecha,LocalDate fechaCancelacion, double monto);

}
