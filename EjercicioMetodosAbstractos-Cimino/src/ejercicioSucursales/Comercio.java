package ejercicioSucursales;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Comercio {

	private int cuit;
	private String razonSocial;
	private Sucursal[] sucursales = new Sucursal[3];
	private ArrayList<Producto> productosDisponibles = new ArrayList<Producto>();

	public Comercio(int cuit, String razonSocial) {
		super();
		this.cuit = cuit;
		this.razonSocial = razonSocial;

	}

	public void cargar10Sucursales() {
		Sucursal sucursal1 = new Sucursal("1", 5);
		this.sucursales[0] = sucursal1;

		Sucursal sucursal2 = new Sucursal("2", 5);
		this.sucursales[1] = sucursal2;

		Sucursal sucursal3 = new Sucursal("3", 5);
		this.sucursales[2] = sucursal3;
	}

	public void agregarProductosAComercio(Producto producto) {
		this.productosDisponibles.add(producto);
	}

	public int getCuit() {
		return cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public Sucursal[] getSucursales() {
		return sucursales;
	}

	public Sucursal dameSucursal(int numeroSucursal) {
		Sucursal sucursal = this.sucursales[numeroSucursal];
		return sucursal;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public void setSucursales(Sucursal[] sucursales) {
		this.sucursales = sucursales;
	}

	@Override
	public String toString() {
		return "Comercio [cuit=" + cuit + ", razonSocial=" + razonSocial + ", sucursales=" + Arrays.toString(sucursales)
				+ ", pedidosHechos=" + this.getPedidos() + "]";
	}

	private ArrayList<Pedido> getPedidos() {
		ArrayList<Pedido> todosLosPedidos = new ArrayList<Pedido>();
		for (int i = 0; i < sucursales.length; i++) {
			Sucursal sucursal = sucursales[i];
			todosLosPedidos.addAll(sucursal.getPedidosHechos());
			
		}
		return todosLosPedidos;
	}

	// crea un pedido, lo agrega a su lista de pedidos
	public Pedido generarPedido(Cliente cliente, String codigoSucursal, int tipoPedido) {
		Pedido pedido = null;
		//busco la sucursal
		Sucursal sucursal = this.buscarSucursalPorCodigo(codigoSucursal);
		if(sucursal == null) {
			//TODO manejar error
			System.out.println("no se encontro la sucursal");
		} else {
			pedido = new Pedido(cliente, sucursal, tipoPedido);
			sucursal.addPedido(pedido);
		}
		
		return pedido;

	}
	
	private Sucursal buscarSucursalPorCodigo(String codigoSucursal) {
		Sucursal sucursalEncontrada = null;
		for (int i = 0; i < sucursales.length && sucursalEncontrada == null; i++) {
			Sucursal sucursal = sucursales[i];
			if(sucursal.getCodigo().equals(codigoSucursal)) {
				sucursalEncontrada = sucursal;
			}
		}
		return sucursalEncontrada;
		
	}

	// Desarrollar un método que muestre por pantalla la descripción de
	// los productos cuyo stock sea menor a 10 unidades y existan en al menos un
	// pedido.
	public void mostrarStockMenosDiez() {
		ArrayList<Pedido> todosLosPedidos = this.getPedidos();

		for (int i = 0; i < todosLosPedidos.size(); i++) {
			Pedido pedido = todosLosPedidos.get(i);
			pedido.dameProductosConStock(10);
			System.out.println("El pedido " + pedido.getTipoPedido() + " tiene estos productos con menos de 10 Stock"
					+ pedido.dameProductosConStock(10));
		}

	}
	
	//Desarrollar un método que informe para cada sucursal, cuantos pedidos hay de cada tipo.
	
	public void mostrarPedidosXSucursal () {
		
		for (Sucursal sucursal : this.sucursales) {
			
			System.out.println("La sucursal " + sucursal.getCodigo());
			for (int i = 0; i < sucursal.pedidosXTipo().length; i++) {
				int pedidosXTipo = sucursal.pedidosXTipo()[i];
				int tipo = i+1;
				System.out.println("del tipo " + tipo + " hay los siguientes pedidos: " + pedidosXTipo);
			}
		}
		
	}



}
