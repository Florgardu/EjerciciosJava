package ejercicio2;

import java.util.Scanner;

public class MainMejoradoVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int numero = 0;

		System.out.println("Ingrese un numero");

		do {
			try {
				numero = scanner.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				String caracterError= scanner.next();
				System.out.println("Ingreso el valor no numerico "  +  caracterError);
			}

		} while (numero == 0);

		System.out.println("El numero ingresado es " + numero);
	}

}
