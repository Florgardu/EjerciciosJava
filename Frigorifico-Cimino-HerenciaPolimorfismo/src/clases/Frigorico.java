package clases;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Frigorico {

	private Vendedor[] vendedores = new Vendedor[20];
	private Pais[] paises = new Pais[10];
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public Frigorico() {
	}

	public void agregarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public void agregarEmpleado(Vendedor empleado, int posicion) {
		vendedores[posicion] = empleado;
	}

	public void agregarPais(Pais pais, int posicion) {
		paises[posicion] = pais;
	}

	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	// Desarrollar un método llamado pedidoMasCaro, que imprima el pedido de mayor
	// importe.

	public Pedido pedidoMasCaro() {
		double pedidoMax = 0;
		Cliente c = null;
		Pedido pMasCaro = null;
		for (Pedido p : this.pedidos) {
			if (p.getPrecioTotal() > pedidoMax) {
				pedidoMax = p.getPrecioTotal();
				c = p.getCliente();
				pMasCaro = p;

			}
		}
		System.out.println("El pedido más caro costo " + pedidoMax + "del cliente " + c);
		return pMasCaro;

	}

	public void mostrarVendedores() {
		for (int i = 0; i < vendedores.length; i++) {
			System.out.println(vendedores[i]);
		}
	}

	private int buscarPosicionVendedor(Vendedor v) {
		int posicion = -1;
		for (int i = 0; i < this.vendedores.length; i++) {
			if (this.vendedores[i] != null) {
				if (this.vendedores[i].equals(v)) {
					posicion = i;
				}
			}
		}

		return posicion;
	}

	private int buscarPosicionPais(Pais p) {
		int posicion = -1;
		for (int i = 0; i < this.paises.length; i++) {
			if (this.paises[i] != null) {
				if (this.paises[i].equals(p)) {
					posicion = i;
				}
			}

		}
		return posicion;
	}

	// Desarrollar un método llamado informarCantPedidos que informe cuantos pedidos
	// ingresó cada
	// vendedor para cada uno de los 10 países con los que trabaja la fábrica

	public void informarCantPedidos() {

		int[][] pedidosXVendPais;
		int vendedores = this.vendedores.length;
		int paises = this.paises.length;

		pedidosXVendPais = new int[vendedores][paises];

		for (Pedido p : this.pedidos) {
			Vendedor v = p.getVendedor();
			Cliente c = p.getCliente();
			Pais pais = c.getPais();

			int posicionVendedor = this.buscarPosicionVendedor(v);
			int posicionPais = this.buscarPosicionPais(pais);

			if (posicionVendedor != -1 && posicionPais != -1) {
				pedidosXVendPais[posicionVendedor][posicionPais]++;
			}
		}

		this.mostrarMatriz(pedidosXVendPais);
	}

	private void mostrarMatriz(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t\t");
			}
			System.out.println();
		}

	}
	
	
	// Desarrollar un método llamado costoTotal el cual devuelva el valor total 
	// que tiene que abonar la
	// fábrica en concepto de honorarios (sueldos + plus).
	
	
	public double costoTotal() {
		double acumuladorSueldo=0;
		for (Vendedor v: this.vendedores) {
			if (v!=null) {
				acumuladorSueldo= acumuladorSueldo+ v.getSueldo();
			}
		}
		return acumuladorSueldo;
	}
	

}
