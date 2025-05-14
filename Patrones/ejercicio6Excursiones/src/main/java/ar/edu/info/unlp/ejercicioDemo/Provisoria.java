package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Provisoria extends EstadoInscripcion{

	public Provisoria(Excursion excursion) {
		super(excursion);
	}
	
	@Override
	public void inscribir(Usuario unUsuario) {
		Excursion e= this.getExcursion();
		e.agregarInscripto(unUsuario);
		if(e.cumpleInscriptosMinimo()) {
			e.cambiarEstado(new Completa(e));
		}
	}
	
	@Override 
	public String informacionE() {
		return " Cantidad de usuario faltantes para alcanzar el cupo mínimo"+
	(this.getExcursion().getCupoMin()-getExcursion().getInscriptos().size());
	}
}
