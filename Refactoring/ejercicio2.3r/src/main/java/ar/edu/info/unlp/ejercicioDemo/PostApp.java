package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class PostApp {

	private ArrayList<Post> posteos;

	
	/** 
	* Retorna los últimos N posts que no pertenecen al usuario user 
	*/ 
	public List<Post> ultimosPosts(Usuario user, int cantidad) { 
	          
		//Retorna los post de todos los usuarios menos el ingresado
		List<Post> postsOtrosUsuarios = this.PosteoDeOtrosUsuarios(user);  
		
		// ordena los posts por fecha 
		List<Post> PostMasNuevos= this.OrdenarPorFechas(postsOtrosUsuarios);
		//Retorna los ultimos "cantidad" posteos 
	    return this.ultimosPost(cantidad, postsOtrosUsuarios); 
	} 
	
	
	private List<Post> PosteoDeOtrosUsuarios(Usuario user) {
		return  this.posteos.stream()
	    	    .filter(post -> !post.esElUsuario(user)) // Filtrar según la condición
	    	    .collect(Collectors.toList());
	    
	}
	private List<Post> OrdenarPorFechas(List<Post> postsOtrosUsuarios){
		return postsOtrosUsuarios.stream()
			    .sorted((post1, post2) -> post2.getFecha().compareTo(post1.getFecha())) // Ordenar por fecha descendente
			    .collect(Collectors.toList());// Ordenar por fecha descendente
	    
	}
	private List<Post> ultimosPost(int cantidad,List<Post> postsOtrosUsuarios){
		return postsOtrosUsuarios.stream()
			    .limit(cantidad) // Limitar a la cantidad deseada
			    .collect(Collectors.toList());
	}
}
