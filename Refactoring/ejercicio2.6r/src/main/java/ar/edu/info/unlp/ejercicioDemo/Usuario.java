package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Usuario { 
    private Subscripcion subscripcion; 
    private String nombre;
    private int telefono;
    private String email;
 
    public void setTipoSubscripcion(Subscripcion unTipo) { 
    	this.subscripcion = unTipo; 
    } 
     
    public double calcularCostoPelicula(Pelicula pelicula) { 
    	return this.subscripcion.calcularCosto(pelicula);
    }
} 
