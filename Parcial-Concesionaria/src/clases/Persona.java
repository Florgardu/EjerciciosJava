package clases;

public class Persona {
	
	private String dni;
	private String fechaNac;
	
	
	public Persona(String dni, String fechaNac) {
		super();
		this.dni = dni;
		this.fechaNac = fechaNac;
	}
	public String getDni() {
		return dni;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", fechaNac=" + fechaNac + "]";
	} 
	
	
	
	

}
