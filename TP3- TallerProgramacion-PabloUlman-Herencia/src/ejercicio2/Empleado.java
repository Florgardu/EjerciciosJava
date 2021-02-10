package ejercicio2;

public class Empleado {
	
	private String nombre;
	private int edad;
	
	
	
	
	
	public Empleado(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}




	public double calcularPago() {
		return 0.0f; 
	}
	
	public String toString(){return "[Nombre=" + nombre + ", edad=" + edad + "]";}




	public String getNombre() {
		return nombre;
	}




	public int getEdad() {
		return edad;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	} 

	
	
	
}
