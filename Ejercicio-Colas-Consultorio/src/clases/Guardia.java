package clases;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;

public class Guardia {

	
	Queue<Paciente> colaPacientes= new LinkedList<Paciente>();
	Consultorio[] consultorios;
	
	
	public Guardia() {
		this.consultorios = new Consultorio [5];
		this.llenarConsultorio();
	} 
	
	private void llenarConsultorio() {
		for (int i = 0; i < consultorios.length; i++) {
			consultorios[i]=new Consultorio();
		}
	}
	
}

