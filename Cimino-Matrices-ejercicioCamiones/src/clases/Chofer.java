package clases;

public class Chofer {
	
	
	private String idChofer;
	private String nombre;
	private double honorarioPorViaje;
	
	
	public Chofer(String idChofer, String nombre, double honorarioPorViaje) {
		super();
		this.idChofer = idChofer;
		this.nombre = nombre;
		this.honorarioPorViaje = honorarioPorViaje;
	}


	public String getIdChofer() {
		return idChofer;
	}


	public String getNombre() {
		return nombre;
	}


	public double getHonorarioPorViaje() {
		return honorarioPorViaje;
	}


	public void setIdChofer(String idChofer) {
		this.idChofer = idChofer;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setHonorarioPorViaje(double honorarioPorViaje) {
		this.honorarioPorViaje = honorarioPorViaje;
	}


	@Override
	public String toString() {
		return "Chofer [idChofer=" + idChofer + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
	

}
