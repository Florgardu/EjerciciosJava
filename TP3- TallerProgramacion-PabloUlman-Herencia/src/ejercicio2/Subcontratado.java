package ejercicio2;

public class Subcontratado extends Empleado {

	
	private double cantHoras;
	private double precioHora;
	
	public Subcontratado(String nombre, int edad, double cantHoras, double precioHora) {
		super(nombre, edad);
		this.setCantHoras(cantHoras);
		this.precioHora=precioHora;
	}

	@Override
	public double calcularPago() {
		return this.precioHora*this.getCantHoras();
	}


	@Override
	public String toString() {
		return "Subcontratado [cantHoras=" + getCantHoras() + ", precioHora=" + precioHora + ", toString()="
				+ super.toString() + "]";
	}

	public double getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(double cantHoras) {
		this.cantHoras = cantHoras;
	}


	
	
	
	
	
}
