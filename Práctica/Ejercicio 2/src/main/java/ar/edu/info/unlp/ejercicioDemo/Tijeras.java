package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Tijeras implements Jugada {
	
	@Override
	public String papel() {
		return "Gana Tijeras";
	}
	@Override
	public String piedra() {
		return "Gana Piedra";
	}
	@Override
	public String tijeras() {
		return "Empata";
	}
	@Override
	public String lagarto() {
		return "Gana Tijeras";
	}

	@Override
	public String spock() {
		return "Gana Spock";
	}
	@Override
	public String jugada(Jugada otraJugada) {
		return otraJugada.tijeras();
	}
}
