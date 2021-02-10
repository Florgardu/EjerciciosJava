package ar.com.ort;

public class Metodos {
	
	public static void main(String[] args) {
		String nombre = "Flor";
		int edad = 27;
		
		System.out.println(nombre +" tiene " + edad + " años");		
		
		edad = cumplirAnios(edad);
		
		System.out.println("ahora " + nombre +" tiene " + edad + " años");
		
	}

	private static int cumplirAnios(int edad) {
		edad = edad + 1;
		return edad;
	}

}
