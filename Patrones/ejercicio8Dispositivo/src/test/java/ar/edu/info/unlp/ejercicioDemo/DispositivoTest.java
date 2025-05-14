package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {

	private Dispositivo dispositivo;
		
	@BeforeEach
	void setUp() throws Exception {
		this.dispositivo = new Dispositivo();
	}

	@Test
	void testSendCRC16Wifi() {
		assertEquals("Transmite datos con wifi", this.dispositivo.send("Cuando lo sabes lo sabes"));
	}
	
	@Test
	void testSendCRC32Wifi() {
		this.dispositivo.configurarCRC(new Calculator32());
		assertEquals("Transmite datos con wifi", this.dispositivo.send("Cuando lo sabes lo sabes"));
	}
	
	@Test
	void testSendCRC164G() {
		this.dispositivo.conectarCon(new Adapter4GConnection());
		assertEquals("Transmite datos con 4G", this.dispositivo.send("Cuando lo sabes lo sabes"));
	}
	
	@Test
	void testSendCRC324G() {
		this.dispositivo.conectarCon(new Adapter4GConnection());
		this.dispositivo.configurarCRC(new Calculator32());
		assertEquals("Transmite datos con 4G", this.dispositivo.send("Cuando lo sabes lo sabes"));
	}
	
	@Test
	void testConectarCon() {
		assertEquals("connection changed", this.dispositivo.conectarCon(new Adapter4GConnection()));
		assertEquals("connection changed", this.dispositivo.conectarCon(new WifiConn()));
	}
	
	@Test
	void testConfigurarCRC() {
		assertEquals("crc calculator changed", this.dispositivo.configurarCRC(new Calculator32()));
		assertEquals("crc calculator changed", this.dispositivo.configurarCRC(new Calculator16()));
	}

}