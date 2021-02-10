package ejercicio3;

public class Heladera extends Electrodomestico {
	
	// De la heladera sabemos la capacidad (en litros) y si es no frost
	
	
	private int capacidadLitros;
	private boolean esFrost;
	
	
	public Heladera(String marca, String modelo, int numeroSerie, int voltaje, boolean estaEncendido, double precio,
			int capacidadLitros, boolean esFrost) {
		super(marca, modelo, numeroSerie, voltaje, estaEncendido, precio);
		this.capacidadLitros = capacidadLitros;
		this.esFrost = esFrost;
	}


	public int getCapacidadLitros() {
		return capacidadLitros;
	}


	public boolean isEsFrost() {
		return esFrost;
	}


	public void setCapacidadLitros(int capacidadLitros) {
		this.capacidadLitros = capacidadLitros;
	}


	public void setEsFrost(boolean esFrost) {
		this.esFrost = esFrost;
	}


	@Override
	public String toString() {
		return "Heladera capacidadLitros=" + capacidadLitros + ", esFrost=" + esFrost + " "
				+ super.toString() + "]";
	} 
	
	
	
	
	
}
