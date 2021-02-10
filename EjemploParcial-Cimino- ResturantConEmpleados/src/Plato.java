
public class Plato extends Producto {

	private String descripcion;
	private boolean esAptoVegano;
	private boolean esAptoCeliaco;

	public Plato(String nombre, double precio, String descripcion, boolean esAptoVegano, boolean esAptoCeliaco) {
		super(nombre, precio);
		this.descripcion = descripcion;
		this.esAptoVegano = esAptoVegano;
		this.esAptoCeliaco = esAptoCeliaco;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public boolean isEsAptoVegano() {
		return esAptoVegano;
	}

	public boolean isEsAptoCeliaco() {
		return esAptoCeliaco;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEsAptoVegano(boolean esAptoVegano) {
		this.esAptoVegano = esAptoVegano;
	}

	public void setEsAptoCeliaco(boolean esAptoCeliaco) {
		this.esAptoCeliaco = esAptoCeliaco;
	}

	@Override
	public String toString() {
		return "Plato [descripcion=" + descripcion + ", esAptoVegano=" + esAptoVegano + ", esAptoCeliaco="
				+ esAptoCeliaco + "]";
	}

	@Override
	public double getPrecioAbonoEfectivo() {
		double precioEfectivo;
		double descuentoCeliaco = 0.02;
		double descuentoNoCeliacoNoVegano = 0.05;

		if (esAptoVegano) {
			precioEfectivo = this.getPrecio();
		}
		if (esAptoCeliaco) {
			precioEfectivo = this.getPrecio() - this.getPrecio() * descuentoCeliaco;
		} else {
			precioEfectivo = this.getPrecio() - this.getPrecio() * descuentoNoCeliacoNoVegano;
		}

		return precioEfectivo;
	}

}
