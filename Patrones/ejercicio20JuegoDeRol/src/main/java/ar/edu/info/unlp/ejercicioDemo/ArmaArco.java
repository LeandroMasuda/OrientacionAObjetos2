package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ArmaArco implements Arma {
	public int calcularDaño(Armadura armadura) {
		return armadura.dañoArco(this);
	}


}
