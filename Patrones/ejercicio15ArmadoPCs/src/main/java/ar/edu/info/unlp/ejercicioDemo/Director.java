package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Director {
	
	public Computadora crearEquipo(EquipoBuilder equipo) {
		equipo.crearPc();
		equipo.crearProcesador();
		equipo.crearMemoria();
		equipo.crearAlmacenamiento();
		equipo.crearGrafica();
		equipo.crearGabinete();
		return equipo.finalizarPc();
	}
	public Presupuesto CrearPresupuesto(String nombre, EquipoBuilder equipo) {		
		return new Presupuesto(nombre,this.crearEquipo(equipo));
	}



}
