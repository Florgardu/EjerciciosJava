package ar.com.ort;

import java.util.Scanner;

public class ejercicio1 {
/*
	//defino variables
	definir numeroIngreso como entero;
	definir opuesto como entero;
	definir inverso como real;
	
	// pido invgreso
	Escribir "Ingrese numero";
	Leer numeroIngreso;
	
	//calculo
	opuesto = numeroIngreso*(-1); 
	inverso = 1/ numeroIngreso;
	
	//muestro resultado
	Escribir "El opuesto de " , numeroIngreso ," es ", opuesto; 
	Escribir "El inverso es ", inverso; 
*/
	
	public static void main(String[] args) {
		//defino variables
		// definir numeroIngreso como entero;
		int numeroIngreso;
		// definir opuesto como entero;
		int opuesto;
		// definir inverso como real;
		double inverso;
		
		// pido invgreso
		// Escribir "Ingrese numero";
		System.out.println("Ingrese numero");
		
		// Leer numeroIngreso;
		numeroIngreso = new Scanner(System.in).nextInt();
		
		//calculo
		opuesto = numeroIngreso*-1; 
		inverso = 1.0/ numeroIngreso;
		/*
		 * tambien puede ser
		 * inverso = (double)1/ numeroIngreso;
		 * o
		 * inverso = 1d/ numeroIngreso;
		 */
		
		//muestro resultado
		//Escribir "El opuesto de " , numeroIngreso ," es ", opuesto;
		System.out.println("El opuesto de " + numeroIngreso +" es "+ opuesto);
		//Escribir "El inverso es ", inverso; 	    
		System.out.println("El inverso es "+ inverso);

		
	}

}
