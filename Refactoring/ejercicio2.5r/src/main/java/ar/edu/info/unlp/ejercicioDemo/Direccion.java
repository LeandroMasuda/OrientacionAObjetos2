package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Direccion { 
	private String localidad;
	private String calle;
	private String numero;
	private String departamento;
	public String getLocalidad() {
		return localidad;
	}
	public String getCalle() {
		return calle;
	}
	public String getNumero() {
		return numero;
	}
	public String getDepartamento() {
		return departamento;
	}
	public Direccion(String localidad, String calle, String numero, String departamento) {
		super();
		this.localidad = localidad;
		this.calle = calle;
		this.numero = numero;
		this.departamento = departamento;
	}
	public String generarDireccion() {
	    return String.format("%s, %s %s, Departamento: %s", localidad, calle, numero, departamento);
	}
}