package ejercios3.x;

import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Desarrollar un algoritmo que, dado un número natural N, la computadora
		 * muestre los primeros N múltiplos de 3 excepto aquellos que sean a la vez
		 * múltiplos de 5. Ejemplo: Se ingresa 8, la computadora muestra: 3 6 9 12 18
		 * 21 24 27.
		 * 
		 */

		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese cuantos multiplos de 3 quiere saber");
		num = scan.nextInt();
		int contador = 1;
		int multiplos = 1;
		int resultadosMostrados = 1;

		while (resultadosMostrados <= num) {
			multiplos = (3 * contador);
			contador++;

			if (multiplos % 5 != 0) {
				System.out.println(multiplos);
				resultadosMostrados++;
			}
		scan.close(); 
	
		}

	}

}
