package ar.edu.unlp.info.oo2.accesobd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseRealAccessProxy implements DatabaseAccess {
    private DatabaseRealAccess data;
    private String password="A23b";
    private boolean access=false;
    
    public void login(String password) {
    	if (this.password.equals(password)) {
    		access=true;
    	}
    }
    public DatabaseRealAccessProxy() {
        super();
        this.data = new DatabaseRealAccess();
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
    	if (!this.access) {
            throw new SecurityException("Acceso denegado: No has iniciado sesión.");
        }
        return this.data.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
    	if (!this.access) {
            throw new SecurityException("Acceso denegado: No has iniciado sesión.");
        }
        return this.data.insertNewRow(rowData);
    }
}