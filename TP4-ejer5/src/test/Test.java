package test;

import clases.Agenda;
import clases.Persona;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Persona contacto1Persona = new Persona("Flor", "Garduno", "35805837", 1127010234, "garduno.florencia@gmail.com");
Persona contacto2Persona = new Persona("Juan", "Perez", "54321567", 1127010234, "garduno.florencia@gmail.com");
Persona contacto3Persona = new Persona("Pedro", "Diaz", "76543456", 1127010234, "garduno.florencia@gmail.com");
Persona contacto4Persona = new Persona("Damian", "Garcia", "35805467", 1127010234, "garduno.florencia@gmail.com");
Persona contacto5Persona = new Persona("Graciela", "Canete", "92081299", 1127010234, "garduno.florencia@gmail.com");
Persona contacto6Persona = new Persona("Santino", "Dubiski", "35805832", 1127010234, "garduno.florencia@gmail.com");
Persona contacto7Persona = new Persona("Flor", "Garduno", "35805837", 1127010234, "garduno.florencia@gmail.com");

	Agenda miAgenda = new Agenda();
	miAgenda.agregarPersonas(contacto1Persona);
	miAgenda.agregarPersonas(contacto2Persona);
	miAgenda.agregarPersonas(contacto3Persona);
	miAgenda.agregarPersonas(contacto4Persona);
	miAgenda.agregarPersonas(contacto6Persona);

	
	System.out.println(miAgenda);
	
	miAgenda.BuscarPersonaPorDni("35805837");
	miAgenda.BuscarPersonaPorDni("3580580000");
	

	}

}
