package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Presupuesto {
	private String nombre;
	private LocalDate fechaSolicitud;
	private Computadora pc;
	public Presupuesto(String nombre,  Computadora pc) {
		super();
		this.nombre = nombre;
		this.fechaSolicitud = LocalDate.now();
		this.pc = pc;
	}
	
}
