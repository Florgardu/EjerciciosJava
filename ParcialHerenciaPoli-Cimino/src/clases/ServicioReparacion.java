package clases;

public class ServicioReparacion extends Servicio {

	private static final double VALOR_HORA = 180;
	private static final int PORCENTAJE_INCREMENTO = 25;
	private int dificultad;

	public ServicioReparacion(int cantidadHorasOcupadas, int VALOR_HORA, int dificultad) {
		super(cantidadHorasOcupadas, VALOR_HORA);
		this.setDificultad(dificultad);
	}

	// Para calcular su precio, se multiplican la cantidad de
	// horas del servicio por el valor por
	// hora, el cual es de $180.
	// Si el nivel de dificultad es mayor a 3, se incrementa en precio en un 25%.

	@Override
	public double calcularPrecio() {
		
		double precio = VALOR_HORA * super.getCantidadHorasOcupadas();
		if (this.dificultad > 3) {
			precio = Matematica.sumarPorcentaje(precio, PORCENTAJE_INCREMENTO);
		}
		return precio;
	}

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		if (dificultad < 1 || dificultad > 5) {
			throw new IllegalArgumentException("El número de dificultad es inválido");
		} else {
			this.dificultad = dificultad;
		}
	}

	public boolean soyDificultadMayorA(int nivelDificultad) {
		return this.dificultad > nivelDificultad;
	}

}
