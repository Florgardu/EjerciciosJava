package ort.ar;

public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;
	
	
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima=capacidadMaxima;
		this.cantidadActual= cantidadActual;
	}


	public Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = capacidadMaxima;
	}


	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}


	public int getCantidadActual() {
		return cantidadActual;
	}


	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}


	public void setCantidadActual(int cantidadActual) {
		// esto es solo para probar que no me paso
		if(cantidadActual > capacidadMaxima) {
			System.out.println("hubo un problema porque me pase");
		}
		
		// fin prueba
		this.cantidadActual = cantidadActual;
	}
	
	
	public void llenarCafetera () {
		cantidadActual=capacidadMaxima;
	}
	
	
	public void servirTaza (int capacidadTaza) {
		
		if (cantidadActual<capacidadTaza) {
			cantidadActual=0;
			
		} else {
			cantidadActual = cantidadActual - capacidadTaza;
		}
		
	}
	
	public void vaciarCafetera (){
		cantidadActual=0;
	}
	
	
	
	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}


	public void agregarCafe (int cantidadAgregar) {
		if(cantidadAgregar + cantidadActual > capacidadMaxima) {
			// me pasaria
			System.out.println("si pongo todo me paso...no lo hago");
			llenarCafetera();
		} else {
			cantidadActual = cantidadAgregar + cantidadActual;
		}
	}
	
}
