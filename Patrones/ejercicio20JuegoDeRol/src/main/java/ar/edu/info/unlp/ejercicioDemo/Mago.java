package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Mago extends TipoDePersonajeBuilder{
	public void crearPersonaje(String nombre) {
		personaje = new Personaje(nombre);
	}
	public void crearArma() {
		this.personaje.setArma( new ArmaBaston());
	}
	public void crearArmadura() {
		this.personaje.setArmadura(new ArmaduraCuero());
	}
	public void crearHabilidad() {
		this.personaje.addHabilidad("Magia");
		this.personaje.addHabilidad("Combate a distancia");
	}
	

}
