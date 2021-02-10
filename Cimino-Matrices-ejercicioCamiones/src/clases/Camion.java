package clases;

public class Camion {
	
	
	private int idCamion;
	private double gastoPorKmRecorrido;
	
	
	public Camion(int idCamion, double gastoPorKmRecorrido) {
		this.idCamion = idCamion;
		this.gastoPorKmRecorrido = gastoPorKmRecorrido;
	}


	public int getIdCamion() {
		return idCamion;
	}


	public double getGastoPorKmRecorrido() {
		return gastoPorKmRecorrido;
	}


	public void setIdCamion(int idCamion) {
		this.idCamion = idCamion;
	}


	public void setGastoPorKmRecorrido(double gastoPorKmRecorrido) {
		this.gastoPorKmRecorrido = gastoPorKmRecorrido;
	}
	
	
	
	

}
