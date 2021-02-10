package ar.com.ort;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main  (String[] args) {
		// TODO Auto-generated method stub

		int sueldoFijo=8000;
		double valorArticulo;
		int cantidadVendidos;
		
		System.out.println("Ingrese valor articulo vendido");
		valorArticulo =new Scanner(System.in).nextDouble();
		
		
		System.out.println("Ingrese cantidad de articulos vendidos");
		cantidadVendidos= new Scanner(System.in).nextInt();
		
		double comision;
		comision= (valorArticulo*cantidadVendidos)*0.14;
		double sueldoTotal;
		sueldoTotal= comision+sueldoFijo;
		
		System.out.println("Tu sueldo este mes es "+ sueldoTotal);
		
	
		
	}

}
