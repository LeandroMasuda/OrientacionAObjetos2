package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class PrendaComposite implements Prenda{
	private List<Prenda> componentes;
	
	public PrendaComposite() {
		this.componentes = new ArrayList<Prenda>();
	}

	
	public void add(Prenda p) {
		this.componentes.add(p);
	}

	
	public void remove(Prenda p) {
		this.componentes.remove(p);
		
	}
	public double getPrecioTotal() {
		return this.componentes.stream()
				.mapToDouble(p -> p.getPrecio())
				.sum() * 0.5;
	}

	
	public double getPrecio() {
		return this.componentes.stream()
				.mapToDouble(p -> p.getPrecio())
				.sum();
	}
}
