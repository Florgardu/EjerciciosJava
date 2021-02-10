
public class Chef extends PersonalCocina{
	
	private String titulo;

	public Chef(String nombre, int numeroLegajo, String fechaIngreso, String nombreART, String titulo) {
		super(nombre, numeroLegajo, fechaIngreso, nombreART);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Chef [titulo=" + titulo + "]";
	}

	
	
	

}
