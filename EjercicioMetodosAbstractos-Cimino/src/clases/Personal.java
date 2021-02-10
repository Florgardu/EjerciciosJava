package clases;

public abstract class Personal {
	
	private String numeroDni;
	private String nombre;
	private String apellido;
	private int anioIngreso;
	
	
	
	// constructor 
	
	
	public Personal(String numeroDni, String nombre, String apellido, int anioIngreso) {
		super();
		this.numeroDni = numeroDni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioIngreso = anioIngreso;
	}
	
	
	
	// metodo abstracto
	
	public abstract double calcularSalario();
	

	
	
	// getter y setters 
	public String getNumeroDni() {
		return numeroDni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getAnioIngreso() {
		return anioIngreso;
	}
	public void setNumeroDni(String numeroDni) {
		this.numeroDni = numeroDni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	} 
	
	
	
	
	

}
