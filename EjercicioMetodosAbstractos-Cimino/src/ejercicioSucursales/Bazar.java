package ejercicioSucursales;

public class Bazar extends Producto {

	private String color;
	private int cantidadPorUnidad;

	public Bazar(String id, String descripcion, double precioLista, int stock, String color, int cantidadPorUnidad) {
		super(id, descripcion, precioLista, stock);
		this.color = color;
		this.cantidadPorUnidad = cantidadPorUnidad;
	}

	// Bazar: Los productos que vienen en más de 10 unidades por paquete tienen un
	// incremento fijo del 3%.

	@Override
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		double precioVenta = 0;

		if (this.cantidadPorUnidad > 10) {
			precioVenta = this.getPrecioLista() + (this.getPrecioLista() * 0.3);
		} else {
			precioVenta = this.getPrecioLista();
		}

		return precioVenta;
	}
	
	
	public boolean seVendio() {
		return false;
	}

	@Override
	public String toString() {
		return "Bazar [color=" + color + ", cantidadPorUnidad=" + cantidadPorUnidad + ", getDescripcion()="
				+ getDescripcion() + ", getStock()=" + getStock() + "]";
	}

	

}
