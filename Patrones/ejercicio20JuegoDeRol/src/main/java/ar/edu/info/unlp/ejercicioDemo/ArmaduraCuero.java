package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ArmaduraCuero implements Armadura {
	 @Override
	 public int dañoEspada(ArmaEspada espada) {
		 return 8;
	 }
	 @Override
	 public int dañoArco(ArmaArco arco) {
		 return 5;
	 }
	 @Override
	 public int dañoBaston(ArmaBaston baston) {
		 return 2;
	 }

}
