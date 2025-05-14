package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Division extends Operando {
	@Override
	public void setValor(double unValor, Calculadora c) {
		if (unValor == 0) {
			c.setEstado(new Error());
		}
		else {
			c.setValorAcumulado(c.getValorAcumulado() / unValor);
			c.setEstado(new Inicial());
		}
	}

}
