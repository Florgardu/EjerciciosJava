package colas;

import java.util.LinkedList;
import java.util.Queue;

public class Persona {
	
	
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int contadorCola(Queue<Persona>s) {

		int contadorPersonas=0;
		Persona centinela= new Persona("Centinela");
		
		s.add(centinela);
		Persona p= s.remove();
		while (p.getNombre()!="Centinela") {
			contadorPersonas++;
			s.add(p);
			p= s.remove();
		}
		return contadorPersonas;
		
	}
	
	


	public Persona buscarEnCola(String nombrePersona, Queue<Persona> s) {
		Persona personaBuscada=null;
		Queue<Persona>colaAux= new LinkedList<Persona>();
		
		while (!s.isEmpty() && personaBuscada==null) {
			Persona pAux=s.remove();
			colaAux.add(pAux);
			if (pAux.getNombre()==nombrePersona) {
				personaBuscada=pAux;
			}
		}
		pasarElementos(s, colaAux);
		s=colaAux;
		return personaBuscada;
	}
	

	private void pasarElementos (Queue<Persona> colaOri, Queue<Persona> colaAux) {
		while (!colaOri.isEmpty()) {
			colaAux.add(colaOri.remove());
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	
	
	
	
}
