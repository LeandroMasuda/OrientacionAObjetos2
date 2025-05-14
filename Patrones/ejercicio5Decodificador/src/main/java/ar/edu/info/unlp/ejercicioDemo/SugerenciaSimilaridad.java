package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class SugerenciaSimilaridad extends Sugerencia {
	
	@Override
	public List<Pelicula> sugerirPelicula(Decodificador decodificador) {
		return decodificador.getReproducidas().stream()
				.map(pelicula -> pelicula.getSimilares())
				.flatMap(lista -> lista.stream()).distinct()
				.collect(Collectors.toList());
	}


}