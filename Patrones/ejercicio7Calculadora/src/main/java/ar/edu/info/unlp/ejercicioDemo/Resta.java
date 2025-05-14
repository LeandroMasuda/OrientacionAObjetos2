package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Resta extends Operando {
	@Override
	public void setValor(double unValor, Calculadora c) {
		c.setValorAcumulado(c.getValorAcumulado() - unValor);
		c.setEstado(new Inicial());
	}

}
