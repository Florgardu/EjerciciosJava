package ejercicioSucursales;

import java.util.ArrayList;

public class Pedido {

	private Cliente cliente;
	private Sucursal sucursal;
	private ArrayList<Producto> productosDelPedido;
	private int tipoPedido;

	public Pedido(Cliente cliente, Sucursal sucursal, int tipoPedido) {
		super();
		this.cliente = cliente;
		this.sucursal = sucursal;
		this.productosDelPedido = new ArrayList();
		this.tipoPedido = tipoPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public ArrayList<Producto> getProductosDelPedido() {
		return productosDelPedido;
	}

	public int getTipoPedido() {
		return tipoPedido;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public void setProductosDelPedido(ArrayList<Producto> productosDelPedido) {
		this.productosDelPedido = productosDelPedido;
	}

	public void setTipoPedido(int tipoPedido) {
		this.tipoPedido = tipoPedido;
	}

	// agrego productos al pedido y descuento de stock

	public void agregarProductos(Producto productoAgregar, int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			productoAgregar.descontarCompra(cantidad);
			this.productosDelPedido.add(productoAgregar);
			productoAgregar.seVendio();
		}

	}

	/*
	 * Para calcular el importe se deben sumar los precios de venta de cada uno de
	 * los productos, luego aplicarle el descuento correspondiente al cliente y
	 * sumarle el % de impuesto que le corresponda a la sucursal en la cual se
	 * registró el pedido.
	 */

	public double calcularImporteDelPedido() {
		double acumuladoGastoProductos = 0;
		double gastoTotalPedido;

		for (Producto producto : productosDelPedido) {
			acumuladoGastoProductos = acumuladoGastoProductos + producto.calcularPrecioVenta();

		}

		double descuentoCliente = acumuladoGastoProductos * (this.cliente.getDescuentoAsignado() / 100);
		double impuestoSucursal = acumuladoGastoProductos * (this.sucursal.getImpuestoProvincial() / 100);

		return gastoTotalPedido = (acumuladoGastoProductos - descuentoCliente) + impuestoSucursal;

	}

	public ArrayList dameProductosConStock(int cantidad) {
		ArrayList<Producto> productoConMenorStockPedido = new ArrayList();
		for (Producto producto : productosDelPedido) {
			if (producto.getStock() < cantidad) {
				productoConMenorStockPedido.add(producto);
			}
		}
		return productoConMenorStockPedido;
	}

	@Override
	public String toString() {
		return "Pedido [cliente=" + cliente + ", sucursal=" + sucursal + ", productosDelPedido=" + productosDelPedido
				+ ", tipoPedido=" + tipoPedido + "]";
	}
	
	

}
