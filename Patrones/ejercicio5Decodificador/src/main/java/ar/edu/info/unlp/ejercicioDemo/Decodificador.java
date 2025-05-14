package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Decodificador {

	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private Sugerencia sugerencia;
	public Decodificador(List<Pelicula> grilla, List<Pelicula> reproducidas, Sugerencia sugerecia) {

		this.grilla = grilla;
		this.reproducidas = reproducidas;
		this.sugerencia = sugerecia;
	}

	public Decodificador() {
		this.grilla = new ArrayList<>();
		this.reproducidas = new ArrayList<>();
		this.sugerencia = new SugerenciaNovedad();
	}
	
	public Decodificador(List<Pelicula> grilla) {
		this.grilla = grilla;
		this.reproducidas = new ArrayList<>();
		this.sugerencia = new SugerenciaNovedad();
	}
	
	public Decodificador(List<Pelicula> grilla, List<Pelicula> reproducidas) {
		this.grilla = grilla;
		this.reproducidas = new ArrayList<>();
		this.sugerencia  = new SugerenciaNovedad();
	}
	public List<Pelicula> obtenerSugerencias() {
		return this.sugerencia.obtenerSugerencia(this);
		
	}
	public List<Pelicula> getGrilla() {
		return grilla;
	}
	public void agregarGrilla(Pelicula peli) {
		this.grilla.add(peli);
	}
	public List<Pelicula> getReproducidas() {
		return reproducidas;
	}
	public void setReproducidas(Pelicula peli) {
		this.reproducidas.add(peli);
	}
	public Sugerencia getSugerencia() {
		return sugerencia;
	}
	public void setSugerencia(Sugerencia sugerecia) {
		this.sugerencia = sugerecia;
	}
	
	

}
