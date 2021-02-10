package ejercicio5;

public class Alumno extends Persona {
	
	private int numeroLegajo;
	

	public Alumno(String nombreCompleto, int anioNacimiento, int dni) {
		super(nombreCompleto, anioNacimiento);
		if (!RANGO_NRO_DOCUMENTO.incluye(dni)) {
			throw new IllegalArgumentException("El dni no esta en los rangos validos");
		} else {
			this.numeroLegajo=dni;
		}
		
		// TODO Auto-generated constructor stub
	}
	
	
	public static final RangoDeEnteros RANGO_NRO_DOCUMENTO = new
			RangoDeEnteros(10000000, 50000000);


	public int getNumeroLegajo() {
		return numeroLegajo;
	}


	public static RangoDeEnteros getRangoNroDocumento() {
		return RANGO_NRO_DOCUMENTO;
	}


	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}


	@Override
	public String toString() {
		return "Alumno [numeroLegajo=" + numeroLegajo + ", getNombreCompleto()=" + getNombreCompleto()
				+ ", getAnioNacimiento()=" + getAnioNacimiento() + "]";
	}
	
	

	

	

}
