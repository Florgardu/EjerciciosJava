package clases;

import java.util.ArrayList;

public class Vehiculo {
	
	
	private double precio;
	private ArrayList<Persona> listaPersonasInteresadas; 
	private Marca marca; 
	private Tipo tipo;
	
	
	public Vehiculo(double precio, Marca marca, Tipo tipo) {
		this.precio = precio;
		this.listaPersonasInteresadas = new ArrayList<Persona>();
		this.marca = marca;
		this.tipo = tipo;
	}


	public double getPrecio() {
		return precio;
	}


	public ArrayList<Persona> getListaPersonasInteresadas() {
		return listaPersonasInteresadas;
	}


	public Marca getMarca() {
		return marca;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public void setListaPersonasInteresadas(ArrayList<Persona> listaPersonasInteresadas) {
		this.listaPersonasInteresadas = listaPersonasInteresadas;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Vehiculo [precio=" + precio + ", listaPersonasInteresadas=" + listaPersonasInteresadas + ", marca="
				+ marca + ", tipo=" + tipo + "]";
	} 
	
	
	public void agregarPersonaInteresada (Persona personaInteresada) {
		this.listaPersonasInteresadas.add(personaInteresada);
	}
	
	
	// metodo pedido
	
	public Persona obtenerCliente (String dni) {
		
		int contador=0; 
		Persona personaEncontrada=null;
		Persona personaEnLista=null;

		
		while (contador<listaPersonasInteresadas.size()&& personaEncontrada==null ) {
			personaEnLista= listaPersonasInteresadas.get(contador);
			if (personaEnLista.getDni().equals(dni)) {
				personaEncontrada=personaEnLista; 
			} else {
				contador++;
			}
		}
		return personaEncontrada;
	}
	
}
