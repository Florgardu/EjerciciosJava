package ejercicioSucursales;

public abstract class Producto {
	
	
	private String id;
	private String descripcion;
	private double precioLista;
	private int stock;
	
	
	public Producto(String id, String descripcion, double precioLista, int stock) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precioLista = precioLista;
		this.stock = stock;
	}
	
	
	public abstract double calcularPrecioVenta ();


	public String getId() {
		return id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public double getPrecioLista() {
		return precioLista;
	}


	public int getStock() {
		return stock;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public void setPrecioLista(double precioLista) {
		this.precioLista = precioLista;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public void descontarCompra (int cantidad) {
		this.stock=this.stock-cantidad;
	}
	
	
	public abstract boolean seVendio ();
	
	
	

}
