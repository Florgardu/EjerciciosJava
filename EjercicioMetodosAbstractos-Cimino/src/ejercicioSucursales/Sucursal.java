package ejercicioSucursales;

import java.util.ArrayList;

public class Sucursal {

	private String codigo;
	private double impuestoProvincial;
	private ArrayList<Cliente> clientesSucursal;
	private ArrayList<Pedido> pedidosHechos;

	public Sucursal(String codigo, double impuestoProvincial) {
		super();
		this.codigo = codigo;
		this.impuestoProvincial = impuestoProvincial;
		this.pedidosHechos = new ArrayList<Pedido>();
	}

	public String getCodigo() {
		return codigo;
	}

	public double getImpuestoProvincial() {
		return impuestoProvincial;
	}

	public ArrayList<Cliente> getClientesSucursal() {
		return clientesSucursal;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setImpuestoProvincial(double impuestoProvincial) {
		this.impuestoProvincial = impuestoProvincial;
	}

	public void setClientesSucursal(ArrayList<Cliente> clientesSucursal) {
		this.clientesSucursal = clientesSucursal;
	}

	public void addPedido(Pedido pedido) {
		this.pedidosHechos.add(pedido);
	}

	public ArrayList<Pedido> getPedidosHechos() {
		return pedidosHechos;
	}

	@Override
	public String toString() {
		return "Sucursal [codigo=" + codigo + ", impuestoProvincial=" + impuestoProvincial + ", clientesSucursal="
				+ clientesSucursal;
	}

	public void agregarClientes(Cliente cliente) {
		this.clientesSucursal.add(cliente);
	}

	
	public int[] pedidosXTipo() {
		int[] pedidosXTipo = new int[5];

		for (Pedido p : this.pedidosHechos) {
			int tipoPedido = p.getTipoPedido();
			pedidosXTipo[tipoPedido - 1]++;
		}

		return pedidosXTipo;
	}

}
