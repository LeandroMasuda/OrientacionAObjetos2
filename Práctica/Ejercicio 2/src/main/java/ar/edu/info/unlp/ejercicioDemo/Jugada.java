package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public interface Jugada {
	//Metodos que tiene Piedra
	String piedra();

	//Metodos que tiene Papel
	String papel();
	
	//Metodos que tiene tijeras
	String tijeras();

	//Metodo que tiene lagarto
	String lagarto();
	
	//Metodo que tiene spock
	String spock();
	
	// Metodo jugada
	String jugada(Jugada j);
	
	
}
