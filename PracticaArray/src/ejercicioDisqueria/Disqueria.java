package ejercicioDisqueria;

import java.util.Arrays;

public class Disqueria {

	private int MIN_SELLO = 1;
	private int MAX_SELLO = 10;
	private Cd[] listaCds;

	public Disqueria() {
		this.listaCds = new Cd[100];
	}
	
	public void cargarCd ( int posicion, Cd cdAcargar) {
		listaCds [posicion]=cdAcargar;
		
	}

	public void sellosPorCD() {

		for (int i = 0; i < MAX_SELLO; i++) {
			int variableCd = contarSellos(i);
			System.out.println("La cantidad de sellos" + i + "esta en" + variableCd + "cantidad de Cd");
		}
	}

	private int contarSellos(int sello) {
		int contadorSellos = 0;
		for (Cd cd : listaCds) {
			if (cd != null && cd.getSello() == sello) {

				contadorSellos++;

			}

		}

		return contadorSellos;

	}

	@Override
	public String toString() {
		return "Disqueria [MIN_SELLO=" + MIN_SELLO + ", MAX_SELLO=" + MAX_SELLO + ", listaCds="
				+ Arrays.toString(listaCds) + "]";
	}
	
	
	
}
