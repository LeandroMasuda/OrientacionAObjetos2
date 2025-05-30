package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ArmaduraHierro implements Armadura {
	@Override
	 public int dañoEspada(ArmaEspada espada) {
		 return 5;
	 }
	 @Override
	 public int dañoArco(ArmaArco arco) {
		 return 3;
	 }
	 @Override
	 public int dañoBaston(ArmaBaston baston) {
		 return 1;
	 }

}
