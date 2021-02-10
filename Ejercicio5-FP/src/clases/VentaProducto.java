package clases;

public class VentaProducto {
	
	private Producto productoVendido;
	private int cantidad;
	
	
	
	public VentaProducto(Producto productoVendido, int cantidad) {
		super();
		this.productoVendido = productoVendido;
		this.cantidad = cantidad;
	}



	public Producto getProductoVendido() {
		return productoVendido;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setProductoVendido(Producto productoVendido) {
		this.productoVendido = productoVendido;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	@Override
	public String toString() {
		return "VentaProducto [productoVendido=" + productoVendido + ", cantidad=" + cantidad + "]";
	}
	
	
	
	

}
