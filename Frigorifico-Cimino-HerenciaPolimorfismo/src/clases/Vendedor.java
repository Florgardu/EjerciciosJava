package clases;

public class Vendedor {
	
	private String nombre;
	private int nroLegajo;
	private double sueldo;
	private String fechaIngreso;
	
	
	public Vendedor(String nombre, int nroLegajo, double sueldo, String fechaIngreso) {
		this.nombre = nombre;
		this.nroLegajo = nroLegajo;
		this.sueldo = sueldo;
		this.fechaIngreso = fechaIngreso;
	}


	public String getNombre() {
		return nombre;
	}


	public int getNroLegajo() {
		return nroLegajo;
	}


	public double getSueldo() {
		return sueldo;
	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
	
	
	
	

}
