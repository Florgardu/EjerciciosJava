package ejemploParcial;

public class Cosecha {

	private String nombre;
	private String fecha;
	private int kilo;
	private int altura;
	private int humedad;
	private String cultivo;


	public Cosecha() {

	}

	public Cosecha(String nombre, String fecha, int kilo, int altura, int humedad) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.kilo = kilo;
		this.altura = altura;
		this.humedad = humedad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public int getKilo() {
		return kilo;
	}

	public int getAltura() {
		return altura;
	}

	public int getHumedad() {
		return humedad;
	}

	public String getCultivo() {
		return cultivo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}

	public void setCultivo(String cultivo) {
		this.cultivo = cultivo;
	}

	@Override
	public String toString() {
		return "Cosecha [nombre=" + nombre + ", fecha=" + fecha + ", kilo=" + kilo + ", altura=" + altura + ", humedad="
				+ humedad + ", cultivo=" + cultivo + "]";
	}


	
	
	
	
	
	

}