package clases;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numeros []= new int[] {5, 8, 6, 20, 18, 34, 9, 12, 16, 83};

		Tragamoneda t= new Tragamoneda();
		
	//	t.invertir(numeros);
		
		System.out.println(numeros);

		
		  char[][] presentismo = 
			{ { 'P', 'P', 'P', 'P', 'P', 'P', 'T', 'P', 'P', 'P', 'P', 'P' },
			{ 'A', 'P', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'T', 'P' },
			{ 'T', 'P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
			{ 'P', 'P', 'T', 'T', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
			{ 'T', 'P', 'T', 'P', 'P', 'A', 'P', 'P', 'A', 'P', 'P', 'A' },
			{ 'P', 'P', 'P', 'P', 'T', 'T', 'P', 'P', 'P', 'P', 'A', 'P' },
			{ 'P', 'T', 'A', 'P', 'P', 'P', 'T', 'T', 'A', 'P', 'P', 'A' },
			{ 'P', 'P', 'P', 'P', 'A', 'A', 'T', 'P', 'P', 'P', 'P', 'A' },
			{ 'P', 'P', 'A', 'P', 'A', 'T', 'P', 'P', 'T', 'P', 'P', 'P' } };
		
		  
		  char[] presentismo2 = presentismo[0];

		  System.out.println(presentismo2);
		    
		  PadrePrueba p= new PadrePrueba(10);
		  HijoPrueba h= new HijoPrueba(3, 5);
	
		
		  
		  ClaseB objetoClaseB = new ClaseB();
	        // Accede al atributo x declarado en ClaseB (devuelve 5)
	        System.out.println(objetoClaseB.getX());
	        // Accede al atributo x declarado en ClaseA al usar super (devuelve 1)
	        System.out.println(objetoClaseB.getSuperX());
	        // Accede al atributo x de la ClaseA sin usar super (devuelve 10)
	        System.out.println(objetoClaseB.get10X());
		  
	        h.dameCantidadDeOjos();
			  h.getOjos();

	}

}
