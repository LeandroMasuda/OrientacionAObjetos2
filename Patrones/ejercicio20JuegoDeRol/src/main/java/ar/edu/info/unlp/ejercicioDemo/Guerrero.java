package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Guerrero extends TipoDePersonajeBuilder{
	public void crearPersonaje(String nombre) {
		personaje = new Personaje(nombre);
	}
	public void crearArma() {
		this.personaje.setArma( new ArmaEspada());
	}
	public void crearArmadura() {
		this.personaje.setArmadura(new ArmaduraAcero());
	}
	public void crearHabilidad() {
		this.personaje.addHabilidad("Combate cuerpo a cuerpo");;
	}
	

}
