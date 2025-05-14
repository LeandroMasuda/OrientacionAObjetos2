package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Archivo extends FileSystem {
	private int tamaño;
	
	

	public int getTamaño() {
		return tamaño;
	}

	public Archivo(String nombre, LocalDate fecha, int tamaño) {
		super(nombre,fecha);
		this.tamaño = tamaño;
	}
	
	@Override 
	public int tamanoTotalOcupado() {
		return this.tamaño;
	}
	
	@Override
	public Archivo archivoMasGrande() {
		return this;
	}
	
	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}
	@Override 
	public FileSystem buscar(String nombre) {
		return this;
		
	}
	
	@Override 
	public List<FileSystem> buscarTodos(String nombre) {
	    return this.getNombre().equals(nombre) ? List.of(this) : List.of();
	}
}
