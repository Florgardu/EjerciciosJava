package ejercicio4;

public class Personal {
	
	private String nombre;
	private int horarioIngreso;
	private int horarioSalida;
	
	
	public Personal(String nombre, int horarioIngreso, int horarioSalida) {
		super();
		this.nombre = nombre;
		this.horarioIngreso = horarioIngreso;
		this.horarioSalida = horarioSalida;
	}


	public String getNombre() {
		return nombre;
	}


	public int getHorarioIngreso() {
		return horarioIngreso;
	}


	public int getHorarioSalida() {
		return horarioSalida;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setHorarioIngreso(int horarioIngreso) {
		this.horarioIngreso = horarioIngreso;
	}


	public void setHorarioSalida(int horarioSalida) {
		this.horarioSalida = horarioSalida;
	}
	
	
	
	
	

}
