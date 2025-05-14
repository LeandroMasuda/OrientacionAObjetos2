package ar.edu.info.unlp.ejercicioDemo;




public class AdapterRC4 extends Strategy {
	private RC4 adaptee;
	
	@Override
	public String encriptar(String m) {
		return this.adaptee.encriptar(m, "clave");
	}
	@Override
	public String desencriptar(String m) {
		return this.adaptee.encriptar(m, "clave");
	}
}