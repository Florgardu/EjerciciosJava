package ejercicio1;

public class Subcontratado extends Empleado {

	
	private double cantHoras;
	private double precioHora;
	
	public Subcontratado(String nombre, int edad, double cantHoras, double precioHora) {
		super(nombre, edad);
		this.cantHoras=cantHoras;
		this.precioHora=precioHora;
	}

	@Override
	public double calcularPago() {
		return this.precioHora*this.cantHoras;
	}


	@Override
	public String toString() {
		return "Subcontratado [cantHoras=" + cantHoras + ", precioHora=" + precioHora + ", toString()="
				+ super.toString() + "]";
	}

	public double getCantHoras() {
		return cantHoras;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setCantHoras(double cantHoras) {
		this.cantHoras = cantHoras;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}


	
	
	
	
	
}
