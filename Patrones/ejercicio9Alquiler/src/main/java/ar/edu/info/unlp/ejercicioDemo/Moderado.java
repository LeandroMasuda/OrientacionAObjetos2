package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Moderado implements Reembolso{

	@Override
	public double calcularReembolso(LocalDate fecha,LocalDate fechaCancelacion, double monto) {
		long diasDiferencia = ChronoUnit.DAYS.between(fechaCancelacion, fecha);
        if (diasDiferencia >= 7) {
            return monto;
        } else if (diasDiferencia >= 2) {
            return monto * 0.5;
        } else {
            return 0;
        }
	}

}
