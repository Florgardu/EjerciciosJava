package ejercicio6;

public class Cliente {

	private String apellido;
	private String dni;
	private String email;
	private String direccionEnvio;

	public Cliente(String apellido, String dni, String email, String direccionEnvio) {
		super();
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.direccionEnvio = direccionEnvio;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDni() {
		return dni;
	}

	public String getEmail() {
		return email;
	}

	public String getDireccionEnvio() {
		return direccionEnvio;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}

	@Override
	public String toString() {
		return "Cliente [apellido=" + apellido + ", dni=" + dni + ", email=" + email + ", direccionEnvio="
				+ direccionEnvio + "]";
	}

}
