package ar.com.ort;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valorAngulo1;
		int valorAngulo2;
		
		System.out.println("Ingrese valor primer angulo");
		valorAngulo1= new Scanner(System.in).nextInt();
		
		System.out.println("Ingrese valor segundo angulo");
		valorAngulo2= new Scanner(System.in).nextInt();
		
		int calculoTercerAngulo;
		calculoTercerAngulo = 180-(valorAngulo1+valorAngulo2);
		
		System.out.println("El valor del tercer angulo es "+ calculoTercerAngulo);
		
	}

}
