package clases;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tragamoneda {
	
	private int[] rodillos;
	private int cantidadRodillos;
	
	
	
	public Tragamoneda( int cantidadRodillos) {
		this.rodillos = new int [cantidadRodillos] ;
	}
	
	public Tragamoneda() {
	}
	
	
	
	public void invertir (int[] numeros) {
		int aux;

		for (int i = 0; i < numeros.length-1; i++) {
			aux= numeros[i];
			numeros[i]= numeros[numeros.length];
			numeros[numeros.length]=aux;
		}
		}
		
		
	}
	
	


