package ejercicio3;

import java.util.ArrayList;

public class Programa {

	ArrayList<Atleta> listaAtletas;

	public Programa() {
		this.listaAtletas = new ArrayList<>();
	}

	
	
	private ArrayList darListaGanadores(ArrayList<Atleta> listaOriginal) {
		double TIEMPO_MAX = Double.MAX_VALUE;
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();

		for (Atleta j : listaOriginal) {
			if (j.getSegundosCarrera() == TIEMPO_MAX) {
				TIEMPO_MAX = j.getSegundosCarrera();
				ganadores.add(j);
			} else {
				if (j.getSegundosCarrera() < TIEMPO_MAX) {
					TIEMPO_MAX = j.getSegundosCarrera();
					ganadores.clear();
					ganadores.add(j);
				}
			}

		}

		return ganadores;

	}

	public void calcularPodioGanadores() {
		ArrayList<Atleta> ganadores1Puesto = new ArrayList<Atleta>();
		ArrayList<Atleta> ganadores2Puesto = new ArrayList<Atleta>();
		ArrayList<Atleta> ganadores3Puesto = new ArrayList<Atleta>();

		ganadores1Puesto = this.darListaGanadores(this.listaAtletas);

		if (ganadores1Puesto != null) {
			Atleta primerPuesto = ganadores1Puesto.get(0);
			double tiempo = primerPuesto.getSegundosCarrera();
			this.borrarAtletasPorTiempo(tiempo);
		}

		ganadores2Puesto = this.darListaGanadores(this.listaAtletas);

		if (ganadores2Puesto != null) {
			Atleta segundoPuesto = ganadores2Puesto.get(0);
			double tiempo = segundoPuesto.getSegundosCarrera();
			this.borrarAtletasPorTiempo(tiempo);
		}

		ganadores3Puesto = this.darListaGanadores(this.listaAtletas);

		if (ganadores3Puesto != null) {
			Atleta tercerPuesto = ganadores1Puesto.get(0);
			double tiempo = tercerPuesto.getSegundosCarrera();
			this.borrarAtletasPorTiempo(tiempo);
		}

		System.out.println("Los ganadores en primer puesto son" + ganadores1Puesto);
		System.out.println("Los ganadores en segundo puesto son" + ganadores2Puesto);
		System.out.println("Los ganadores en tercer puesto son" + ganadores3Puesto);

	}

	
	private void borrarAtletasPorTiempo(double tiempo) {
		ArrayList<Atleta> atletasAEliminar = new ArrayList<Atleta>();
		for (Atleta atleta : this.listaAtletas) {
			if (atleta.getSegundosCarrera() == tiempo) {
				atletasAEliminar.add(atleta);
			}
		}
		this.listaAtletas.removeAll(atletasAEliminar);
	}

	public void agregarJugadoresParaAnalizar(Atleta a) {
		this.listaAtletas.add(a);
	}

	@Override
	public String toString() {
		return "Programa [atletasCarrera=" + listaAtletas + "]";
	}

}
