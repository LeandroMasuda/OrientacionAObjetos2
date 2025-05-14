package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Completa extends EstadoInscripcion {

	public Completa(Excursion excursion) {
		super(excursion);
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		Excursion e= this.getExcursion();
		e.agregarInscripto(unUsuario);
		if(e.alcanzoElMaximo()) {
			e.cambiarEstado(new Definitiva(e));
		}
	}
	@Override 
	public String informacionE() {
		return " Cantidad de usuario faltantes para alcanzar el cupo mínimo"+
	(this.getExcursion().getCupoMin()-getExcursion().getInscriptos().size()+
			" mail de los usuarios inscriptos"+this.getExcursion().obtenermails());
	}

}
