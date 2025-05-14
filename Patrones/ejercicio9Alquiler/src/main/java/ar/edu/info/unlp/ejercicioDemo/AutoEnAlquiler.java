package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class AutoEnAlquiler {

	private double precioPorDia;
	private int cantidadPlazas;
	private String marca;
	private Reembolso reembolso;
	
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca, Reembolso politicaCancelacion) {
        this.precioPorDia = precioPorDia;
        this.cantidadPlazas = cantidadPlazas;
        this.marca = marca;
        this.reembolso = politicaCancelacion;
    }
	
	public double getPrecioPorDia() {
		return precioPorDia;
	}
	public void setPrecioPorDia(double precioPorDia) {
		this.precioPorDia = precioPorDia;
	}
	public int getCantidadPlazas() {
		return cantidadPlazas;
	}
	public void setCantidadPlazas(int cantidadPlazas) {
		this.cantidadPlazas = cantidadPlazas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double calcularAReembolso(LocalDate fecha,LocalDate fechaCancelacion, double monto) {
		return reembolso.calcularReembolso(fecha, fechaCancelacion, monto);
	}
	
	public void setPoliticaCancelacion(Reembolso politicaCancelacion) {
        this.reembolso = politicaCancelacion;
    }

}
