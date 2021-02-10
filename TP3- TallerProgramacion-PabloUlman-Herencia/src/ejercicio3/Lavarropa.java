package ejercicio3;

public class Lavarropa extends Electrodomestico {
	

	private int cargaMax;
	private String categoria; //  si es automático o semi automático. 

	
	public Lavarropa(String marca, String modelo, int numeroSerie, int voltaje, boolean estaEncendido, double precio, int cargaMax, String categoria) {
		super(marca, modelo, numeroSerie, voltaje, estaEncendido, precio);
		this.cargaMax=cargaMax;
		this.categoria=categoria;
	}


	public int getCargaMax() {
		return cargaMax;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Lavarropa" + " " +  super.toString() + " con carga maxima de " + this.cargaMax + " Categoria : " + this.categoria;
	}
	
	
	
	
	

}
