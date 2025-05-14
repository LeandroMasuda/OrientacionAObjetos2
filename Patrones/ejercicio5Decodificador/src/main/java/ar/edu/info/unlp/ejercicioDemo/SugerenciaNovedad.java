package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class SugerenciaNovedad extends Sugerencia {

	@Override
	public List<Pelicula> sugerirPelicula(Decodificador decodificador) {
		return decodificador.getGrilla().stream()
				.sorted((p2,p1) -> p1.getAñoEstreno().compareTo(p2.getAñoEstreno()))
				.collect(Collectors.toList());
	}
}
