
public class Cocinero extends PersonalCocina {

	private int aniosExperiencia;

	public Cocinero(String nombre, int numeroLegajo, String fechaIngreso, String nombreART, int aniosExperiencia) {
		super(nombre, numeroLegajo, fechaIngreso, nombreART);
		this.aniosExperiencia = aniosExperiencia;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		return "Cocinero [aniosExperiencia=" + aniosExperiencia + "]";
	}

	
	
	
	
}
