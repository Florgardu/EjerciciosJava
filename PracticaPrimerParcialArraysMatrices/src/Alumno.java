
public class Alumno {

	private int legajo;
	private String apellido;
	private int edad;
	
	
	
	public Alumno(int legajo, String apellido, int edad) {
		super();
		this.legajo = legajo;
		this.apellido = apellido;
		this.edad = edad;
	}



	public int getLegajo() {
		return legajo;
	}



	public String getApellido() {
		return apellido;
	}



	public int getEdad() {
		return edad;
	}



	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	

}