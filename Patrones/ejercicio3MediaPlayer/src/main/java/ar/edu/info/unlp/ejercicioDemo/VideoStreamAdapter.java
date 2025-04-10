package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class VideoStreamAdapter extends Media {
	private VideoStream adaptee;
	
	@Override
	public void play() {
		adaptee.reproduce();
	}
	
}


/*
 * 	Cuando tenga que hacer el uml tengo que 
 * marcar en cada clase que parte del patron 
 * cumple, y hacer el UML normal dsp 
 * 
 * */
