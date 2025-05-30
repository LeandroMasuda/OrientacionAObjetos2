package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ArmaEspada implements Arma {
	public int calcularDaño(Armadura armadura) {
		return armadura.dañoEspada(this);
	}

}
