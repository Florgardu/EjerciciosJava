package clases;

public class Alumno {

	private String dni;
	private String nombre;
	private String apellido;
	private int notaPrimerParcial;
	private int notaSegundoParcial;
	private Estado estado;
	private boolean tienePrimerNota=false;
	private boolean tieneSegundaNota=false; 

	public Alumno(String dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getNotaPrimerParcial() {
		return notaPrimerParcial;
	}

	public int getNotaSegundoParcial() {
		return notaSegundoParcial;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNotaPrimerParcial(int notaPrimerParcial) {
		this.notaPrimerParcial = notaPrimerParcial;
		this.tienePrimerNota=true;
	}

	public void setNotaSegundoParcial(int notaSegundoParcial) {
		this.notaSegundoParcial = notaSegundoParcial;
		this.tieneSegundaNota=true;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public boolean isTienePrimerNota() {
		return tienePrimerNota;
	}

	public boolean isTieneSegundaNota() {
		return tieneSegundaNota;
	}

	public void setTienePrimerNota(boolean tienePrimerNota) {
		this.tienePrimerNota = tienePrimerNota;
	}

	public void setTieneSegundaNota(boolean tieneSegundaNota) {
		this.tieneSegundaNota = tieneSegundaNota;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", notaPrimerParcial="
				+ notaPrimerParcial + ", notaSegundoParcial=" + notaSegundoParcial + ", estado=" + estado
				+ ", tienePrimerNota=" + tienePrimerNota + ", tieneSegundaNota=" + tieneSegundaNota + "]";
	}
	

	

}
