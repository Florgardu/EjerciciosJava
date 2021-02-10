package clases;

public class Propietaria {

	private String nombre;
	private String dni;
	

	public Propietaria(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Propietaria [nombre=" + nombre + ", dni=" + dni + "]";
	}

	

	
	
}
