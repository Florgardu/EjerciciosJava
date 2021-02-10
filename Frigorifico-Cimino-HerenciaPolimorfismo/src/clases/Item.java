package clases;

public class Item {

	
	private Producto producto;
	private int cantidad;
	
	
	
	public Item(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	} 
	
	public double calcularTotal() {
	    double precio= this.producto.getPrecioConDescuento();
		 double total= precio*this.cantidad;
		 return total;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Item [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	
	
}
