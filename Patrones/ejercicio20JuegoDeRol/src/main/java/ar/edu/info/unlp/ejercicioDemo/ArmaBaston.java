package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ArmaBaston implements Arma {
	public int calcularDaño(Armadura armadura) {
		return armadura.dañoBaston(this);
	}

}
