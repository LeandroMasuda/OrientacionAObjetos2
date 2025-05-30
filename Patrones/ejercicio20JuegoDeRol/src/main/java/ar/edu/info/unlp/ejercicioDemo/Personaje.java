package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Personaje {
	private String nombre;
	private Armadura armadura;
	private Arma arma;
	private List<String> habilidades;
	private int vida;
	
	public Personaje(String nombre) {
		super();
		this.nombre = nombre;
		this.armadura = null;
		this.arma = null;
		this.habilidades = new ArrayList<>();
		this.vida=100;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Armadura getArmadura() {
		return armadura;
	}
	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public List<String> getHabilidades(){
		return this.habilidades;
	}
	public void addHabilidad(String habilidad) {
		this.habilidades.add(habilidad);
	}
	public boolean tengoVida() {
		boolean sigoVivo=true;
		if (vida<1) {
			sigoVivo=false;
		}
		return sigoVivo;
	}
	public void combatir(Personaje contrincante) {
		this.atacar(contrincante);
		contrincante.atacar(this);
	}
	private void atacar(Personaje contrincante) {
		contrincante.recibirDaño(this.getArma().calcularDaño(contrincante.getArmadura()));
	}
	private void recibirDaño(int daño) {
		this.vida-=daño;
	}

}
