package ejercicioclase3;

import java.util.Scanner;

public class Ejercicio1Clase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Num1;
		int Num2; 
		int Num3;
		int ValorMayor=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		Num1= scan.nextInt();
		System.out.println("Ingrese otro numero");
		Num2=scan.nextInt();
		System.out.println("Ingrese un tercer numero");
		Num3=scan.nextInt();
		
		if (Num1>Num2 & Num1>Num3) { 
			ValorMayor=Num1;
			
			
		} 
		
		if (Num2>Num1 & Num2>Num3) { 
			ValorMayor=Num2;
			
		}
		
		if (Num3>Num1 & Num3>Num2) {
			ValorMayor=Num3;
		}
		
		
		System.out.println("El valor mayor es " + ValorMayor);
		
		scan.close();
	}

		
		
		
	
}
