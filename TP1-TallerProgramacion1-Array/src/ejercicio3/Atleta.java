package ejercicio3;

public class Atleta {
	
	
	private String nombre;
	private double segundosCarrera;
	
	
	public Atleta(String nombre, double segundosCarrera) {
		super();
		this.nombre = nombre;
		this.segundosCarrera = segundosCarrera;
	}


	public String getNombre() {
		return nombre;
	}


	public double getSegundosCarrera() {
		return segundosCarrera;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setSegundosCarrera(double segundosCarrera) {
		this.segundosCarrera = segundosCarrera;
	}


	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", segundosCarrera=" + segundosCarrera + "]";
	}
	
	
	

}
