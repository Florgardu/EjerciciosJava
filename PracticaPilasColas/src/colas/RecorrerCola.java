package colas;

import java.util.LinkedList;
import java.util.Queue;

public class RecorrerCola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<Persona> s= new LinkedList<Persona>();
		Persona p1= new Persona("Flor");
		Persona p2= new Persona("Pepe");
		Persona p3= new Persona("Marta");

		// las agrego a mi cola 
		
		s.add(p1);
		s.add(p2);
		s.add(p3);

		// recorrer y contar tamaño cola
		System.out.println(p1.contadorCola(s));
		
		//buscar en cola
		
		Persona personaBuscada= p1.buscarEnCola("Flor", s);
		System.out.println(personaBuscada);
		

		
	}

}
