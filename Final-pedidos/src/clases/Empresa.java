package clases;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Pedido> listaPedidos;

	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
		this.listaPedidos = new ArrayList<Pedido>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Pedido> getListaPedidos() {
		return listaPedidos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", listaPedidos=" + listaPedidos + "]";
	}

	private Pedido buscarPedido(int numeroPedido) {
		int contador = 0;
		Pedido pedidoBuscado = null;
		Pedido pedidoEnLista;

		while (contador < this.listaPedidos.size() && pedidoBuscado == null) {
			pedidoEnLista = this.listaPedidos.get(contador);
			if (pedidoEnLista.getNumeroPedido() == numeroPedido) {
				pedidoBuscado = pedidoEnLista;
			} else {
				contador++;
			}
		}
		return pedidoBuscado;

	}

	public Pedido cargarPedido(int numeroPedido, int codigo, int cantidadPedida, int importePedido) {
		Pedido pedidoParaCargar;

		pedidoParaCargar = buscarPedido(numeroPedido);
		if (pedidoParaCargar == null) {
			pedidoParaCargar = new Pedido(numeroPedido, codigo, cantidadPedida, importePedido);
			this.listaPedidos.add(pedidoParaCargar);
			System.out.println("Pedido cargado con éxito");
		} else {
			System.out.println("No se pudo agregar, pedido ya existia");
		}
		return pedidoParaCargar;
	}

	public void entregar(int cantidadAEntregar, int numeroPedido) {
		Pedido pedido;

		pedido = buscarPedido(numeroPedido);

		if (pedido == null) {
			System.out.println("El numero de pedido no existe");

		} else {
			int cantidadPendienteEntrega = pedido.getCantidadPendienteEntrega();
			if (cantidadPendienteEntrega > 0) {
				if (cantidadAEntregar <= cantidadPendienteEntrega) {
					int nuevaCantidadPendiente = cantidadPendienteEntrega - cantidadAEntregar;
					pedido.setCantidadPendienteEntrega(nuevaCantidadPendiente);
					if (pedido.getCantidadPendienteEntrega() == 0) {
						pedido.setEstado(Estado.ENTREGADO);
						System.out.println("Se cambio con éxito " + pedido);
					}

				} else {
					System.out.println("La cantidad a entregar es mayor a la cantidad pendiente de entrega");
				}
			} else {
				System.out.println("Pedido sin pendientes");
			}

		}

	}
	
	public void listarPedidosPendientesEntrega () {
		for (Pedido pedido : listaPedidos) {
		if (pedido.getCantidadPendienteEntrega()>0) {
			System.out.println(pedido);
		}	
		}
	}
	
	
	public Pedido pedidoMasCaro () {
		int max=0;
		Pedido pedidoMasCaro=null;
		
		for (Pedido pedido : listaPedidos) {
		if (pedido.getImportePedido()>max) {
			max=pedido.getImportePedido();
			pedidoMasCaro=pedido;
		}	
		}
		System.out.println(pedidoMasCaro);
		return pedidoMasCaro; 
	}
	
	// Método para mostrar los pedidos de un artículo determinado ingresado por teclado. 
	
	public void mostrarPedidoDeArticulo (int articulo) {
		for (Pedido pedido : listaPedidos) {
			if (pedido.getCodigo()==articulo) {
				System.out.println("Pedido con " + articulo +  " es este :" + pedido );
			}
		}
		
	}
	

}
