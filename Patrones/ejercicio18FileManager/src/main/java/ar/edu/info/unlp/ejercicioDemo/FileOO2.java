package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
import java.time.LocalDate;

public class FileOO2 implements DisplayableFile{

	private String nombre;
	private String extension;
	private int size;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	
	public FileOO2(String nombre, String extension, int size, LocalDate fechaCreacion, LocalDate fechaModificacion,
			String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.size = size;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}
	public String prettyPrint() {
		
		return "";
	}

	
	public String getNombre() {
		
		return this.nombre;
	}

	
	public String getExtension() {
		return this.extension;
	}

	
	public int getSize() {
		return this.size;
	}

	
	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}

	
	public LocalDate getFechaModificacion() {
		return this.fechaModificacion;
	}

	public String getPermisos() {
		return this.permisos;
	}

}
