package modularizacion;

import java.util.Scanner;

public class Ejercicio54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir la función esPrimo, que devuelva true o false según si un número
		 * recibido como parámetro es primo. Ejemplo:SeinvocaesPrimo(17)→devuelvetrue.
		 */

		int numeroIngresado;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		numeroIngresado = scan.nextInt();
		System.out.println(esPrimo(numeroIngresado));
   
		scan.close();
	}

	public static boolean esPrimo(int numero) {
		boolean primo = true;
		int contador = 2;

		while (contador<numero && primo) {
			if (numero % contador == 0) {
				primo = false;
			}
			contador++;


		}
		return primo;

	}
}
