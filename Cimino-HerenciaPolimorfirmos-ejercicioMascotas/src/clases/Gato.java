package clases;

public class Gato extends Mascota {
	
	private String color; 
	
	public Gato(String nombre, String edad, int peso, String color) {
		super(nombre, edad, peso);
		this.color = color;
	}

	
	@Override
	public void hacerGracia () {
		getPeso();
		System.out.println(getNombre() + ": MIAU MIAU");
	}


	@Override
	public String toString() {
		return "Gato -color: " + color + " -nombre: " + getNombre() + " -edad " + getEdad() + " -peso "
				+ getPeso();
	}
	
	
	public void ronroneo () {
		
		System.out.println("rrrrrrr");
	}
	
	
	
	
}
