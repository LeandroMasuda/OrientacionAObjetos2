package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Piedra implements Jugada {
	
	@Override
	public String papel() {
		return "Gana Papel";
	}
	@Override
	public String piedra() {
		return "Empata";
	}
	@Override
	public String tijeras() {
		return "Gana Piedra";
	}
	@Override
	public String lagarto() {
		return "Gana Piedra";
	}
	@Override
	public String spock() {
		return "Gana Spock";
	}
	@Override
	public String jugada(Jugada otraJugada) {
		return otraJugada.piedra();
	}
	public Piedra() {
		super();
	}
	
}
