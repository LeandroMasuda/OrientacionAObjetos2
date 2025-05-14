package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Sugerencia  {

	public List<Pelicula> obtenerSugerencia(Decodificador decodificador){
		return this.sugerirPelicula(decodificador).stream()
				.filter(pelicula -> !decodificador.getReproducidas().contains(pelicula))
				.limit(3).collect(Collectors.toList());
	}
	public abstract List<Pelicula> sugerirPelicula(Decodificador deco);

}
