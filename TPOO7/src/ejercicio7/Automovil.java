package ejercicio7;

public class Automovil {

	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTotalCombustible;
	private double cantidadCombustible;
	private double kmPorLitro;

	public Automovil(String marca, String modelo, String patente) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPatente() {
		return patente;
	}

	public double getCapacidadTotalCombustible() {
		return capacidadTotalCombustible;
	}

	public double getCantidadCombustible() {
		return cantidadCombustible;
	}

	public double getKmPorLitro() {
		return kmPorLitro;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public void setCapacidadTotalCombustible(double capacidadTotalCombustible) {
		this.capacidadTotalCombustible = capacidadTotalCombustible;
	}

	public void setCantidadCombustible(double cantidadCombustible) {
		this.cantidadCombustible = cantidadCombustible;
	}

	public void setKmPorLitro(double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente
				+ ", capacidadTotalCombustible=" + capacidadTotalCombustible + ", cantidadCombustible="
				+ cantidadCombustible + ", kmPorLitro=" + kmPorLitro + "]";
	}

	public boolean viajar(double kmRecorrer) {
		double consumoCombustible = (kmRecorrer / kmPorLitro);
		boolean puedeViajar = cantidadCombustible > 0;
		if (puedeViajar) {
			cantidadCombustible = cantidadCombustible - consumoCombustible;
		}

		return puedeViajar;
	}

	private boolean verificarCantidadCombustible(double cantidadNaftaACargar) {
		double disponibleNaftaACargar = capacidadTotalCombustible - cantidadCombustible;
		boolean sePuedeCargar = cantidadNaftaACargar <= disponibleNaftaACargar;
		return sePuedeCargar;
	}

	
	public boolean cargarCombustible(double cantidadNaftaACargar) {
		boolean sePuedeCargarCombustible = verificarCantidadCombustible(cantidadNaftaACargar);
		if (sePuedeCargarCombustible) {
			cantidadCombustible = cantidadCombustible + cantidadNaftaACargar;
		}
		return sePuedeCargarCombustible;
	}

}
