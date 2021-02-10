package ejercicioSucursales;

public class SectorCasa {
	
	
	private int idSector;
	private String descripcion;
	private double descuentoAsignado;
	
	
	public SectorCasa(int idSector, String descripcion, double descuentoAsignado) {
		super();
		this.idSector = idSector;
		this.descripcion = descripcion;
		this.descuentoAsignado = descuentoAsignado;
	}


	public int getIdSector() {
		return idSector;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public double getDescuentoAsignado() {
		return descuentoAsignado;
	}


	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public void setDescuentoAsignado(double descuentoAsignado) {
		this.descuentoAsignado = descuentoAsignado;
	}
	
	
	
	
	
	
	
	
	

}
