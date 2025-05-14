package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class CalculadoraTest {
	
	private Calculadora calculadora;

	@BeforeEach
	public void setUp() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void testEstadoInicial() {
		assertEquals("0.0", calculadora.getResultado());
        calculadora.setValor(42.5);
        assertEquals("42.5", calculadora.getResultado());
	}
	@Test
	public void testSuma() {
		calculadora.setValor(10);
		calculadora.mas();
		calculadora.setValor(5);
		assertEquals("15.0",calculadora.getResultado());
	}
	@Test 
	public void testResta() {
		calculadora.setValor(10);
		calculadora.menos();
		calculadora.setValor(5);
		assertEquals("5.0",calculadora.getResultado());
	}
	@Test 
	public void testMultiplicar() {
		calculadora.setValor(10);
		calculadora.por();
		calculadora.setValor(5);
		assertEquals("50.0",calculadora.getResultado());
	}
	@Test 
	public void testDividir() {
		calculadora.setValor(10);
		calculadora.dividido();
		calculadora.setValor(5);
		assertEquals("2.0",calculadora.getResultado());
	}
	@Test 
	public void testDividirPorCero() {
		calculadora.setValor(10);
		calculadora.dividido();
		calculadora.setValor(0);
		assertEquals("Error",calculadora.getResultado());
	}
	@Test 
	public void testOperacionSumaIncompleta() {
		calculadora.setValor(10);
		calculadora.mas();
		assertEquals("Error",calculadora.getResultado());
	}
	@Test 
	public void testOperacionRestaIncompleta() {
		calculadora.setValor(10);
		calculadora.menos();
		assertEquals("Error",calculadora.getResultado());
	}
	@Test 
	public void testOperacionMultiplicacionIncompleta() {
		calculadora.setValor(10);
		calculadora.por();
		assertEquals("Error",calculadora.getResultado());
	}
	@Test 
	public void testOperacionDivisionIncompleta() {
		calculadora.setValor(10);
		calculadora.dividido();
		assertEquals("Error",calculadora.getResultado());
	}
	@Test 
	public void testMensajeNoPermitidoEnSuma() {
		calculadora.setValor(10);
		calculadora.mas();
		calculadora.menos();
		assertEquals("Error",calculadora.getResultado());
	}
	@Test 
	public void testMensajeNoPermitidoEnResta() {
		calculadora.setValor(10);
		calculadora.menos();
		calculadora.mas();	
		assertEquals("Error",calculadora.getResultado());
	}
	@Test 
	public void testMensajeNoPermitidoEnMultiplicacion() {
		calculadora.setValor(10);
		calculadora.por();
		calculadora.mas();	
		assertEquals("Error",calculadora.getResultado());
	}
	@Test 
	public void testMensajeNoPermitidoEnDivision() {
		calculadora.setValor(10);
		calculadora.dividido();
		calculadora.mas();	
		assertEquals("Error",calculadora.getResultado());
	}
	@Test 
	public void testBorrarEnEstadoInicial() {
		calculadora.setValor(10);
		calculadora.borrar();	
		assertEquals("0.0",calculadora.getResultado());
	}
	@Test 
	public void testBorrarEnEstadoOperando() {
		calculadora.setValor(10);
		calculadora.mas();
		calculadora.borrar();	
		assertEquals("0.0",calculadora.getResultado());
	}
	 @Test
	 public void testBorrarEnEstadoError() {
		 calculadora.setValor(10);
		 calculadora.dividido();
		 calculadora.setValor(0); // Estado Error
		 calculadora.borrar();
		 assertEquals("0.0", calculadora.getResultado());
	}
	 @Test
	 public void testOperacionesEncadenadas() {
		 calculadora.setValor(10);
		 calculadora.mas();
		 calculadora.setValor(5); // 15
		 calculadora.por();
		 calculadora.setValor(2); // 30
		 assertEquals("30.0", calculadora.getResultado());
	 }

	 @Test
	 public void testEstadoErrorIgnoraOperaciones() {
		 calculadora.setValor(10);
		 calculadora.dividido();
		 calculadora.setValor(0); // Estado Error
		 calculadora.mas();
		 calculadora.setValor(5);
		 assertEquals("Error", calculadora.getResultado());
	 }
	
}
