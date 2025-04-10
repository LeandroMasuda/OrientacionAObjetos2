package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Cliente { 
	private Direccion direccion;
	
	 public String getDireccionFormateada() { 
		 return direccion.generarDireccion();
		}
}