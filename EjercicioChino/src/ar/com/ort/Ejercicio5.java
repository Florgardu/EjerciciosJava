package ar.com.ort;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1;
		int nota2;
		int nota3;
		
		System.out.println("Ingrese nota primer trimestre");
		nota1=new Scanner(System.in).nextInt();
		
		System.out.println("Ingrese nota segundo trimestre");
		nota2=new Scanner(System.in).nextInt();
		
		System.out.println("Ingrese nota tercer trimestre");
		nota3=new Scanner(System.in).nextInt();
		
		double promedio;
		promedio= (nota1+nota2+nota3)/3.0;
		
		System.out.println("Hola tu nota promedio es "+ promedio);
		

	}

}
