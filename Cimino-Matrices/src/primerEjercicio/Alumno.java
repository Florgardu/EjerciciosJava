package primerEjercicio;

public class Alumno {
	
	
	private int legajo ;
	private String apellido;
	private int edad;
	
	
	public Alumno(int legajo, String apellido, int edad) {
		this.legajo = legajo;
		this.apellido = apellido;
		this.edad = edad;
	}


	public String getApellido() {
		return apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	

	
	
	
}
