package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class TipoDePersonajeBuilder {
	protected Personaje personaje;
	
	public abstract void crearPersonaje(String nombre);
	public abstract void crearArma();
	public abstract void crearArmadura();
	public abstract void crearHabilidad();
}
