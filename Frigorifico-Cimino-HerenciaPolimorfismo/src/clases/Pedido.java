package clases;

import java.util.ArrayList;

public class Pedido {
	
	private ArrayList<Item>items= new ArrayList<Item>();
	private Vendedor vendedor;
	private Cliente cliente;
	
	
	
	public Pedido(Vendedor vendedor, Cliente cliente) {
		super();
		this.vendedor = vendedor;
		this.cliente = cliente;
	}
	
	
	public void agregarItem(Producto producto, int cantidad) {
		Item item= new Item (producto, cantidad);
		this.items.add(item);
	}
	
	public double getPrecioTotal() {
		double acumuladorPrecios=0;
		for (Item item : items) {
			acumuladorPrecios= acumuladorPrecios+ item.calcularTotal();
		}
		return acumuladorPrecios;
	}


	public ArrayList<Item> getItems() {
		return items;
	}


	public Vendedor getVendedor() {
		return vendedor;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Pedido [items=" + items + ", vendedor=" + vendedor + ", cliente=" + cliente + "]";
	}
	
	
	
	

}
