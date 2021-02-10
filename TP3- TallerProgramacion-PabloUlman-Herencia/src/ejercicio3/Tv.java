package ejercicio3;

public class Tv extends Electrodomestico {
	
	private int dimension;
	private boolean esSmart; 
	
	
	public Tv(String marca, String modelo, int numeroSerie, int voltaje, boolean estaEncendido, double precio, int dimension) {
		super(marca, modelo, numeroSerie, voltaje, estaEncendido, precio);
		this.dimension= dimension;
		this.esSmart=estaEncendido;
	}


	public int getDimension() {
		return dimension;
	}


	public boolean isEsSmart() {
		return esSmart;
	}


	public void setDimension(int dimension) {
		this.dimension = dimension;
	}


	public void setEsSmart(boolean esSmart) {
		this.esSmart = esSmart;
	}


	@Override
	public String toString() {
		return "Televisión " + this.dimension + " pulgadas " + super.toString();
	}
	
	

}
