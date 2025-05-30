package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ArmaduraAcero implements Armadura {
	@Override
	 public int dañoEspada(ArmaEspada espada) {
		 return 3;
	 }
	 @Override
	 public int dañoArco(ArmaArco arco) {
		 return 2;
	 }
	 @Override
	 public int dañoBaston(ArmaBaston baston) {
		 return 1;
	 }

}
