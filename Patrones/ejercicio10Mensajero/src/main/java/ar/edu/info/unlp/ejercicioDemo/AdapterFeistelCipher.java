package ar.edu.info.unlp.ejercicioDemo;




public class AdapterFeistelCipher extends Strategy{
	private FeistelCipher adaptee;

	@Override 
	public String encriptar(String m) {
		return this.adaptee.encode(m);
	}
	@Override 
	public String desencriptar(String m) {
		return this.adaptee.encode(m);
	}
}