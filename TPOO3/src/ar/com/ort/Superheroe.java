package ar.com.ort;

public class Superheroe {

	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	
	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		super();
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.superpoderes = superpoderes;
	}


	public String getNombre() {
		return nombre;
	}


	public int getFuerza() {
		return fuerza;
	}


	public int getResistencia() {
		return resistencia;
	}


	public int getSuperpoderes() {
		return superpoderes;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}


	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}


	public void setSuperpoderes(int superpoderes) {
		this.superpoderes = superpoderes;
	}


	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	} 
 
	public int jugar (Superheroe superheroe) {
		int acumuladorGano = 0;
		int acumuladorPerdio = 0;
		int resultado=0;

		if (this.fuerza > superheroe.fuerza) {
			acumuladorGano++;
		} else if (this.fuerza < superheroe.fuerza) {
			acumuladorPerdio++;
		}
		
		if (this.resistencia > superheroe.resistencia) {
			acumuladorGano++;
		} else if (this.resistencia < superheroe.resistencia) {
			acumuladorPerdio++;
		}
		
		if (this.superpoderes > superheroe.superpoderes) {
			acumuladorGano++;
		} else if (this.superpoderes < superheroe.superpoderes) {
			acumuladorPerdio++;
		}


		if (acumuladorGano>=2) {
			resultado = 1;
		} else if (acumuladorPerdio>=2) {
			resultado = 2;
		} else {
			resultado = 3;
		}
		
		return resultado;
	
	}
}
	

