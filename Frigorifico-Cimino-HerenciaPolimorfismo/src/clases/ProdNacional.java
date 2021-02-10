package clases;

public class ProdNacional extends Producto {

	private int codBarra;
	private double descuento_nac=5;

	public ProdNacional(int codigo, String nombre, double precio, boolean esAptoCeliaco) {
		super(codigo, nombre, precio, esAptoCeliaco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrecioConDescuento() {
		
		if (isEsAptoCeliaco()) {
			return super.getPrecio();
		} else {
			double descuento = super.getPrecio() * (this.descuento_nac/100);
			double precioConDescuento = super.getPrecio() - descuento;
			return precioConDescuento;
		}
		

	}

	@Override
	public String toString() {
		return "ProdNacional [codBarra=" + codBarra + ", descuento_nac=" + descuento_nac + "]";
	}
	
	
	
	
	
}