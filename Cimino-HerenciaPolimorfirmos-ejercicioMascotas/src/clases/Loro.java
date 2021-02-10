package clases;

public class Loro extends Mascota{
	
	
	private int volumen;

	
	public Loro(String nombre, String edad, int peso, int volumen) {
		super(nombre, edad, peso);
		this.volumen= volumen;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void hacerGracia() {
			System.out.println("Hola puedo hablar");		
	}


	@Override
	public String toString() {
		return "Loro [volumen=" + volumen + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getPeso()="
				+ getPeso() + "]";
	}


}
