import java.util.ArrayList;

public class Mozo extends Empleado {

	private ConvenioSindical convenio;
	private Categoria categoria;
	private Restaurant resto;

	public Mozo(String nombre, Restaurant resto,  int numeroLegajo, String fechaIngreso, ConvenioSindical convenio, Categoria categoria) {
		super(nombre, numeroLegajo, fechaIngreso);
		this.convenio = convenio;
		this.categoria = categoria;
		this.resto=resto;
	}

	
	
	public void generarPedido(Mesa mesa, Cocinero cocinero, ArrayList<Producto>productosPedidos, formaDePago formaDePago) {

		Pedido nuevoPedido = new Pedido(mesa, this, cocinero, productosPedidos, formaDePago);
		
		mesa.setEstaLibre(false);

		resto.procesarPedido(nuevoPedido);
		
	}

	
	
	public ConvenioSindical getConvenio() {
		return convenio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setConvenio(ConvenioSindical convenio) {
		this.convenio = convenio;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	@Override
	public String toString() {
		return "Mozo [convenio=" + convenio + ", categoria=" + categoria + ", resto=" + resto + "]";
	}

	
	
	
}
