package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class WifiConn implements Connection {
	private String pict;
	
	public WifiConn() {
		this.pict = "Simbolo Wifi";
	}
	

	@Override
	public String sendData(String data, int crc) {
		return "Transmite datos con wifi";
	}

	@Override
	public String pict() {
		return pict;
	}
	

}
