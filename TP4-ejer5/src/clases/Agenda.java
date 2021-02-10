package clases;

import java.util.ArrayList;

public class Agenda {

	ArrayList<Persona> listaPersonas;

	public Agenda() {
		this.listaPersonas = new ArrayList<Persona>();
	}

	@Override
	public String toString() {
		return "Agenda [listaPersonas=" + listaPersonas + "]";
	}

	public boolean buscarPersona(Persona contacto) {
		boolean existe = false;
		int contador = 0;

		while (contador < listaPersonas.size() && !existe) {
			if (listaPersonas.get(contador).getDni().equals(contacto.getDni())) {
				existe = true;
			}
			
			contador++;
		}
		return existe;
	}

	public void agregarPersonas(Persona contactoNuevo) {
		boolean puedoAgregar = this.buscarPersona(contactoNuevo);
		if (!puedoAgregar) {
			listaPersonas.add(contactoNuevo);

		} else {
			System.out.println("ya existe este contacto con los mismos datos");
		}

	}
	
	
	public void eliminarPersonas(Persona contactoNuevo) {
		boolean puedoAgregar = this.buscarPersona(contactoNuevo);
		if (puedoAgregar) {
			listaPersonas.remove(contactoNuevo);

		} else {
			System.out.println("no existe este contacto no se puede eliminar");
		}

	}
	
	public void mostrarListaPersonas () {
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}
		
	}

	public void BuscarPersonaPorDni(String dni) {
		int contador = 0;
		boolean existe = false;
		Persona personaBuscada;

		while (contador < listaPersonas.size() && !existe) {
			Persona personaEnLista = listaPersonas.get(contador);
			if (personaEnLista.getDni().equals(dni)) {
				existe = true;
				personaBuscada = personaEnLista;
				System.out.println("La persona con ese dni es " + personaBuscada);

			}
			contador++;
			
		}
		
		if (!existe) {
			System.out.println("Persona no existe");
			
		}
		
	

	}

}


