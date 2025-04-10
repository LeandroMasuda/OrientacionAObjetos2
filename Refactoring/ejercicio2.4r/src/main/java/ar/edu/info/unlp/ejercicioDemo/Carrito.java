package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Carrito {

	private List<ItemCarrito> items; 
    
	public double total() { 
		return this.items.stream() 
				.mapToDouble(item ->  item.calcularPrecio()) 
				.sum(); 
	    } 

}
