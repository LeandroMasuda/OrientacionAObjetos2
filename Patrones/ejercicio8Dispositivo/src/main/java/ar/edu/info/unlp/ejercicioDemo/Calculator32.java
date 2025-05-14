package ar.edu.info.unlp.ejercicioDemo;
import java.util.zip.CRC32;
/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Calculator32 implements Calculator {

	private CRC32 crc;
	
	public Calculator32 () {
		crc = new CRC32();
	}
	
	public int crcFor(String datos) {
		crc.update(datos.getBytes());
		return (int)crc.getValue();
	}

}
