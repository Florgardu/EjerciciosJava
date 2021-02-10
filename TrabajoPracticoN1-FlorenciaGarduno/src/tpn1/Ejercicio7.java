package tpn1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizá un programa que al ingresar por teclado tres números enteros num1,
		 * num2 y num3, muestre el valor del mayor de todos. En caso de igualdad entre
		 * los tres imprimir "Los números son iguales".
		 */

		Scanner scan = new Scanner(System.in);

		int num1;
		System.out.println("Ingrese un numero");
		num1 = scan.nextInt();
		int num2;
		System.out.println("Ingrese otro numero");
		num2 = scan.nextInt();
		int num3;
		System.out.println("Ingrese un tercer numero");
		num3 = scan.nextInt();
		int numMayor;



		if (num1 == num2 && num2 == num3) {
			System.out.println("Los numeros son iguales");

		} else {
			
			if (num1 >= num2) {
				numMayor = num1;
			} else {
				numMayor = num2;
			}
			
			if (num3 >= numMayor) {
				numMayor = num3;
			}			
			System.out.println("El mayor es " + numMayor);
		}

		scan.close();

	}

}
