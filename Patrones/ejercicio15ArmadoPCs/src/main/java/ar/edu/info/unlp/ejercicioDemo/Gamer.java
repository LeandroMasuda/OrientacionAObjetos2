package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Gamer extends EquipoBuilder {

	public void crearProcesador() {
		super.pc.add(super.catalogo.getComponente("Procesador Gamer"));
		super.pc.add(super.catalogo.getComponente("Pad termico"));
		super.pc.add(super.catalogo.getComponente("Cooler"));
	}
	public void crearMemoria() {
		super.pc.add(super.catalogo.getComponente("32 gb"));
		super.pc.add(super.catalogo.getComponente("32 gb"));
	}
	public void crearGrafica() {
		super.pc.add(super.catalogo.getComponente("rtx 4090"));
	}
	public void crearAlmacenamiento() {
		super.pc.add(super.catalogo.getComponente("ssd 500 gb"));
		super.pc.add(super.catalogo.getComponente("ssd 1 tb"));
	}
	public void crearGabinete() {
		super.pc.add(super.catalogo.getComponente("gabinete intermedio"));
		double consumo= pc.calcularConsumo();
		super.pc.add(super.catalogo.getComponente("fuente "+(consumo+(consumo *0.5)+"w")));
	}


}
