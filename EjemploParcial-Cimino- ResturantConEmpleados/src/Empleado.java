
public abstract class Empleado {
	
	
	private String nombre;
	private int numeroLegajo;
	private String fechaIngreso;
	
	
	public Empleado(String nombre, int numeroLegajo, String fechaIngreso) {
		this.nombre = nombre;
		this.numeroLegajo = numeroLegajo;
		this.fechaIngreso = fechaIngreso;
	}


	public String getNombre() {
		return nombre;
	}


	public int getNumeroLegajo() {
		return numeroLegajo;
	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
	
	

}
