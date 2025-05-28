package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class EquipoBuilder {
	protected Computadora pc;
	protected Catalogo catalogo;
	
	
	public void crearPc() {
		this.pc = new Computadora();
	}
	public Computadora finalizarPc() {
		return this.pc;
	}
	public abstract void crearProcesador();
	public abstract void crearMemoria();
	public abstract void crearGrafica();
	public abstract void crearAlmacenamiento();
	public abstract void crearGabinete();


}
