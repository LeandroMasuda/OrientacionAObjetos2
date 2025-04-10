
	package ar.edu.info.unlp.ejercicioDemo;

	/**
	 * De esta forma crearemos las clases del ejercicio
	 *
	 */
	public  class EmpleadoTemporario extends Empleado{

		private double horasTrabajadas;
		private int cantHijos;

		


		public EmpleadoTemporario(String nombre, String apellido) {
			super(nombre, apellido);
			this.horasTrabajadas = 0;
			this.cantHijos = 0;
		}

		@Override
		public double calcularSueldo() {
			return sueldoBasico 
					+ (this.horasTrabajadas*500)
					+ (this.cantHijos*1000)
					- (sueldoBasico *0.13);
		}


	}
