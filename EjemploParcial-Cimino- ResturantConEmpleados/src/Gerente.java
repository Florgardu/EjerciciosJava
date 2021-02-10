
public class Gerente extends Empleado {
	
	private ConvenioSindical convenio;

	public Gerente(String nombre, int numeroLegajo, String fechaIngreso, ConvenioSindical convenio) {
		super(nombre, numeroLegajo, fechaIngreso);
		this.convenio = convenio;
	}

	public ConvenioSindical getConvenio() {
		return convenio;
	}

	public void setConvenio(ConvenioSindical convenio) {
		this.convenio = convenio;
	}
	

	
	
	
	
}
