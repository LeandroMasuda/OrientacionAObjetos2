package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class EstadoInscripcion {
	private Excursion excursion;

	public EstadoInscripcion(Excursion excursion) {
		this.excursion = excursion;
	}
	
	
	public Excursion getExcursion() {
		return excursion;
	}
	public String informacion() {
		Excursion e=this.getExcursion();
		return "/n Nombre "+ e.getNombre()+
				" Costo "+ e.getCosto()+
				" Fecha Inicio "+e.getFechaInicio()+
				" Fecha Fin "+e.getFechaFin()+
				" Punto de Encuentro "+e.getPuntoEncuentro()+
				this.informacionE();
	}

	public abstract void inscribir(Usuario unUsuario);
	public abstract String informacionE();
}
