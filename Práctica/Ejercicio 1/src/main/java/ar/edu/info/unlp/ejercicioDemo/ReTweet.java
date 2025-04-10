package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ReTweet implements Post{

	private String contenido;
	private Tweet tweetOrigen;
	

	// Constructor retweet
	public ReTweet(String contenido, Tweet origen) {
		this.contenido = contenido;
		this.tweetOrigen=origen;
	}

	

}
