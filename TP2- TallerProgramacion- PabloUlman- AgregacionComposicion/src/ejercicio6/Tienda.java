package ejercicio6;

import java.util.ArrayList;
import java.util.Iterator;

public class Tienda {

	private ArrayList<Pedido> pedidosPendientes = new ArrayList();
	private ArrayList<Pedido> pedidosCompletos = new ArrayList();

	private ArrayList<Stock> stocksDeLibros = new ArrayList();

	public void generarPedido(int numeroCompra, String fechaCompra, Libro libro, Cliente cliente) {
		Pedido nuevoPedido = new Pedido(numeroCompra, fechaCompra, libro, cliente);
		this.pedidosPendientes.add(nuevoPedido);

	}

	public void agregarLibroConStock(Libro libro, int cantidadEnStock) {
		Stock nuevoStock = new Stock(libro, cantidadEnStock);
		this.stocksDeLibros.add(nuevoStock);
	}

	// Una vez por día la tienda procesa los pedidos pendientes y para ello recorre
	// los pedidos
	// realizados verificando si el stock de ejemplares del libro solicitado alcanza
	// para cumplir con
	// el pedido. Si hay stock se elimina el pedido del listado de pendientes y se
	// agrega el pedido a
	// un listado de pedidos completos; si no alcanza el stock el pedido debe quedar
	// en la
	// colección de pedidos pendientes.

	public void procesarPedidos() {
		ArrayList shouldBeRemoved = new ArrayList();

		for (int i = 0; i < this.pedidosPendientes.size(); i++) {
			Pedido pedidoPendiente = this.pedidosPendientes.get(i);
			Libro libroDePedido = pedidoPendiente.getLibro();
			Stock stockDeLibro = buscarStockDeLibro(libroDePedido);
			int cantidadStock = stockDeLibro.getCantidad();
			if (cantidadStock == 0) {
				System.out.println("No nos queda más stock de ese libro");
			} else {
				this.pedidosCompletos.add(pedidoPendiente);
				stockDeLibro.restarUno();
				shouldBeRemoved.add(pedidoPendiente);
				System.out.println("se elimino de pendientes y fue a lista de pedidos completos");
			}
		}
		
		this.pedidosPendientes.removeAll(shouldBeRemoved);

	}

	private Stock buscarStockDeLibro(Libro libroBuscado) {
		Stock stockBuscado = null;
		int contador = 0;

		while (contador < this.stocksDeLibros.size() && stockBuscado == null) {
			Stock stock = this.stocksDeLibros.get(contador);
			if (stock.getLibro().equals(libroBuscado)) {
				stockBuscado = stock;
			} else {
				contador++;
			}
		}
		return stockBuscado;

	}

	@Override
	public String toString() {
		return "Tienda [pedidosPendientes=" + pedidosPendientes + ", pedidosCompletos=" + pedidosCompletos
				+ ", stocksDeLibros=" + stocksDeLibros + "]";
	}

	public void verPedidoPendientes() {
		for (Pedido pedido : this.pedidosPendientes) {
			System.out.println(pedido.getNumeroCompra());
		}
	}

}
