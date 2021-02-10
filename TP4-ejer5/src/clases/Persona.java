package clases;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private int telefono;
	private String mail;
	
	
//constructor
	
	public Persona(String nombre, String apellido, String dni, int telefono, String mail) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.mail = mail;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDni() {
		return dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono
				+ ", mail=" + mail + "]";
	}

	
	
	
}
