package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class EmpleadoTest {
	
	Empleado jamesPasante, guidoPlanta, juanTemporario;
	
	@BeforeEach
	void setUp() throws Exception {
		jamesPasante = new Pasante(2,true,1);
		guidoPlanta = new Planta(1, true,1);
		juanTemporario = new Temporario(1,true,2);
	}
	
    @Test
    public void testsueldo() {
    	assertEquals(jamesPasante.calcularSueldo(),18400.0);
    	assertEquals(guidoPlanta.calcularSueldo(),48000.0);
    	assertEquals(juanTemporario.calcularSueldo(),21422.0);
    }
}
