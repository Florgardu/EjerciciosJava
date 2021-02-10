package clases;

public class Perro extends Mascota {
	
	private String raza;

	
	
	public Perro(String nombre, String edad, int peso, String raza) {
		super(nombre, edad, peso);
		this.raza = raza;
	}


public void darLaPata() {
	System.out.println("toma mi pata");
}
	
	@Override
	public void hacerGracia() {
		System.out.println("GUAU GUAU");		
	}



	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getPeso()="
				+ getPeso() + "]";
	}
	
	

}
