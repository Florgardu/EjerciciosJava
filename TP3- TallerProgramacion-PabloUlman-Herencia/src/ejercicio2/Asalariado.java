package ejercicio2;

public class Asalariado extends Empleado {
	
	private double sueldo;

	public Asalariado(String nombre, int edad, double sueldo) {
		super(nombre, edad);
		this.sueldo=sueldo;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double calcularPago(){
		return this.sueldo;
				}


	@Override
	public String toString() {
		return super.toString()+ "Asalariado [sueldo=" + sueldo + "]";
	}	
	
	
	
	
}
