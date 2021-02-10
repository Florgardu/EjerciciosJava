package tpn1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Realizá un programa que pida al usuario ingresar dos 
		 * números enteros num1 y num2. 
		 * Luego, mostrar el resultado de la suma entre ambos, 
		 * utilizando el siguiente formato: “La suma entre “ + num1 + “ y “ + num2 + “ da como resultado “ + num1 + num2

		 */
		
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Ingrese un numero entero");
		num1=scan.nextInt();
		System.out.println("Ingrese otro numero entero");
		num2=scan.nextInt();
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + (num1 + num2));
		
		scan.close();


	}

}
