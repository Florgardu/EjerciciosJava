package ejercicio3;

import java.util.ArrayList;

public class Hito {
	
	private String fecha;
	private String descripcion;
	private ArrayList<Persona>personasInvolucradas;
	
	
	
	public Hito(String fecha, String descripcion, Persona personaInvolucrada) {
		super();
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personasInvolucradas = new ArrayList ();
		this.personasInvolucradas.add(personaInvolucrada);
	}
	
	

}
