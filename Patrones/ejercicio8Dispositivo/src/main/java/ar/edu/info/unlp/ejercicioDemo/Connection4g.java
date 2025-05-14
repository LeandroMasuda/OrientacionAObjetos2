package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Connection4g {
	private String symb;
	
	public Connection4g() {
		this.symb = "Simbolo 4G";
	}
	public String transmitir(String data, int crc) {
		return "Transmite datos con 4G";
	}
	public String symb() {
		return symb;
	}

}
