package modularizacion;

import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir el procedimiento imprimirSimbolo, que imprima por consola n veces un
		 * carácter en la misma línea. Tanto n como el caracter se reciben como
		 * parámetro. Ejemplo: Se invoca imprimirSimbolo(5,'#') → imprime "#####".
		 */

		Scanner scan = new Scanner(System.in);
		int n;
		String caracter; 
		System.out.println("Ingrese cantidad de veces");
		n= scan.nextInt();
		System.out.println("Ingrese simbolo");
		caracter=scan.next();
		imprimirSimbolo (n,caracter);
		
		scan.close();
		
	}

	public static void imprimirSimbolo(int n, String caracter) {
		int contador = 0;
		while (contador < n) {
			System.out.print(caracter);
			contador++;

		}
	}
}