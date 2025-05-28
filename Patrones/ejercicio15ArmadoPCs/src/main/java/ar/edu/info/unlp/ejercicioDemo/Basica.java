package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Basica extends EquipoBuilder {

	public void crearProcesador() {
		super.pc.add(super.catalogo.getComponente("Procesador Basico"));
	}
	public void crearMemoria() {
		super.pc.add(super.catalogo.getComponente("8 gb"));
	}
	public void crearGrafica() {}
	public void crearAlmacenamiento() {
		super.pc.add(super.catalogo.getComponente("hdd 500 gb"));
	}
	public void crearGabinete() {
		super.pc.add(super.catalogo.getComponente("gabinete estandar"));
	}


}
