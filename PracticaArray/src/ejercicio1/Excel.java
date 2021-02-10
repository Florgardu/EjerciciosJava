package ejercicio1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Excel {

	public ArrayList listaSinDuplicados(Integer[] listaTotales) {
		ArrayList<Integer> listaLimpia = new ArrayList();

		for (int i = 0; i < listaTotales.length; i++) {
			if (!seRepite(listaTotales[i], listaLimpia)) {
				listaLimpia.add(listaTotales[i]);
			}

		}
		System.out.println("Este no se repite" + listaLimpia);
		return listaLimpia;

	}

	private boolean seRepite(Integer integerPorParametro, ArrayList<Integer> listaLimpia) {

		for (Integer numSinRepetir : listaLimpia) {
			if (numSinRepetir.equals(integerPorParametro)) {
				return true;
			}

		}
		return false;
	}

	
	
	public ArrayList mostrarListaDuplicados(Integer[] listaTotales) {
		ArrayList<Integer> listaLimpia = new ArrayList();
		ArrayList<Integer> listaDupli = new ArrayList();

	
		for (int i = 0; i < listaTotales.length; i++) {
			if (seRepite(listaTotales[i], listaLimpia)) {
				listaDupli.add(listaTotales[i]);
			} else {
				listaLimpia.add(listaTotales[i]);
			}

		}
		System.out.println("Este no se repite" + listaDupli);
		return listaDupli;
	
	}
	
	
	
	public ArrayList listaDuplicadosOpcion2 (Integer[] listaTotales) {
		ArrayList<Integer> listaDupli = new ArrayList();
		boolean valorEncontrado=false;

		for (int i = 0; i < listaTotales.length; i++) {
			int numAEncontrar= listaTotales[i];
			for (int j = i+1; j < listaTotales.length || valorEncontrado==false ; j++) {
				if (numAEncontrar==listaTotales[j]) {
					valorEncontrado=true;
					listaDupli.add(listaTotales[j]);
				} 
			}
			
		
		}
		
		System.out.println("Lista duplicados otra opción" + listaDupli);
		return listaDupli;
	}
	
	

	
}
