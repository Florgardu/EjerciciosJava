package clases;

public abstract class Mascota {

	private String nombre;
	private String edad;
	private int peso;

	// clase abstracta

	public abstract void hacerGracia();
		
	
	
	
	

	// constructor
	public Mascota(String nombre, String edad, int peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}

	// getter y setters

	public String getNombre() {
		return nombre;
	}

	public String getEdad() {
		return edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
	

}
