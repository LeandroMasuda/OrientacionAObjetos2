package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Usuario {

	private String nombre;
	private LinkedList<Post> tweet;


	// Elimina todos los tweets
	public void EliminarTweets() {
		tweet.clear();
	}
	//Eliminar ReTweet
	public void eliminarReTweet(Post p) {
		tweet.removeIf(po -> po.equals(p));
	}
	//Hacer tweet
	public void Tweet(String cuerpo) {
		if(VerificarLongitud(cuerpo)) {
			Tweet t = new Tweet(cuerpo);
			tweet.add(t);
		}
	}
	//Hacer retweet
	public void ReTweet(String cuerpo, Tweet origen) {
		if(VerificarLongitud(cuerpo)) {
			ReTweet rt = new ReTweet(cuerpo,origen);
			tweet.add(rt);
		}
	}
	
	//Verificar longitud
	private boolean VerificarLongitud(String cadena) {
		boolean ok=true;
		if(cadena.length()<1 || cadena.length()>280) {
			ok=false;
		}
		return ok;
	}

}
