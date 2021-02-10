package clases;

public abstract class Producto {

	
	private int codigo;
	private String nombre;
	private double precio;
	private boolean esAptoCeliaco;

	
	public Producto(int codigo, String nombre, double precio, boolean esAptoCeliaco) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.esAptoCeliaco = esAptoCeliaco;
	}
	
	
	public abstract double getPrecioConDescuento();
	
	
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public boolean isEsAptoCeliaco() {
		return esAptoCeliaco;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setEsAptoCeliaco(boolean esAptoCeliaco) {
		this.esAptoCeliaco = esAptoCeliaco;
	}
	
	
	
	
}
