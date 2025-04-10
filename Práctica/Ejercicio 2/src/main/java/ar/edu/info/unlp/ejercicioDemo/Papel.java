package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Papel implements Jugada {
	
	@Override
	public String papel() {
		return "Empata";
	}
	@Override
	public String piedra() {
		return "Gana Papel";
	}
	@Override
	public String tijeras() {
		return "Gana Tijeras";
	}
	@Override
	public String lagarto() {
		return "Gana Lagarto";
	}
	@Override
	public String spock() {
		return "Gana Papel";
	}
	@Override
	public String jugada(Jugada otraJugada) {
		return otraJugada.papel();
	}
	public Papel() {
	}
	
}

