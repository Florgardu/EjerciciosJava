package modularizacion;

import java.util.Scanner;

public class Ejercicio511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Desarrollar un algoritmo que permita ingresar un número N. 
		 * Acto seguido, permitir ingresar N números. 
		 * La computadora muestra cuál fue el mayor y en qué orden apareció.
           Ejemplo: Se ingresa 5, luego 4 8 6 7 5, la computadora muestra: 
           "El mayor es el 8 en la 2o posición".
		 */
		
		
		int cantidadNum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese cantidad de números");
		cantidadNum = scan.nextInt();
	
		int elMayor=muestraElMayor(cantidadNum);
		System.out.println("El mayor es "+ elMayor );
	}

	
	public static int muestraElMayor (int cantidadN) {
		int elMayor=0; 
		int contador=1;
		int numero;
		Scanner scan = new Scanner(System.in);

		
		while (contador<=cantidadN) {
			System.out.println("Ingrese "+ contador +" º"+  " numero");
			numero = scan.nextInt();
			if (numero>elMayor) {
				elMayor=numero;
		
			}
			
			contador++;

		}
					
			return elMayor; 	
	}
	
	
}
