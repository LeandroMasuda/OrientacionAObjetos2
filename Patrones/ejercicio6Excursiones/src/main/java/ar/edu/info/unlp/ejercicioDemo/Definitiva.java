package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Definitiva extends EstadoInscripcion {

	public Definitiva(Excursion excursion) {
		super(excursion);
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		this.getExcursion().agregarEspera(unUsuario);
	}
	public String informacionE() {
		return "";
	}
}
