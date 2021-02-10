package ejercicioIntegrador;

public abstract class Poligono {

	protected int numeroLados;

	public Poligono(int numeroLados) {
		
		this.numeroLados = numeroLados;
	}
	
	public Poligono(int numeroLados, int x) {
		
		this.numeroLados = numeroLados;
	}
	
	public Poligono() {
		
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	@Override
	public String toString() {
		return "Poligono [numeroLados=" + numeroLados + "]";
	}
	
	
	public abstract double area ();
	
	
	
}
