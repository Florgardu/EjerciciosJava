package clases;

public class Alumno {

	private String dni;
	private String nombre;
	private int deuda;
	private Nivel nivel;
	private Estado estado;

	public Alumno(String dni, String nombre, Nivel nivel) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.nivel=nivel; 
		this.deuda=0;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDeuda() {
		return deuda;
	}

	public Nivel getNivel() {
		return nivel;
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

	public void setDeuda(int deuda) {
		this.deuda = deuda;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", deuda=" + deuda + ", nivel=" + nivel + ", estado="
				+ estado + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deuda;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((nivel == null) ? 0 : nivel.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (deuda != other.deuda)
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (estado != other.estado)
			return false;
		if (nivel != other.nivel)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	

}
