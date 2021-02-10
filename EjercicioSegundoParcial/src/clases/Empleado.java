package clases;

public class Empleado {
	
	private String dni;
	private String nombreApellido;
	private Cargo puestoEnEmpresa; 
	private Dieta preferenciaComida; 
	
	
	public Empleado(String dni, String nombreApellido, Cargo puestoEnEmpresa, Dieta preferenciaComida) {
		
		this.dni = dni;
		this.nombreApellido = nombreApellido;
		this.puestoEnEmpresa = puestoEnEmpresa;
		this.preferenciaComida = preferenciaComida;
		
	}


	public String getDni() {
		return dni;
	}


	public String getNombreApellido() {
		return nombreApellido;
	}


	public Cargo getPuestoEnEmpresa() {
		return puestoEnEmpresa;
	}


	public Dieta getPreferenciaComida() {
		return preferenciaComida;
	}


	


	public void setDni(String dni) {
		this.dni = dni;
	}


	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}


	public void setPuestoEnEmpresa(Cargo puestoEnEmpresa) {
		this.puestoEnEmpresa = puestoEnEmpresa;
	}


	public void setPreferenciaComida(Dieta preferenciaComida) {
		this.preferenciaComida = preferenciaComida;
	}


	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombreApellido=" + nombreApellido + ", puestoEnEmpresa=" + puestoEnEmpresa
				+ ", preferenciaComida=" + preferenciaComida + "]";
	}


	


	
	

}
