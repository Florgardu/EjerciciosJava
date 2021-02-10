package modularizacion;

import java.util.Scanner;

public class Ejercicio55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escribir la función fibo, que devuelva el n-ésimo término de la sucesión de
Fibonacci, donde n es un entero que se recibe como parámetro.
Ejemplo:Seinvocafibo(10)→devuelve34.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int cantidadDeNum;
		System.out.println("Ingrese cantidad de numero de la sucesión de Fibonacci");
		cantidadDeNum= scan.nextInt();
		
		
		
		int contador=1;
		int n1=0;
		int n2=1; 
		int n3;
		
		System.out.println(n1);
		System.out.println(n2);
		while (contador<(cantidadDeNum-1)) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			contador++;
			System.out.println(n3);
			
		/* 	
			int fiboPD(int n, int tabla[])
			{
			if (tabla[n]!=0)
			return (tabla[n]);
			else
			if (n==1 || n==2)
			{
			tabla[n]=1;
			return(tabla[n]);
			}
			else
			{
			tabla[n]=fiboPD(n-1,tabla)+fiboPD(n-2,tabla);
			return(tabla[n]);
		*/
		
	}
		
		

}
	
}
