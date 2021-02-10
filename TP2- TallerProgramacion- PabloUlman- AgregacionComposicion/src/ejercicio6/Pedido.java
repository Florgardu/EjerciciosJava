package ejercicio6;

public class Pedido {
	
	
	private int numeroCompra;
	private String fechaCompra;
	private Libro libro;
	private Cliente cliente;
	
	
	
	public Pedido(int numeroCompra, String fechaCompra, Libro libro, Cliente cliente) {
		super();
		this.numeroCompra = numeroCompra;
		this.fechaCompra = fechaCompra;
		this.libro = libro;
		this.cliente = cliente;
	}


	public int getNumeroCompra() {
		return numeroCompra;
	}


	public String getFechaCompra() {
		return fechaCompra;
	}


	public Libro getLibro() {
		return libro;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setNumeroCompra(int numeroCompra) {
		this.numeroCompra = numeroCompra;
	}


	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Pedido [numeroCompra=" + numeroCompra + ", fechaCompra=" + fechaCompra + ", libro=" + libro
				+ ", cliente=" + cliente + "]";
	}
	
	
	

}
