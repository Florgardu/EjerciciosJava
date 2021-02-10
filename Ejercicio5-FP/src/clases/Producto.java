package clases;

public class Producto {
	
	private String nombre;
	private int stock;

	
	public Producto(String nombre, int stock) {
		super();
		this.nombre = nombre;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", stock=" + stock + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setStock(int stock) {
		this.stock = stock;
	} 
	
	
	public void bajarStock (int cantidadComprada) {
		this.stock= this.stock-cantidadComprada;
	}
	

}
