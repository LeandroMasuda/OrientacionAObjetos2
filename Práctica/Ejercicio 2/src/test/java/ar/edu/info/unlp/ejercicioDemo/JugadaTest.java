package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class JugadaTest {
	
	Jugada papel, piedra,tijeras,lagarto,spock;
	
	@BeforeEach
	void setUp() throws Exception {
		papel = new Papel();
		piedra = new Piedra();
		tijeras = new Tijeras();
		lagarto = new Lagarto();
		spock= new Spock();
		
	}
	
    @Test
    public void testNombreCompleto() {
    	//Jugadas del papel
        assertEquals(papel.jugada(papel),"Empata");
        assertEquals(papel.jugada(piedra),"Gana Papel");
        assertEquals(papel.jugada(tijeras),"Gana Tijeras");
        assertEquals(papel.jugada(lagarto),"Gana Lagarto");
        assertEquals(papel.jugada(spock),"Gana Papel");
        //Jugadas de la piedra
        assertEquals(piedra.jugada(piedra),"Empata");
        assertEquals(piedra.jugada(papel),"Gana Papel");
        assertEquals(piedra.jugada(tijeras),"Gana Piedra");
        assertEquals(piedra.jugada(lagarto),"Gana Piedra");
        assertEquals(piedra.jugada(spock),"Gana Spock");
        //Jugadas de la tijera
        assertEquals(tijeras.jugada(piedra),"Gana Piedra");
        assertEquals(tijeras.jugada(papel),"Gana Tijeras");
        assertEquals(tijeras.jugada(tijeras),"Empata");
        assertEquals(tijeras.jugada(lagarto),"Gana Tijeras");
        assertEquals(tijeras.jugada(spock),"Gana Spock");
        //jugadas del lagarto
        assertEquals(lagarto.jugada(piedra),"Gana Piedra");
        assertEquals(lagarto.jugada(papel),"Gana Lagarto");
        assertEquals(lagarto.jugada(tijeras),"Gana Tijeras");
        assertEquals(lagarto.jugada(lagarto),"Empata");
        assertEquals(lagarto.jugada(spock),"Gana Lagarto");
        //
        assertEquals(spock.jugada(piedra),"Gana Spock");
        assertEquals(spock.jugada(papel),"Gana Papel");
        assertEquals(spock.jugada(tijeras),"Gana Spock");
        assertEquals(spock.jugada(lagarto),"Gana Lagarto");
        assertEquals(spock.jugada(spock),"Empata");
    }
}

/*
 * Usa el doble dispatch en este ejercicio
 */
