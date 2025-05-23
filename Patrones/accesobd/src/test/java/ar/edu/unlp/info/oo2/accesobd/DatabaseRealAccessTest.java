package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;
    private DatabaseRealAccessProxy database2;
    
    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.database2 = new DatabaseRealAccessProxy();
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }
    
    @Test
    void testInsertNewRow() {
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
    
    @Test
    void testGetSearchResults2WithLogin() {
    	this.database2.login("A23b");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database2.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database2.getSearchResults("select * from comics where id=10"));
    }
    
    @Test
    void testInsertNewRow2WithLogin() {
    	this.database2.login("A23b");
        assertEquals(3, this.database2.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database2.getSearchResults("select * from comics where id=3"));
    }
    @Test
    void testGetSearchResults2WithoutLogin() {
        Exception exception = assertThrows(SecurityException.class, () -> {
            this.database2.getSearchResults("select * from comics where id=1");
        });

        assertEquals("Acceso denegado: No has iniciado sesión.", exception.getMessage());
    }

    @Test
    void testInsertNewRow2WithoutLogin() {
        Exception exception = assertThrows(SecurityException.class, () -> {
            this.database2.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
        });

        assertEquals("Acceso denegado: No has iniciado sesión.", exception.getMessage());
    }
}