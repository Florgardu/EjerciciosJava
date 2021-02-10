import java.util.ArrayList;

public class prueba {

	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	


	public void agregarNumeros () {
		this.numeros.add(1);
		this.numeros.add(7);
		this.numeros.add(4);
		this.numeros.add(9);
		this.numeros.add(17);
		this.numeros.add(22);


	}
		
	public void eliminarPares() {
		// Eliminando todos los números pares de la colección.
		int indice = 0;
		// buscamos mientras no hayamos llegado al final
		// de la estructura.
		while (indice < numeros.size()) {
			if (numeros.get(indice) % 2 == 0) {
				// si es par lo quitamos
				numeros.remove(indice);
			} else {
				// incrementamos el índice para
				// pasar al siguiente elemento
				indice++;
			}
		}
		
		this.mostrarLista(numeros);

	}
	
	
	public void eliminarPares2() {
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % 2 == 0) {
				// si es par lo quitamos
				numeros.remove(i);
			} else {
				// incrementamos el índice para
				// pasar al siguiente elemento
				i++;
			}
			
		}
		
		this.mostrarLista(numeros);
	}
	
	
	public void eliminaPares3() {
		for (Integer integer : numeros) {
			if (integer % 2 == 0) {
				numeros.remove(integer);
			}
		}
		this.mostrarLista(numeros);
	}
	
	
	
	
	private void mostrarLista(ArrayList <Integer> lista) {
		for (Integer integer : lista) {
			System.out.println(integer);
		}
	}
	
}
