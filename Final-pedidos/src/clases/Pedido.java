package clases;

public class Pedido {

	private int numeroPedido;
	private int codigo;
	private int cantidadPedida;
	private int importePedido;
	private int cantidadPendienteEntrega;
	private Estado estado;
	
	
	
	public Pedido(int numeroPedido, int codigo, int cantidadPedida, int importePedido) {
		this.numeroPedido = numeroPedido;
		this.codigo = codigo;
		this.cantidadPedida = cantidadPedida;
		this.importePedido = importePedido;
		this.cantidadPendienteEntrega = cantidadPedida;
		this.estado = estado.PENDIENTE;
	}



	public int getNumeroPedido() {
		return numeroPedido;
	}



	public int getCodigo() {
		return codigo;
	}



	public int getCantidadPedida() {
		return cantidadPedida;
	}



	public int getImportePedido() {
		return importePedido;
	}



	public int getCantidadPendienteEntrega() {
		return cantidadPendienteEntrega;
	}



	public Estado getEstado() {
		return estado;
	}



	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public void setCantidadPedida(int cantidadPedida) {
		this.cantidadPedida = cantidadPedida;
	}



	public void setImportePedido(int importePedido) {
		this.importePedido = importePedido;
	}



	public void setCantidadPendienteEntrega(int cantidadPendienteEntrega) {
		this.cantidadPendienteEntrega = cantidadPendienteEntrega;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", codigo=" + codigo + ", cantidadPedida=" + cantidadPedida
				+ ", importePedido=" + importePedido + ", cantidadPendienteEntrega=" + cantidadPendienteEntrega
				+ ", estado=" + estado + "]";
	}
	
	
	
	
	
	
}
