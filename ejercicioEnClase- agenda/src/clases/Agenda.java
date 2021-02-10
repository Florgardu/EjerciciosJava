package clases;

import java.util.ArrayList;

public class Agenda {

	
	private ArrayList<Persona> listaContactos;
	
	
	public Agenda() {
		this.listaContactos = new ArrayList <Persona> (); 
	}

	public ArrayList<Persona> getListaContactos() {
		return listaContactos;
	}

	public void setListaContactos(ArrayList<Persona> listaContactos) {
		this.listaContactos = listaContactos;
	} 


	
	@Override
	public String toString() {
		return "Agenda [listaContactos=" + listaContactos + "]";
	}

	// 
	//public void agregarPersona (Persona personaParaAgregar) {
	//	listaContactos.add(personaParaAgregar);
	//}

	
	// otra forma de agregar persona a lista  - yo le hubiera pasado directamente la Persona no los atributos por parametro.
	
	public void agregarPersona(String nombre, String apellido, String dni, int tel, String mail) {
		Persona persona = buscarPersona(dni);

		if (persona==null) {
			listaContactos.add(new Persona(nombre, apellido, dni, tel, mail));
			System.out.println("Se agrego a " + nombre+ "satisfactoriamente");
		} else {
			System.out.println("Persona" + persona.getNombre() + "ya existe");
		}

	}
	
	
	public void eliminarPersona(Persona personaParaEliminar) {
		listaContactos.remove(personaParaEliminar);
	}
	
	

	
	public void mostrarTodasLasPersonas () {
		for (Persona persona : listaContactos) {
			System.out.println(persona);
			
		}
	}

	public Persona buscarPersona(String dni) {
		int contador = 0;
		Persona personaBuscada = null;
		Persona contactoEnLista;
		int tope = listaContactos.size() - 1;

		while (contador <= tope && personaBuscada==null) {
			contactoEnLista = listaContactos.get(contador);
			if (contactoEnLista.getDni().equals(dni)) {
				personaBuscada = contactoEnLista;
			} else {
				contador++;

			}

		}

		if (personaBuscada==null) {
			System.out.println("Persona no encontrada");
		} else {
			System.out.println("Encontre la persona es " + personaBuscada);
		}

		return personaBuscada;
	}

}
	
