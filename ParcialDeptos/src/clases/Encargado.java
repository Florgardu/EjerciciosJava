package clases;

public class Encargado {
	
	
	private String nombre;

	public Encargado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Encargado [nombre=" + nombre + "]";
	}
	
	
	

}
