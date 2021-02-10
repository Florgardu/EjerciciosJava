package clases;

public abstract class Servicio implements Facturable {

	private int cantidadHorasOcupadas;
	private int valorPorHora;
	private final double IVA = 21;

	public Servicio(int cantidadHorasOcupadas, int valorPorHora) {
		this.cantidadHorasOcupadas = cantidadHorasOcupadas;
		this.valorPorHora = valorPorHora;
	}

	// Para los servicios, se suma la mitad del IVA sobre su precio.
	public double calcularMontoFacturacion() {
		double montoTotal = Matematica.sumarPorcentaje(this.calcularPrecio(), this.getIVA()/2);
		return montoTotal;
	}

	public abstract double calcularPrecio();

	public int getCantidadHorasOcupadas() {
		return cantidadHorasOcupadas;
	}

	public int getValorPorHora() {
		return valorPorHora;
	}

	public double getIVA() {
		return IVA;
	}

	public void setCantidadHorasOcupadas(int cantidadHorasOcupadas) {
		this.cantidadHorasOcupadas = cantidadHorasOcupadas;
	}

	public void setValorPorHora(int valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

}
