package ejercicio5;

import java.util.ArrayList;

public class Edificio {

	private ArrayList<Vivienda> viviendas;

	public Edificio() {
		this.viviendas = new ArrayList();
	}

	public void agregarViviendas(Vivienda vivienda) {
		this.viviendas.add(vivienda);
	}

	public ArrayList<Vivienda> getViviendas() {
		return viviendas;
	}

	public void setViviendas(ArrayList<Vivienda> viviendas) {
		this.viviendas = viviendas;
	}

	public Vivienda buscarVivienda(int piso, String depto) {
		Vivienda viviendaBuscada = null;
		int contador = 0;

		while (contador < this.viviendas.size() && viviendaBuscada == null) {
			Vivienda viviendaEnLista = this.viviendas.get(contador);
			if (viviendaEnLista.getPiso() == piso && viviendaEnLista.getDepartamento().equals(depto)) {
				viviendaBuscada = viviendaEnLista;
			} else {
				contador++;
			}

		}

		return viviendaBuscada;

	}

	// realizarMudanza(), que recibirá el piso y
	// departamento de origen, y el piso y departamento de destino, se deberá
	// trasladar personas
// 	y muebles de una vivienda a la otra

	public void realizarMudanza(int piso1, String deptoOrigen, int piso2, String deptoDestino) {
		Vivienda viviendaOrigen = buscarVivienda(piso1, deptoOrigen);
		Vivienda viviendaDestino = buscarVivienda(piso2, deptoDestino);

		if (viviendaOrigen != null) {
			ArrayList<Persona> personasAMudar = viviendaOrigen.getInquilinos();
			ArrayList<Mueble> mueblesAMudar = viviendaOrigen.getMuebles();
			for (int i = 0; i < personasAMudar.size(); i++) {
				Persona persona = personasAMudar.get(i);
				viviendaDestino.agregarPersonas(persona);

			}

			for (int i = 0; i < mueblesAMudar.size(); i++) {
				Mueble mueble = mueblesAMudar.get(i);
				viviendaDestino.agregarMuebles(mueble);
			}

			viviendaOrigen.vaciarVivienda();
		}

	}

	public void mostrarTodo() {
		for (Vivienda vivienda : viviendas) {
			vivienda.mostrarTodo();
		}
	}

	@Override
	public String toString() {
		return "Edificio [viviendas=" + viviendas + "]";
	}

}
