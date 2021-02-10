package ar.com.ort;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temperaturaC;
		
		System.out.println("Ingrese temperatura en Cº");
		temperaturaC=new Scanner(System.in).nextInt();
		
		double conversion= 1.8*temperaturaC+32;
		System.out.println(temperaturaC + "grados C" + " son "+ conversion + "grados F" );
	
		
		
	}

}
