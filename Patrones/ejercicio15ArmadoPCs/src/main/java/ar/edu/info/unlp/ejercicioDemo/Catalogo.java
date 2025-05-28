package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Catalogo {
	private List<Componente> componentes;

	public Catalogo() {
		this.componentes= new ArrayList<>();
	}
	
	public Componente getComponente(String descripcion) {
		return this.componentes.stream()
		        .filter(c -> c.getDescripcion().equals(descripcion)) // Filtra por descripción
		        .findFirst() // Obtiene el primer resultado
		        .orElse(null);
				
	}
	


}
