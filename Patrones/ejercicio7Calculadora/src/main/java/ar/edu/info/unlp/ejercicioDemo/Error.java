package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Error implements EstadoCalculadora {
    @Override
    public void mas(Calculadora c) {}

    @Override
    public void menos(Calculadora c) {}

    @Override
    public void por(Calculadora c) {}

    @Override
    public void dividido(Calculadora c) {}

    @Override
    public void setValor(double unValor, Calculadora c) {}

    @Override
    public String getResultado(Calculadora c) {
        return "Error";
    }

}
