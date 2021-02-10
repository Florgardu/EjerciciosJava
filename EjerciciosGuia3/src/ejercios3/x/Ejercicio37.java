package ejercios3.x;

import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Desarrollar un algoritmo que permita ingresar un número N. Acto seguido,
		 * permitir ingresar N números. La computadora muestra cuál fue el mayor y en
		 * qué orden apareció. Ejemplo: Se ingresa 5, luego 4 8 6 7 5, la computadora
		 * muestra: "El mayor es el 8 en la 2o posición".
		 */

		int cantidadNum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese cantidad de números");
		cantidadNum = scan.nextInt();
		int contador = 1;
		int numero;
		
		int numMayor = Integer.MIN_VALUE;
		numMayor = 0;
		int posicion = 1;

		while (contador <= cantidadNum) {
			System.out.println("Ingrese " + contador + " º numero");
			numero = scan.nextInt();
			if (numero > numMayor) {
				numMayor = numero;
				posicion = contador;

			}
			contador++;
		}
		System.out.println("el mayor es " + numMayor + " en la " + posicion);

	}

}
