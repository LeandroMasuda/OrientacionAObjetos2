package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Calculadora {
	private double valorAcumulado;
	private EstadoCalculadora estado;
	

	public Calculadora() {
		this.reiniciarCalculadora();
	}
	
	private void reiniciarCalculadora() {
		this.valorAcumulado = 0;
		this.estado = new Inicial();
	}
	/** 
	* Devuelve el resultado actual de la operación realizada. 
	* Si no se ha realizado ninguna operación, devuelve el valor acumulado. 
	* Si la calculadora se encuentra en error, devuelve “error” 
	*/ 
	public String getResultado() {
		return estado.getResultado(this);
	} 
	/** 
	* Pone en cero el valor acumulado y reinicia la calculadora 
	*/ 
	public void borrar() {
		this.reiniciarCalculadora();
	} 
	/** 
	* Asigna un valor para operar.  
	* si hay una operación en curso, el valor será utilizado en la operación 
	*/ 
	public void setValor(double unValor) {
		this.estado.setValor(unValor, this);
	} 
	/** 
	* Indica que la calculadora debe esperar un nuevo valor.  
	* Si a continuación se le envía el mensaje setValor(), la calculadora sumará 
	* el valor recibido como parámetro, al valor actual y guardará el resultado  
	* */ 
	public void mas() {
		this.estado.mas(this);
	}
	public void menos() {
		this.estado.menos(this);
	}
	public void por() {
		this.estado.por(this);
	}
	public void dividido() {
		this.estado.dividido(this);
	}
	public void setEstado(EstadoCalculadora estado) {
		this.estado = estado;
	}
	public void setValorAcumulado(double valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	public double getValorAcumulado() {
		return valorAcumulado;
	} 
	
	

}
