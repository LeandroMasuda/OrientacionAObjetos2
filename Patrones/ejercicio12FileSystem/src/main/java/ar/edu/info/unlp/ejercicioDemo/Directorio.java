package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Directorio extends FileSystem {
	private int tamaño;
	private List<FileSystem> contenido;
	
	public int getTamaño() {
		return tamaño;
	}

	public List<FileSystem> getContenido() {
		return contenido;
	}

	public void setContenido(FileSystem contenido) {
		this.contenido.add(contenido);
	}

	public Directorio(String nombre, LocalDate fecha) {
		super(nombre,fecha);
		this.tamaño = 32;
		this.contenido = new ArrayList<FileSystem>();
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return this.tamaño+this.contenido.stream()
		.mapToInt(c -> c.tamanoTotalOcupado())
		.sum();
	}
	
	@Override
	public Archivo archivoMasGrande() {
		return this.contenido.stream()
				.map(file -> file.archivoMasGrande())
				.max((a1,a2) -> Integer.compare(a1.tamanoTotalOcupado(),a2.tamanoTotalOcupado()))
				.orElse(null);	
	    
	}
	
	@Override
    public Archivo archivoMasNuevo() {
		return this.contenido.stream()
				.map(file -> file.archivoMasNuevo())
				.max((a1,a2) -> a1.getFecha().compareTo(a2.getFecha()))
				.orElse(null);
    }
	
	@Override
	public FileSystem buscar(String nombre) {
		return this.contenido.stream()
                .filter(n -> n.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
	}
	@Override
	public List<FileSystem> buscarTodos(String nombreBuscado) {
        return Stream.concat(
                this.getNombre().equals(nombreBuscado) ? Stream.of(this) : Stream.empty(),
                this.contenido.stream().flatMap(fs -> fs.buscarTodos(nombreBuscado).stream())
        ).collect(Collectors.toList());
    }
	
  
}
