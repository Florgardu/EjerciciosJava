
public class PersonalCocina extends Empleado {

	private String nombreART;

	
	public PersonalCocina(String nombre, int numeroLegajo, String fechaIngreso, String nombreART) {
		super(nombre, numeroLegajo, fechaIngreso);
		this.nombreART = nombreART;
	}


	public String getNombreART() {
		return nombreART;
	}


	public void setNombreART(String nombreART) {
		this.nombreART = nombreART;
	}
	
	
	
	
	
	
	
	
}
