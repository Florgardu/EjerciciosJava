package ejercicio2;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;
		int sueldo;
		Scanner scan = new Scanner(System.in);
		double cuota = 0;

		System.out.println("Ingrese edad");
		edad = scan.nextInt();
		System.out.println("ingrese sueldo");
		sueldo = scan.nextInt();

		if (sueldo <= 20000) {
			cuota = sueldo * 0.005;
		} else if (sueldo <= 29000) {
			cuota = sueldo * 0.008;
		} else if (sueldo <= 39999) {
			cuota = sueldo * 0.011;
		} else {
			cuota = sueldo * 0.014;
		}

		if (edad >= 30) {
			System.out.println(cuota = cuota * 1.3);
		} else {
			System.out.println(cuota);
		}

	}
}
