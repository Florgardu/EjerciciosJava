package ejercicio8;

public class Gato {

	private int energia;

	public Gato(int energia) {
		super();
		this.energia = energia;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public boolean alcanzar(Raton raton, int metros) {
		int metrosCorreGato = this.energia;
		int metrosCorreRaton = raton.obtenerMetrosPorEnergia();

		return metrosCorreGato > metros + metrosCorreRaton;
	}

	@Override
	public String toString() {
		return "Gato [energia=" + energia + "]";
	}

}
