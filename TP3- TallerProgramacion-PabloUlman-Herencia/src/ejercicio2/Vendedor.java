package ejercicio2;

public class Vendedor extends Subcontratado {

	private double porcentaje;
	
	
	
	public Vendedor(String nombre, int edad, double cantHoras, double precioHora, double porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje=porcentaje;
		// TODO Auto-generated constructor stub
	}

	
	public double calcularPago() {		
		
		double porcentajeExtra= (super.calcularPago()*this.porcentaje)/100;
		return super.calcularPago() + porcentajeExtra;
		
	}


	@Override
	public String toString() {
		return super.toString()+ "Vendedor [porcentaje=" + porcentaje + "]";
	}
	
	
	
}

