package ejercicio4tp;

public class Propiedades {

	private String direccion;
	private int precio;
	private String tipo;
	
	
	public Propiedades(String direccion, int precio, String tipo) {
		super();
		this.direccion = direccion;
		this.precio = precio;
		this.tipo = tipo;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getPrecio() {
		return precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Propiedades [direccion=" + direccion + ", precio=" + precio + ", tipo=" + tipo + "]";
	} 
	
	
	
	
}
