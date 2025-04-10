package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Pedido {

	private Cliente cliente ;
	private List<Producto> productos;
	private FormaDePago formaPago;
	
	public Pedido(Cliente c, List<Producto> p, FormaDePago fp) {
		/*if(!"efectivo".equals(fp)
			&& !"6 cuotas".equals(fp)
			&& !"12 cuotas".equals(fp)) {
			throw new Error("Forma de pago incorrecta");
		}  Este codigo no es necesario
		*/
		this.cliente=c;
		this.productos=p;
		this.formaPago=fp;
	}
	public double getCostoTotal() {
		//cambie el for por el stream 
		double costoProductos = this.productos.stream()
				.mapToDouble( p -> p .getPrecio())
				.sum();
		//depende la forma de pago devuelve el extra
		double extraFormaPago=costoProductos*formaPago.CostoExtra();
		//se creo un metodo privado que realiza la operacion que estaba antes 
		
		
		/*
		int añosDesdeFechaAlta = this.añosDesdeElAlta();
		  // Aplicar descuento del 10% si el cliente tiene mas de 5 anos de 
		//antiguedad 
		if (añosDesdeFechaAlta > 5) { 
			return (costoProductos + extraFormaPago) * 0.9; 
		} 
		return costoProductos + extraFormaPago; 
		*/
		return this.calculaCostoFinal(costoProductos, extraFormaPago);
	}
	//metodo para calcular los años
	private boolean añosDesdeElAlta() {
		return Period.between(this.cliente.getFechaAlta(), LocalDate.now()).getYears()>5; 
	}
	private double calculaCostoFinal(double costoProductos, double extraFormaPago) {
		if (this.añosDesdeElAlta()) {
			return (costoProductos + extraFormaPago) * 0.9; 
		}
		return costoProductos + extraFormaPago;
	}
}
