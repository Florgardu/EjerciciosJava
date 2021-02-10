package ejercicio1;

import java.lang.reflect.Array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] listaCompleta = {7,4,7,6,2,4};
		
		Excel programaQuitaDuplicados= new Excel();
		
		programaQuitaDuplicados.listaSinDuplicados(listaCompleta);
		
		programaQuitaDuplicados.mostrarListaDuplicados(listaCompleta);
		
		programaQuitaDuplicados.listaDuplicadosOpcion2(listaCompleta);
				
	}

}
