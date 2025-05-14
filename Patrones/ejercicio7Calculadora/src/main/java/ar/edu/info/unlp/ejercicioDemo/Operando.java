package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Operando implements EstadoCalculadora {
	@Override
	public void mas(Calculadora c) {
		c.setEstado(new Error());
	}
	
	@Override
	public void menos(Calculadora c) {
		c.setEstado(new Error());
	}
	
	@Override
	public void por(Calculadora c) {
		c.setEstado(new Error());
	}
	
	@Override
	public void dividido(Calculadora c) {
		c.setEstado(new Error());
	}
	
	@Override
    public abstract void setValor(double unValor, Calculadora c);
	
	@Override
	public String getResultado(Calculadora c) {
		c.setEstado(new Error());
		//return c.getResultado();
		return "Error";
	}

}
