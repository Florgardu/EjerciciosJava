package ejercicioSucursales;

public class Mayorista extends Cliente{
	
	private double promedioCompraUltimoAnio;
	
	
	

	public Mayorista(String id, String razonSocial, double descuentoAsignado, double promedioCompraUltimoAnio) {
		super(id, razonSocial, descuentoAsignado);
		this.promedioCompraUltimoAnio = promedioCompraUltimoAnio;
	}
	
	
	
	
	

}
