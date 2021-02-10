package ejercicio2;
import java.util.Scanner;

public class Eje5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1;
		int numero2;

		int division;
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese primer numero");
		numero1 = scan.nextInt();
		System.out.println("Ingrese segundo numero");
		numero2 = scan.nextInt();

		division = numero1 / numero2;

		System.out.println(division);
		if (numero1 % numero2 != 0) {
			System.out.println(numero1 % numero2);
		}

	}
	
	

}
