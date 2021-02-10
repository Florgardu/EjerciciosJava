package ejercicio2;

import java.util.Scanner;


public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		
		System.out.println("Hola ingrese su numero");
		numero = new Scanner(System.in).nextInt();
        
		if (numero>=0) {
			System.out.println("tu numero es positivo");
			
		} 
		else {
			System.out.println("tu numero es negativo");
		}
		

	}

}
