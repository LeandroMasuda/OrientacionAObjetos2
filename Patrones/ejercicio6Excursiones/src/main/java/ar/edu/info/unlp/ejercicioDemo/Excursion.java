package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Excursion {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private List<Usuario> inscriptos;
	private List<Usuario> espera;
	private EstadoInscripcion estado;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,
			int cupoMin, int cupoMax) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.inscriptos = new LinkedList<Usuario>();
		this.espera = new LinkedList<Usuario>();
		this.estado = new Provisoria(this);
	}

	public void inscribirUsuario(Usuario unUsuario) {
		this.estado.inscribir(unUsuario);
	}
	public void agregarInscripto(Usuario unUsuario) {
		this.inscriptos.add(unUsuario);
	}
	public void agregarEspera(Usuario unUsuario) {
		this.espera.add(unUsuario);
	}
	public boolean cumpleInscriptosMinimo() {
		return (this.inscriptos.size() - this.cupoMin) >= 0;
	}
	public boolean alcanzoElMaximo() {
		return (this.inscriptos.size() - this.cupoMax) == 0;
	}
	
	public void cambiarEstado(EstadoInscripcion estado) {
		this.estado=estado;
	}
	public String obtenerInformacion() {
		return this.estado.informacion();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMin() {
		return cupoMin;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public List<Usuario> getEspera() {
		return espera;
	}

	public String obtenermails() {
		return this.inscriptos.stream()
				.map(inscripto -> inscripto.getMail())
				.reduce("",(acumulator, element)-> acumulator +"\n" + element);
	}
}
