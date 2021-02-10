package CLUB;

public class Actividad {

	private String nombreActividad;
	private double costo;
	private TipoActividad tipoAct;
	
	
	
	public Actividad(String nombreActividad, double costo) {
		
		setNombreActividad(nombreActividad);
		setCosto(costo);
	
	}
	
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}


	public String getNombreActividad() {
		return nombreActividad;
	}

	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	public TipoActividad getTipoAct() {
		return tipoAct;
	}

	public void setTipoAct(TipoActividad tipoAct) {
		this.tipoAct = tipoAct;
	}

	@Override
	public String toString() {
		return "nombreActividad=   " + nombreActividad + ", costo =  $" + costo + "]";
	}
	
	
}
