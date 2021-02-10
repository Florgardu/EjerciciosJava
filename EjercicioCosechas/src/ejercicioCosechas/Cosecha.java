package ejercicioCosechas;

public class Cosecha {
	
	private String nombre;
	private String tipoCosecha;
	private String fecha;
	private int kilos;
	private int altura;
	private int humedad;
	
	
	public Cosecha() {
		
	}
	
	public Cosecha(String cosecha, String tipoCosecha, String fecha, int kilos, int altura, int humedad) {
		super();
		this.nombre = cosecha;
		this.tipoCosecha = tipoCosecha;
		this.fecha = fecha;
		this.kilos = kilos;
		this.altura = altura;
		this.humedad = humedad;
	}

	
	
	

	public String getNombre() {
		return nombre;
	}


	public String getTipoCosecha() {
		return tipoCosecha;
	}


	public String getFecha() {
		return fecha;
	}


	public int getKilos() {
		return kilos;
	}


	public int getAltura() {
		return altura;
	}


	public int getHumedad() {
		return humedad;
	}


	public void setNombre(String cosecha) {
		this.nombre = cosecha;
	}


	public void setTipoCosecha(String tipoCosecha) {
		this.tipoCosecha = tipoCosecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public void setKilos(int kilos) {
		this.kilos = kilos;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}

	@Override
	public String toString() {
		return "Cosecha [nombre=" + nombre + ", tipoCosecha=" + tipoCosecha + ", fecha=" + fecha + ", kilos=" + kilos
				+ ", altura=" + altura + ", humedad=" + humedad + "]";
	}

	

	
	

}
