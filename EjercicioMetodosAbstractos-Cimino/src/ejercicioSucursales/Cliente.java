package ejercicioSucursales;

public class Cliente {

	private String id;
	private String razonSocial;
	private double descuentoAsignado;

	public Cliente(String id, String razonSocial, double descuentoAsignado) {
		super();
		this.id = id;
		this.razonSocial = razonSocial;
		this.descuentoAsignado = descuentoAsignado;
	}

	public String getId() {
		return id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public double getDescuentoAsignado() {
		return descuentoAsignado;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public void setDescuentoAsignado(double descuentoAsignado) {
		this.descuentoAsignado = descuentoAsignado;
	}

	
	
	
}
