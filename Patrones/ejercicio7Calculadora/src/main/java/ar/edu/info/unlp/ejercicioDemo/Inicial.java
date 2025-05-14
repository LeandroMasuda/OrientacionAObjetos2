package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Inicial implements EstadoCalculadora {
	
	@Override
    public void mas(Calculadora c) {
        c.setEstado(new Suma());
    }

    @Override
    public void menos(Calculadora c) {
        c.setEstado(new Resta());
    }

    @Override
    public void por(Calculadora c) {
        c.setEstado(new Multiplicacion());
    }

    @Override
    public void dividido(Calculadora c) {
        c.setEstado(new Division());
    }

	@Override
	public void setValor(double unValor, Calculadora c) {
		c.setValorAcumulado(unValor);
	}

	@Override
	public String getResultado(Calculadora c) {
		return Double.toString(c.getValorAcumulado());
	}
}
