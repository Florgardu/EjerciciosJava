package ejercicio2;

import java.util.ArrayList;

public class Programa {
	
	
	ArrayList<Atleta> atletasCarrera;
	
	

	public Programa() {
		this.atletasCarrera = new ArrayList <>();
	}
	
	
	
	public ArrayList calcularGanadores () {
		double TIEMPO_MAX= Double.MAX_VALUE;
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
		
		//Validar antes con un if que la lista tenga algo.
		
		for (Atleta j : this.atletasCarrera) {
			if (j.getSegundosCarrera()== TIEMPO_MAX) {
				TIEMPO_MAX=j.getSegundosCarrera();
				ganadores.add(j);
			} else {
				if (j.getSegundosCarrera()<TIEMPO_MAX) {
					TIEMPO_MAX=j.getSegundosCarrera();
					ganadores.clear();
					ganadores.add(j);
				}
			}
		    
		}
		
		return ganadores;
		
	}


	
	public void agregarJugadoresParaAnalizar (Atleta a) {
		this.atletasCarrera.add(a);
	}
	

	@Override
	public String toString() {
		return "Programa [atletasCarrera=" + atletasCarrera + "]";
	}
	
	

}
