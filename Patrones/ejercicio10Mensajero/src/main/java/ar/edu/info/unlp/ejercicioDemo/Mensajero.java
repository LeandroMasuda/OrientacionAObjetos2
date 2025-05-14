package ar.edu.info.unlp.ejercicioDemo;




public class Mensajero {
	private Strategy stategy;

	public void setStategy(Strategy stategy) {
		this.stategy = stategy;
	}
	
	public void enviarMensaje(String mensaje) {
		this.stategy.encriptar(mensaje);
	}
	public void recibirMensaje(String mensaje) {
		this.stategy.desencriptar(mensaje);
	}
	
	public Mensajero(Strategy stategy) {

		this.stategy = stategy;
	}
	

}