package clases;

public class VendedorSupervisor extends Vendedor implements Plus {

	private int vendedoresACargo;
	

	public VendedorSupervisor(String nombre, int nroLegajo, double sueldo, String fechaIngreso, int vendedoresACargo) {
		super(nombre, nroLegajo, sueldo, fechaIngreso);
		this.vendedoresACargo = vendedoresACargo;
	}

	
	@Override
	public double calcularPlus() {
		double porcentajePlus=20;
		double plusDeSueldo= super.getSueldo()*(porcentajePlus/100);
		return plusDeSueldo;
	}


	@Override
	public double getSueldo() {
		return super.getSueldo()+calcularPlus();
	}
	
	
}
