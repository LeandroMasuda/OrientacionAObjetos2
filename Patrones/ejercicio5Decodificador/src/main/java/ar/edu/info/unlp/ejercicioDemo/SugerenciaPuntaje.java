package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class SugerenciaPuntaje extends Sugerencia {
	
	@Override
	public List<Pelicula> sugerirPelicula(Decodificador decodificador) {
		return decodificador.getGrilla().stream()
				.sorted((p1,p2) -> Double.compare(p2.getPuntaje(), p1.getPuntaje()))
				.collect(Collectors.toList());
	}

}