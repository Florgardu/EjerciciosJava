package ejercicio6;

public class Vuelo {
	
	
	//*origen (String), destino (String), fecha
	//*(String), numero (int), capacidadTotal (int), asientosOcupados (int). //*

	
	private String origen;
	private String destino;
	private String fecha;
	private int numero;
	private int capacidadTotal;
	private int asientosOcupados;
	
	
	public Vuelo(String origen, String destino, String fecha, int numero, int capacidadTotal) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.numero = numero;
		this.capacidadTotal = capacidadTotal;
	} 
	
	
	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public String getFecha() {
		return fecha;
	}

	public int getNumero() {
		return numero;
	}

	public int getCapacidadTotal() {
		return capacidadTotal;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCapacidadTotal(int capacidadTotal) {
		this.capacidadTotal = capacidadTotal;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		
		this.asientosOcupados = asientosOcupados;
	}



	@Override
	public String toString() {
		return "Vuelo [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", numero=" + numero
				+ ", capacidadTotal=" + capacidadTotal + ", asientosOcupados=" + asientosOcupados + "]";
	}


	public boolean reservar(int cantidadAsientosReservar) {
		boolean sePuedeReservar = false;
		int asientosDisponibles = capacidadTotal - asientosOcupados;
		if (cantidadAsientosReservar < asientosDisponibles) {
			sePuedeReservar = true;
			asientosOcupados = asientosOcupados + cantidadAsientosReservar;
		}
		return sePuedeReservar;
	}
	
/*
	public boolean liberararAsientos (int cantidadAsientosLiberar) {
		boolean sePuedeLiberar=false; 
		if (cantidadAsientosLiberar<=asientosOcupados) {
			sePuedeLiberar = true;
			asientosOcupados=asientosOcupados-cantidadAsientosLiberar;
		}
		return sePuedeLiberar; 
	}
	*/
	
	public boolean liberararAsientos (int cantidadAsientosLiberar) {
		boolean sePuedeLiberar = cantidadAsientosLiberar<=asientosOcupados; 
		if (sePuedeLiberar) {
			asientosOcupados = asientosOcupados-cantidadAsientosLiberar;
		}
		return sePuedeLiberar; 
	}
}
