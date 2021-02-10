import java.util.ArrayList;

public class Pedido {

	private Mesa mesa;
	private Mozo mozo;
	private Cocinero cocinero;
	private ArrayList<Producto> productos;
	private formaDePago formaDePago;

	public Pedido(Mesa mesa, Mozo mozo, Cocinero cocinero, ArrayList<Producto> productos, formaDePago formaDePago) {
		this.mesa = mesa;
		this.mozo = mozo;
		this.cocinero = cocinero;
		this.productos = productos;
		this.formaDePago = formaDePago;
	}

	// En el caso que una mesa realice el pago en efectivo se le hará un descuento
	// que se calculará de la
	// siguiente forma: A los platos pedidos se les descontará un 5% salvo a los
	// platos veganos que no llevan
	// descuento y en el caso de los platos aptos para celíacos tendrán un 2% de
	// descuento adicional.
	// En el caso de las bebidas consumidas, el descuento es de 10% para las que
	// no contiene alcohol y de 3% en para las que si contienen.

	public double calcularImporte() {
		double importeAPagar = 0;
		if (this.formaDePago.equals(formaDePago.E)) {
			for (Producto producto : productos) {
				importeAPagar = importeAPagar + producto.getPrecioAbonoEfectivo();
			}

		} else {
			for (Producto producto : productos) {
				importeAPagar = importeAPagar + producto.getPrecio();
			}
		}

		return importeAPagar;

	}

	public Mesa getMesa() {
		return mesa;
	}

	public Mozo getMozo() {
		return mozo;
	}

	public Cocinero getCocinero() {
		return cocinero;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public formaDePago getFormaDePago() {
		return formaDePago;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}

	public void setCocinero(Cocinero cocinero) {
		this.cocinero = cocinero;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void setFormaDePago(formaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}

	@Override
	public String toString() {
		return "Pedido [mesa=" + mesa + ", mozo=" + mozo + ", cocinero=" + cocinero + ", productos=" + productos
				+ ", formaDePago=" + formaDePago + "]";
	}

	public boolean perteneceAlCocinero(int numeroLegajo) {
		boolean pertenceAlCocinero = false;
		if (this.cocinero.getNumeroLegajo() == numeroLegajo) {
			pertenceAlCocinero = true;
		}

		return pertenceAlCocinero;
	}

}
