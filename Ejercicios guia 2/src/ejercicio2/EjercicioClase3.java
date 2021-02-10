package ejercicio2;
import java.util.Scanner;

public class EjercicioClase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num1;
		int Num2; 
		int ValorMayor;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		Num1= scan.nextInt();
		System.out.println("Ingrese otro numero");
		Num2=scan.nextInt();
		
		if (Num1>Num2) { 
			System.out.println("El mayor es " + (ValorMayor=Num1));
			
		} 
		else {
			System.out.println("El mayor es "+ (ValorMayor=Num2));
		}


	}

}
