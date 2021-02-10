package ejercicio3;

public class Licuadora extends Electrodomestico {
	
	// la licuadora sabemos la potencia (en watts) y la cantidad de velocidades.

	
	private int potencia;
	private int cantVelocidades;
	
	
	public Licuadora(String marca, String modelo, int numeroSerie, int voltaje, boolean estaEncendido, double precio,
			int potencia, int cantVelocidades) {
		super(marca, modelo, numeroSerie, voltaje, estaEncendido, precio);
		this.potencia = potencia;
		this.cantVelocidades = cantVelocidades;
	}


	public int getPotencia() {
		return potencia;
	}


	public int getCantVelocidades() {
		return cantVelocidades;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public void setCantVelocidades(int cantVelocidades) {
		this.cantVelocidades = cantVelocidades;
	}


	@Override
	public String toString() {
		return "Licuadora + potencia=" + potencia + ", cantVelocidades=" + cantVelocidades + " " + super.toString();
	}
	
	
	
	
	
}
