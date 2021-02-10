package ejercicio2;

public class Cancion {
	
	private String nombre; 
	private double duracion;
	public String getNombre() {
		return nombre;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public Cancion(String nombre, double duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", duracion=" + duracion + "]";
	} 
	
	
	
	

}
