package clases;

public class Paciente {
	
	private String nombre;
	private String apellido;
	private String tel;
	private String dni;
	private Genero tipoGenero;
	
	
	public Paciente(String nombre, String apellido, String tel, String dni, Genero tipoGenero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tel = tel;
		this.dni = dni;
		this.tipoGenero = tipoGenero;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public String getTel() {
		return tel;
	}


	public String getDni() {
		return dni;
	}


	public Genero getTipoGenero() {
		return tipoGenero;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public void setTipoGenero(Genero tipoGenero) {
		this.tipoGenero = tipoGenero;
	}


	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", tel=" + tel + ", dni=" + dni
				+ ", tipoGenero=" + tipoGenero + "]";
	} 
	
	
	
	
	
	

}
