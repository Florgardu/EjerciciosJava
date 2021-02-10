package clases;

public class Domicilio {

	private String calle;
	private int altura;
	private String barrio;
	
	
	public String getCalle() {
		return calle;
	}

	public int getAltura() {
		return altura;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}



	public Domicilio(String calle, int altura, String barrio) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.barrio = barrio;
	}

	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", altura=" + altura + ", barrio=" + barrio + "]";
	}
	
	
	
	
}
