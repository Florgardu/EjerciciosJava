package ar.com.ort;

public class Test {
	
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setApellido("Diaz");
		p1.setNombre("Diego");
		p1.setDireccion("Roosevelt 3313");
		
		System.out.println("nombre p1:"+ p1.getNombre());
		System.out.println("apellido p1:"+ p1.getApellido());
		
		System.out.println(p1);
		
		Persona p2 = new Persona();
		p2.setApellido("Gomez");
		p2.setNombre("Pablo");
		p2.setDireccion("Virrey del pino 2284");
		
		System.out.println(p2);
		
	}

}
