package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Computadora {
	private List<Componente> componentes;

	public Computadora() {
		this.componentes = new ArrayList<Componente>();
	}
	
	public void add(Componente c) {
		this.componentes.add(c);
	}

	public double calcularConsumo() {
		return this.componentes.stream()
				.mapToDouble(c -> c.getConsumo())
				.sum();
	}
	public double calcularPrecio() {
		return this.componentes.stream()
				.mapToDouble(c -> c.getPrecio())
				.sum()*(1.21);
	}


}
