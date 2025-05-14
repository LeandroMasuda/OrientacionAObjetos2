package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Adapter4GConnection implements Connection {
	@Override
	public String sendData(String data, int crc) {
		Connection4g connection = new Connection4g();
		return connection.transmitir(data, crc);
	}

	@Override
	public String pict() {
		Connection4g connection = new Connection4g();
		return connection.symb();
	}
}
