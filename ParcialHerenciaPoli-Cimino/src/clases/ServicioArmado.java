package clases;

public class ServicioArmado extends Servicio {
	
	private final double VALOR_HORA=250;
	

	public ServicioArmado(int cantidadHorasOcupadas, int VALOR_HORA) {
		super(cantidadHorasOcupadas, VALOR_HORA);
	}

	
	@Override
	// Para calcular su precio, se
	// multiplican la cantidad de horas del servicio 
	// por el valor por hora, el cual es de $250.
	public double calcularPrecio() {
		return super.getCantidadHorasOcupadas()*this.VALOR_HORA;
			
	}

   
	

}
