package ejercicioclase3;

import java.util.Scanner;

public class Ejercicio2Clase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Num1;
		int Num2; 
		int Num3;
		int ValorMayor;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		Num1= scan.nextInt();
		System.out.println("Ingrese otro numero");
		Num2=scan.nextInt();
		System.out.println("Ingrese un tercer numero");
		Num3=scan.nextInt();
		//Esta forma es mejor según el profesor
		
		if (Num1>Num2 ) { 
			ValorMayor=Num1;
			
			
		} else {
			ValorMayor=Num2; 
		}
		
		if (Num3>ValorMayor) { 
			ValorMayor=Num3;
			
		
		
		System.out.println("El valor mayor es " + ValorMayor);
		
		scan.close();
	}
		
		
	}

}
