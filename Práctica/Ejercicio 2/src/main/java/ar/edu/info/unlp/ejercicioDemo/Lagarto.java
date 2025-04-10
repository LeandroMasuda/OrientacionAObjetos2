package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Lagarto implements Jugada {
	
	@Override
	public String papel() {
		return "Gana Lagarto";
	}
	@Override
	public String piedra() {
		return "Gana Piedra";
	}
	@Override
	public String tijeras() {
		return "Gana Tijeras";
	}
	@Override
	public String lagarto() {
		return "Empata";
	}
	@Override
	public String spock() {
		return "Gana Lagarto";
	}
	@Override
	public String jugada(Jugada otraJugada) {
		return otraJugada.lagarto();
	}
}
