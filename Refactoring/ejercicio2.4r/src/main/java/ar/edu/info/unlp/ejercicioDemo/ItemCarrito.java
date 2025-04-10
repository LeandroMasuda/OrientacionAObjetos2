package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ItemCarrito {

	 private Producto producto; 
	 private int cantidad; 
	         
	 public Producto getProducto() { 
		 return this.producto; 
	 } 
	     
	 public int getCantidad() { 
		 return this.cantidad; 
	 } 
	 public double calcularPrecio() {
		 return producto.getPrecio()*cantidad;
	 }

}
