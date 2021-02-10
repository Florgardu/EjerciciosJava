package clases;

public class Aplicacion {
	
	
	private String nombre;
	private int tamañoMB;
	private String fecha;
	
	
	public Aplicacion(String nombre, int tamañoMB, String fecha) {
		super();
		this.nombre = nombre;
		this.tamañoMB = tamañoMB;
		this.fecha = fecha;
	}


	public String getNombre() {
		return nombre;
	}


	public int getTamañoMB() {
		return tamañoMB;
	}


	public String getFecha() {
		return fecha;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setTamañoMB(int tamañoMB) {
		this.tamañoMB = tamañoMB;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "Aplicacion [nombre=" + nombre + ", tamañoMB=" + tamañoMB + ", fecha=" + fecha + "]";
	}
	
	
	

}
