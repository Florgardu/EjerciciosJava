package clases;

public class VendedorSenior extends Vendedor implements Plus{
	
	
	private int aniosExperiencia;
	
	public VendedorSenior(String nombre, int nroLegajo, double sueldo, String fechaIngreso, int aniosExperiencia) {
		super(nombre, nroLegajo, sueldo, fechaIngreso);
		this.aniosExperiencia=aniosExperiencia;
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public double getSueldo() {
		return super.getSueldo()+calcularPlus();
	}

	//• Los vendedores senior tendrán un 
	// 1% extra de sueldo por cada año de antigüedad o experiencia.
	
	@Override
	public double calcularPlus() {
		// TODO Auto-generated method stub
		double sueldoExtra=1;
		double plusExtra= super.getSueldo()*(1/100);
		double plusSueldo= this.aniosExperiencia*plusExtra;
		return plusSueldo;
	}
	
	
	
	

}
