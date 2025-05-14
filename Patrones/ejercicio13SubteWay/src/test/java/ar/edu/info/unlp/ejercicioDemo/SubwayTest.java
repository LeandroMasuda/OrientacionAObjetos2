package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class SubwayTest {
	
	Subway subteway;
	Builder cclasico;
	Builder cvegetariano;
	Builder cvegano;
	Builder csintacc;
	Sandwich sandwich;
	
	@BeforeEach
	void setUp() throws Exception {
		this.cclasico= new ConcreteBuilderClasico();
		this.cvegetariano= new ConcreteBuilderVegetariano();
		this.cvegano= new ConcreteBuilderVegano();
		this.csintacc= new ConcreteBuilderSinTACC();
	}
	
    @Test
    public void testSandwichClasico() {
    	this.subteway= new Subway(cclasico);
    	this.subteway.hacerSandwich();
    	sandwich = this.cclasico.obtenerSandwich();
    	assertEquals(500,sandwich.calcularMonto());   
    }
    @Test
    public void testSandwichVegetariano() {
    	this.subteway= new Subway(cvegetariano);
    	this.subteway.hacerSandwich();
    	sandwich = this.cvegetariano.obtenerSandwich();
    	assertEquals(420,sandwich.calcularMonto());
    }
    @Test
    public void testSandwichVegano() {
    	this.subteway= new Subway(cvegano);
    	this.subteway.hacerSandwich();
    	sandwich = this.cvegano.obtenerSandwich();
    	assertEquals(620,sandwich.calcularMonto());
    }
    @Test
    public void testSandwichSinTACC() {
    	this.subteway= new Subway(csintacc);
    	this.subteway.hacerSandwich();
    	sandwich = this.csintacc.obtenerSandwich();
    	assertEquals(618,sandwich.calcularMonto());
    }
}
