
public class Mesa {

	private int numero;
	private int cantidadPersonas;
	private boolean estaLibre;

	public Mesa(int numero, int cantidadPersonas) {
		this.numero = numero;
		setCantidadPersonas(cantidadPersonas);
		this.estaLibre = true;
	}

	public int getNumero() {
		return numero;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public boolean isEstaLibre() {
		return estaLibre;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		if (cantidadPersonas > 10) {
			System.out.println("No se puede, supero el limite");
		} else {
			this.cantidadPersonas = cantidadPersonas;
		}

	}

	public void setEstaLibre(boolean estaLibre) {
		this.estaLibre = estaLibre;
	}

	@Override
	public String toString() {
		return "Mesa [numero=" + numero + ", cantidadPersonas=" + cantidadPersonas + ", estaLibre=" + estaLibre + "]";
	}

	
	
	
}
