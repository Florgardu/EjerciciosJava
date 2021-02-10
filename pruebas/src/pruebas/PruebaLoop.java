package pruebas;

import java.util.Scanner;

public class PruebaLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		System.out.println("empece");
		for (int indice = 0; indice < 10; indice++) {
			System.out.println(indice);
		}
		System.out.println("termine");
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num1= scan.nextInt();
		System.out.println("Ingrese otro numero");
		int num2=scan.nextInt();
		
		for(;num1<=num2;num1++){
			System.out.println(num1);
		}
	}

}
