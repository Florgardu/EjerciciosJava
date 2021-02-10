package polimorfismoEj;

public class VehiculoTurismo extends Vehiculo {

	private int nPuertas;

	public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
		super(matricula, marca, modelo);
		this.nPuertas = nPuertas;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	
	
	
	@Override
	public String mostrarDatos () {
		return "Matricula: " + this.matricula + "\nMarca:  " + this.marca +  "\nModelo:  " + this.modelo + "\nPuertas: " + this.nPuertas;

	}


}
