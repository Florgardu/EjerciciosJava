package ejercicio5;

public class Mueble {
	
	
	private String nombre;
	private String material;
	private String color;
	
	
	public Mueble(String nombre, String material, String color) {
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}


	public String getNombre() {
		return nombre;
	}


	public String getMaterial() {
		return material;
	}


	public String getColor() {
		return color;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "[nombre=" + nombre + ", material=" + material + ", color=" + color + "]";
	}
	
	
	
	

}
