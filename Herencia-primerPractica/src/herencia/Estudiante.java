package herencia;

public class Estudiante extends Persona {
	
	
	private int codigoEstudiante;
	private double notaFinal;
	
	
	//constructor 
	
	public Estudiante (String nombre, String apellido, int edad, int codigoEstudiante, double notaFinal) {
		super (nombre, apellido, edad);
		this.codigoEstudiante= codigoEstudiante;
		this.notaFinal= notaFinal;
	}
	
	
	public void mostrarDatos () {
		System.out.println("El nombre : " + nombre);
		System.out.println("El apellido : " + apellido);
		System.out.println("La edad : " + edad);
		System.out.println("El codigo : " + codigoEstudiante);
		System.out.println("La nota final : " + notaFinal);
	}
	
	
	// otra forma: sigo dejando en privado los atributos de persona
	
	//System.out.println("El nombre : " + getNombre());
	

}
