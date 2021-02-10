package clases;

public class Viaje {
	
	private int idCamion;
	private String idChofer;
	private double kmViaje;
	
	
	public Viaje(int idCamion, String idChofer, double kmViaje) {
		super();
		this.idCamion = idCamion;
		this.idChofer = idChofer;
		this.kmViaje = kmViaje;
	}


	public int getIdCamion() {
		return idCamion;
	}


	public String getIdChofer() {
		return idChofer;
	}


	public double getKmViaje() {
		return kmViaje;
	}


	public void setIdCamion(int idCamion) {
		this.idCamion = idCamion;
	}


	public void setIdChofer(String idChofer) {
		this.idChofer = idChofer;
	}


	public void setKmViaje(double kmViaje) {
		this.kmViaje = kmViaje;
	}
	
	
	

}
