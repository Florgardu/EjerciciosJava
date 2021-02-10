package clases;

public class ItemCompra {

	private String nombreProducto;
	private double precioUnitario;
	private int cantidadComprada;
	
	
	public ItemCompra(String nombreProducto, double precioUnitario, int cantidadComprada) {
		super();
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
		this.cantidadComprada = cantidadComprada;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public int getCantidadComprada() {
		return cantidadComprada;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public void setCantidadComprada(int cantidadComprada) {
		this.cantidadComprada = cantidadComprada;
	} 
	

	
	
	
	
	
}
