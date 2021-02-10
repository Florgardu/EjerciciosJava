package ejercios3.x;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Desarrollar un algoritmo que permita ingresar un número N. Acto seguido,
		 * permitir ingresar N números enteros, correspondientes a las notas de un
		 * curso. La computadora muestra el promedio de las notas ingresadas. Ejemplo:
		 * Se ingresa 4, luego 4 7 3 9, la computadora muestra: 5.75. /*
		 * 
		 */

		int cantidadDeNotas;
		int notas;
		notas = 0;
		int contador;
		contador = 1;
		double sumatoriaNotas;
		sumatoriaNotas = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese cantidad de notas");
		cantidadDeNotas = scan.nextInt();

		while (contador<=cantidadDeNotas) {
			System.out.println("Ingrese " + contador + " nota");
			notas=scan.nextInt();
			sumatoriaNotas = (sumatoriaNotas + notas);
			contador = contador + 1;

		}
		
		double resultado;
		resultado = sumatoriaNotas / cantidadDeNotas;

		System.out.println("Tu promedio es " + resultado);
		scan.close(); 

	} 	
	 

}
