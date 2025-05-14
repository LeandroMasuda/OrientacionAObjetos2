package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Dispositivo {
	private Display display;
	private Ringer ringer;
	private Calculator calculator;
	private Connection connection;

	public String send(String data) {
		int crc= this.calculator.crcFor(data);
		return this.connection.sendData(data,crc);
	}
	public String configurarCRC (Calculator calculator) {
		this.calculator = calculator;
		return "crc calculator changed";
	}
	
	public String conectarCon (Connection connection) {
		this.connection = connection;
		this.display.showBanner(connection.pict());
		this.ringer.ring();
		return "connection changed";
	}
	public Dispositivo() {
		this.calculator = new Calculator16();
		this.display = new Display();
		this.connection = new WifiConn();
		this.ringer = new Ringer();
	}
	

}
