package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PrendaTest {
	
	Prenda p1,p2,p3,p4;
	
	@BeforeEach
	void setUp() throws Exception {
		p1 = new Inmueble("Varela", 100, 200);
		p2 = new Automovil(2010,10000, 20000);
		p3 = new Alquiler(LocalDate.of(2025, 5, 27),LocalDate.of(2026, 5, 27),100.0);
		p4 = new PrendaComposite();
	}
	
    @Test
    public void testNombreInmueble() {
        assertEquals(20000, p1.getPrecio());
        assertEquals(4000, p1.getPrecioTotal());
    }
    @Test
    public void testNombreAutomovil() {
        assertEquals(0, p2.getPrecio());
        assertEquals(0, p2.getPrecioTotal());
    }
    @Test
    public void testNombreAlquiler() {
        assertEquals(1200.0, p3.getPrecio());
        assertEquals(1080.0, p3.getPrecioTotal());
    }
    @Test
    public void testNombrecombinado() {
    	p4.add(p1);
    	p4.add(p2);
    	p4.add(p3);
        assertEquals(21200.0, p4.getPrecio());
        assertEquals(10600.0, p4.getPrecioTotal());
    }
}
