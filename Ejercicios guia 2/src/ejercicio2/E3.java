package ejercicio2;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int numeroIngreso;
	    System.out.println("Escriba un numero");
		numeroIngreso = new Scanner(System.in).nextInt();
	     
		int modulo = numeroIngreso%2;
		if(modulo ==0) {
			System.out.println("tu es par");
			
		} 
		else {
			System.out.println("tu numero es impar");
		}
		
	}

}
