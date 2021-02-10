package clases;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;
	private Fecha fechaDeNacimiento;
	private Domicilio domicilio;
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public Fecha getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	
	// constructor 	
	public Persona(String dni, String nombre, String apellido, Fecha fechaDeNacimiento, Domicilio domicilio) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.domicilio = domicilio;
	}
	
	
	public String nombreCompleto () {
		
		return (this.nombre + " " + this.apellido); 
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento="
				+ fechaDeNacimiento + ", domicilio=" + domicilio + "]";
	}
	
	
	
	

}
