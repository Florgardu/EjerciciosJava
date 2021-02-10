package ar.com.ort;

public class Persona {

	// atributos
	private String nombre;
	private String apellido;
	private String direccion;
	
	// constructores
	public Persona(String nombre, String apellido, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	
	public Persona() {
	}

	// getters
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	
	// setters
	public void setNombre(String nombre) {
		this.nombre = nombre.toLowerCase();
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "[Nombre:" + nombre + ", Apellido:" + apellido + ", Dirección: " + direccion +"]"; 
	}
	
	
}
