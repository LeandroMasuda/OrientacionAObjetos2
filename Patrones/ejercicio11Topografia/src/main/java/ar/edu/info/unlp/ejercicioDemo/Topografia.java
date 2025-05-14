package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Topografia {

	public abstract double getProporcionAgua();
	
	public double getPorcionTierra() {
		return 1 - this.getProporcionAgua();
	}
	public boolean compararTopografia(Topografia t) {
		boolean ok=false;
		if(this.getProporcionAgua() == t.getProporcionAgua()) {
			ok=true;
		}
		return ok;
	}
	
	public Object getTopografia() { // RETORNO OBJETO PARA PODER COMPARAR UNA TOPOGRAFIA ATOMICA CON UNA COMPUESTA
		return this;
	}
	
	public  boolean isEquals(Topografia topografia) {
		return (this.getProporcionAgua() == topografia.getProporcionAgua());
	}
	
	@Override
	public  boolean equals(Object objeto) {
		return this.isEquals((Topografia)objeto); // DEBO REDEFINIRLA PARA QUE LA COMPARACION DE TOPOGRAFIA MIXTA SEA EN CUANDO A PROPORCION
		 										 // SI NO LO REDEFINO ENTONCES ME COMPARA SI ES EL MISMO OBJETO (misma referencia a memoria) 
	}
}
