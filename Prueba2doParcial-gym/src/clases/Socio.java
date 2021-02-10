package clases;

public class Socio {
	
	
	private String dni;
	private String nombre;
	private int deuda; 
	private Estado estadoDeuda;
	private Categoria tipoCategoriaPertenece; 
	
	
	
	public Socio(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.deuda = deuda=0;
		this.estadoDeuda = Estado.NORMAL;
		this.tipoCategoriaPertenece= Categoria.numero1;
	
	}

	
	


	public Categoria getTipoCategoriaPertenece() {
		return tipoCategoriaPertenece;
	}





	public void setTipoCategoriaPertenece(Categoria tipoCategoriaPertenece) {
		this.tipoCategoriaPertenece = tipoCategoriaPertenece;
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


	public Estado getEstadoDeuda() {
		return estadoDeuda;
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


	public void setEstadoDeuda(Estado estadoDeuda) {
		this.estadoDeuda = estadoDeuda;
	}




	@Override
	public String toString() {
		return "Socio [dni=" + dni + ", nombre=" + nombre + ", deuda=" + deuda + ", estadoDeuda=" + estadoDeuda
				+ ", tipoCategoriaPertenece=" + tipoCategoriaPertenece + "]";
	}


	
	
	
	
	
}
