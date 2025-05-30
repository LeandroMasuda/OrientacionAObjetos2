package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Director {
	public void crearPersonaje(TipoDePersonajeBuilder tipo,String nombre ) {
		tipo.crearPersonaje(nombre);
		tipo.crearArma();
		tipo.crearArmadura();
		tipo.crearHabilidad();
	}

}
