package ejercios3.x;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Desarrollar un algoritmo que, dado un entero N entre 1 y 10 (inclusive), la
		 * computadora muestre la tabla de multiplicar de N.
		 */
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Ingrese un numero del 1 al 10");
		num = scan.nextInt();
		scan.close();
		if(validar(num)) {
			calcularTabla(num);
		} else {
			System.out.println("error");
		}
	}

	public static void calcularTabla(int num) {

		int cont = 1;
		while (cont <= 10) {
			System.out.println("" + num + " x " + cont + " = " + num * cont);
			cont = cont + 1;
		}

	}
	
	public static boolean validar(int num) {
		boolean esValido = false;
	
		if (num <= 0 || num > 10) {
			esValido = false;
		} else {
			esValido = true;
		}
		
		return esValido;
		
		// return !(num <= 0 || num > 10)
	}

}
