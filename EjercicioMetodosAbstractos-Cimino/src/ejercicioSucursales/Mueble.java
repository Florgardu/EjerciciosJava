package ejercicioSucursales;

public class Mueble extends Producto {

	private String material;
	private SectorCasa sectorDeCasa;

	public Mueble(String id, String descripcion, double precioLista, int stock, String material,
			SectorCasa sectorDeCasa) {
		super(id, descripcion, precioLista, stock);
		this.material = material;
		this.sectorDeCasa = sectorDeCasa;
	}

	
	// Muebles: Precio de lista menos el descuento correspondiente al sector de la casa al que pertenece.

	@Override
	public double calcularPrecioVenta() {
		double descuentoPorSector= this.sectorDeCasa.getDescuentoAsignado()/100; 	
		
		double precioVenta= this.getPrecioLista()- (this.getPrecioLista()*descuentoPorSector);
		
		return precioVenta;
	}
	
	public boolean seVendio () {
		return false;
	}


	@Override
	public String toString() {
		return "Mueble [material=" + material + ", sectorDeCasa=" + sectorDeCasa + ", getDescripcion()="
				+ getDescripcion() + ", getStock()=" + getStock() + "]";
	}
	
	
	

}
