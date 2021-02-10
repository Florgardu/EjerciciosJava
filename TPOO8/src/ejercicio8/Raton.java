package ejercicio8;

public class Raton {

	private int energia;
	private final int RESISTENCIA = 2;

	public Raton(int energia) {
		super();
		this.energia = energia;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	@Override
	public String toString() {
		return "Raton [energia=" + energia + "]";
	}

	public int obtenerMetrosPorEnergia() {
		int distancia = 0;
		if (this.energia > 0) {
			distancia = this.energia / RESISTENCIA;
		}
		return distancia;
	}

}
