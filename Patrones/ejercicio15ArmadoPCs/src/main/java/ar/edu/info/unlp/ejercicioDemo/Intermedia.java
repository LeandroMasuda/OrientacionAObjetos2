package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Intermedia extends EquipoBuilder {

	public void crearProcesador() {
		super.pc.add(super.catalogo.getComponente("Procesador Intermedio"));
	}
	public void crearMemoria() {
		super.pc.add(super.catalogo.getComponente("16 gb"));
	}
	public void crearGrafica() {
		super.pc.add(super.catalogo.getComponente("gtx 1650"));
	}
	public void crearAlmacenamiento() {
		super.pc.add(super.catalogo.getComponente("ssd 500 gb"));
	}
	public void crearGabinete() {
		super.pc.add(super.catalogo.getComponente("gabinete intermedio"));
		super.pc.add(super.catalogo.getComponente("fuente 800w"));
	}


}
