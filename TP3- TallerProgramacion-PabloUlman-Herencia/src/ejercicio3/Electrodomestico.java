package ejercicio3;

public class Electrodomestico {
	
	
	//  marca, el modelo, el número de serie, el voltaje, el estado
	// (encendido/apagado) y el precio.
	
	private String marca;
	private String modelo;
	private int numeroSerie;
	private int voltaje;
	private boolean estaEncendido;
	private double precio;
	
	
	public Electrodomestico(String marca, String modelo, int numeroSerie, int voltaje, boolean estaEncendido,
			double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.voltaje = voltaje;
		this.estaEncendido = false;
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public int getNumeroSerie() {
		return numeroSerie;
	}


	public int getVoltaje() {
		return voltaje;
	}


	public boolean isEstaEncendido() {
		return estaEncendido;
	}


	public double getPrecio() {
		return precio;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}


	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}


	public void setEstaEncendido(boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "marca=" + marca + ", modelo=" + modelo + ", numeroSerie=" + numeroSerie + ", voltaje="
				+ voltaje + ", estaEncendido=" + estaEncendido + ", precio=" + precio + "";
	}
	
	

}
