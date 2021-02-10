package clase4taller;

import java.util.Scanner;

public class Primerejerciciowhilw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		int num1;
		int cont;
		final int TOPE=10;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		num1=scan.nextInt();
		
		System.out.println("Ingrese un contador ");
		cont=scan.nextInt();
		
		while (cont <=TOPE) {
			System.out.println("el valor de la multiplicación es: " + cont*num1);
			cont++; 
		
	}
	}
}
