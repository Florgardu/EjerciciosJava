package clases;

public class ProdExportacion extends Producto {

	private int nroExport;
	private double descuento_Expo=1;

	public ProdExportacion(int codigo, String nombre, double precio, boolean esAptoCeliaco, int nroExport,
			double descuento_Expo) {
		super(codigo, nombre, precio, esAptoCeliaco);
		this.nroExport = nroExport;
		this.descuento_Expo = descuento_Expo;
	}

	@Override
	public double getPrecioConDescuento() {
		double descuento= super.getPrecio()*(this.descuento_Expo/100);
		double precioConDescuento= super.getPrecio()-descuento;
		return precioConDescuento;
	}

	@Override
	public String toString() {
		return "ProdExportacion [nroExport=" + nroExport + ", descuento_Expo=" + descuento_Expo + "]";
	}
	
	
	

}
