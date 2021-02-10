package ejercicio6;

public class Stock {
	
	
	private Libro libro;
	private int cantidad;
	
	
	public Stock(Libro libro, int cantidad) {
		super();
		this.libro = libro;
		this.cantidad = cantidad;
	}


	public Libro getLibro() {
		return libro;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Stock [libro=" + libro + ", cantidad=" + cantidad + "]";
	}
	
	
	public void restarUno () {
		this.cantidad= this.cantidad-1;
	}
	
	
	
	
	

}
