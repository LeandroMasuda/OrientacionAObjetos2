package ar.edu.info.unlp.ejercicioDemo;

import java.time.Year;
import java.util.LinkedList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Pelicula {

	private String titulo;
	private Year añoEstreno;
	private List<Pelicula> similares;
	private double puntaje;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Year getAñoEstreno() {
		return añoEstreno;
	}
	public void setAñoEstreno(Year añoEstreno) {
		this.añoEstreno = añoEstreno;
	}
	public List<Pelicula> getSimilares() {
		return similares;
	}
	public void setSimilares(List<Pelicula> similares) {
		this.similares = similares;
	}
	public double getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}
	public Pelicula(String titulo,  double puntaje, Year añoEstreno) {
		super();
		this.titulo = titulo;
		this.añoEstreno = añoEstreno;
		this.similares = new LinkedList<Pelicula>();
		this.puntaje = puntaje;
	}
	public void establecerSimilitud(Pelicula pelicula) {
		if (!this.similares.contains(pelicula)) {
			this.similares.add(pelicula);
			pelicula.establecerSimilitud(this);
		}
	}
	
	public List<Pelicula> getPeliculasSimilares(){
		return this.similares;
	}

}
