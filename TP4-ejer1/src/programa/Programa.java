package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Realizá un programa que lea por teclado 10 números enteros positivos y los guarde en un
	/* ArrayList. A continuación,
	a. Calculá y mostrá el promedio de los valores ingresados
	b. Calculá y mostrá el promedio de los números que estén en las posiciones pares
		 */

		ArrayList<Integer> listaNumeros = new ArrayList <Integer> ();
		
		listaNumeros= pedirNumeros("Ingrese 10 números enteros positvos");
		System.out.println(listaNumeros);
		double promedio= calcularPromedio (listaNumeros);
		System.out.println(promedio);
		
	}

	public static ArrayList pedirNumeros (String mensaje) {
		ArrayList<Integer> listaNum = new ArrayList <Integer> ();
	
		for(int i =0;i<4;i++){	
			Scanner scan= new Scanner (System.in);
			System.out.println(mensaje);
			int numero=scan.nextInt();
			listaNum.add(numero);	
		}
		return listaNum; 	
	}
	
	public static double calcularPromedio (ArrayList<Integer> lista) {
		double promedio = 0;
		int sumatoriaNum=0; 
		for (int numero : lista) {
			sumatoriaNum= sumatoriaNum+numero;
		}
		
		promedio= sumatoriaNum/lista.size();
		return promedio;
		
	}
	
	
	public static double calcularPromedioPares (ArrayList<Integer> lista) {
		double promedio = 0;
		int sumatoriaNum=0; 
		int contadorNumPar=0;
		
		for(int i =0;i<10;i=i+2){	
		int numeroPar= lista.get(i);
			sumatoriaNum= sumatoriaNum+numeroPar;
			contadorNumPar++;
		}
		
		promedio= sumatoriaNum/contadorNumPar;
		return promedio;
		
	}
		
	}




