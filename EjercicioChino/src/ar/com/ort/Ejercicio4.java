package ar.com.ort;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1;
		int numero2;
		
		System.out.println("Ingrese primer numero entero");
		numero1= new Scanner(System.in).nextInt();
		
		System.out.println("Ingrese segundo numero entero");
		numero2= new Scanner(System.in).nextInt();
		
		int suma,resta,multiplicacion,division; 
		
		suma= numero1+numero2;
		resta=numero1-numero2;
		multiplicacion=numero1*numero2;
		division=numero1/numero2;
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplicacion);
		System.out.println(division);
				
				
		
	}

}
