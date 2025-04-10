package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Plus extends Subscripcion{
	
	@Override
	public double calcularCosto(Pelicula p) {
		return p.getCosto();

	}
}
