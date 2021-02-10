package tpn1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizá un programa que, dados dos números enteros num1 y num2 cargados
		 * desde teclado por el usuario, muestre el resultado de la división del
		 * primero por el segundo siguiendo el formato num1 + “ / “ + num2 + “ = “ +
		 * resultado. En el caso de que el segundo valor num2 sea cero, mostrar el
		 * siguiente mensaje de error: “No se puede dividir por cero”.
		 */

		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		double resultado;

		System.out.println("Ingrese un número");
		num1 = scan.nextInt();
		System.out.println("Ingrese otro número");
		num2 = scan.nextInt();

		if (num2 == 0) {
			System.out.println("No se puede dividir por cero");
		} else {
			resultado = (double) num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + resultado);
		}

		scan.close();

	}

}
