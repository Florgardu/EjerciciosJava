package ejercicio2;

import java.util.ArrayList;

public class CD {
	

	private ArrayList<Cancion> listaCanciones;

	// constructor

	public CD() {
		this.listaCanciones = new ArrayList<Cancion>();
	}

	// getter y setters
	public ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	@Override
	public String toString() {
		return "CD [listaCanciones=" + listaCanciones + "]";
	}

	// numeroCanciones(): devuelve el valor del contador de canciones.

	public int numeroCanciones() {
		return listaCanciones.size();
	}

	// dameCancion(int): devuelve la Cancion que se encuentra en la posición
	// indicada.

	public Cancion dameCancion(int numeroTema) {
		return listaCanciones.get(numeroTema-1);
	}

	// grabaCancion(int, Cancion): cambia la Cancion de la posición indicada por la
	// nueva
//	Cancion proporcionada. 

	public void grabaCancion(int posicion, Cancion cancionNueva) {
		listaCanciones.set(posicion, cancionNueva);
	}

	// agrega(Cancion): agrega al final del array la Cancion proporcionada.

	public void agrega(Cancion cancionNueva) {
		listaCanciones.add(cancionNueva);
	}

	// h. elimina(int): elimina la Cancion que se encuentra en la posición indicada.

	public void EliminaCancion(int posicion) {
		listaCanciones.remove(posicion);
	}

}
