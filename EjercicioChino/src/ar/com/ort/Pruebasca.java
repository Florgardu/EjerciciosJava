package ar.com.ort;

import java.util.Scanner;

public class Pruebasca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//defino variables
				// definir numeroIngreso como entero;
				int numeroIngreso;
				// definir opuesto como entero;
				int opuesto;
				// definir inverso como real;
				double inverso;
				//defino variable scan
				Scanner scan= new Scanner(System.in);
				
				// pido invgreso
				// Escribir "Ingrese numero";
				System.out.println("Ingrese numero");
				
				// Leer numeroIngreso;
				numeroIngreso = scan.nextInt();
				
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


