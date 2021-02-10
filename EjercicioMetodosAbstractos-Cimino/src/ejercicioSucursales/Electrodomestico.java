package ejercicioSucursales;

public class Electrodomestico extends Producto {

	private int consumoKw;

	public Electrodomestico(String id, String descripcion, double precioLista, int stock, int consumoKw) {
		super(id, descripcion, precioLista, stock);
		this.consumoKw = consumoKw;
	}

	@Override
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return this.getPrecioLista();
	}
	
	
	public boolean seVendio () {
		return false;
	}

	@Override
	public String toString() {
		return "Electrodomestico [consumoKw=" + consumoKw + ", getDescripcion()=" + getDescripcion() + ", getStock()="
				+ getStock() + "]";
	}
	

	
	
	
	
}
