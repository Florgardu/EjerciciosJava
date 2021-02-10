package ejercicio4;

public class Habilidad {
	
	
	private int cantidadKilos;
	private String nombreTruco;

	public Habilidad(int cantidadKilos, String nombre) {
		this.cantidadKilos = cantidadKilos;
		this.nombreTruco=nombre;
	}

	public int getCantidadKilos() {
		return cantidadKilos;
	}

	public String getNombreTruco() {
		return nombreTruco;
	}

	public void setCantidadKilos(int cantidadKilos) {
		this.cantidadKilos = cantidadKilos;
	}

	public void setNombreTruco(String nombreTruco) {
		this.nombreTruco = nombreTruco;
	}
	
	
	

}
