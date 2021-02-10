package ar.com.ort;

import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valorDeHora;
		int HorasTrabajadas;
		int sueldoFinal;
		int cantidadDeHoras;
		
		System.out.println("Ingrese cantidad de horas trabajadas");
		HorasTrabajadas = new Scanner(System.in).nextInt();
		
		System.out.println("Ingrese valor de hora");
		valorDeHora = new Scanner(System.in).nextInt();
		
		cantidadDeHoras= (HorasTrabajadas*5)+(HorasTrabajadas/2);
		sueldoFinal= cantidadDeHoras*valorDeHora;
		
		System.out.println("Hola tu sueldo de esta semana es " + sueldoFinal);

	}

}
