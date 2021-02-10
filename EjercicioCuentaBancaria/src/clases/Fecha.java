package clases;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	
	
	public int getDia() {
		return dia;
	}


	public int getMes() {
		return mes;
	}


	public int getAnio() {
		return anio;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	
	
public String obtenerComoString () {
		
		return (this.dia + " " + this.mes + " " + this.anio); 
	}


@Override
public String toString() {
	return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
}
	

	
	

}
