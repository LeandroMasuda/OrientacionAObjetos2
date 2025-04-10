package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Spock implements Jugada {
	
	@Override
	public String papel() {
		return "Gana Papel";
	}
	@Override
	public String piedra() {
		return "Gana Spock";
	}
	@Override
	public String tijeras() {
		return "Gana Spock";
	}
	@Override
	public String lagarto() {
		return "Gana Lagarto";
	}
	@Override
	public String spock() {
		return "Empata";
	}
	@Override
	public String jugada(Jugada otraJugada) {
		return otraJugada.spock();
	}

}
