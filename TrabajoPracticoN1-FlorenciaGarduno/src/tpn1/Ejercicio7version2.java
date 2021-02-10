package tpn1;

import java.util.Scanner;

public class Ejercicio7version2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int num1;
		System.out.println("Ingrese un numero");
		num1 = scan.nextInt();
		int num2;
		System.out.println("Ingrese otro numero");
		num2 = scan.nextInt();
		int num3;
		System.out.println("Ingrese un tercer numero");
		num3 = scan.nextInt();
		int numMayor;

		if (num1 == num2 && num2 == num3) {
			System.out.println("Los tres son iguales");
		} else {
			if (num1 > num2) {
				if (num1 > num3) {
					numMayor = num1;
				} else {
					numMayor = num3;
				}
			} else {
				if (num2 > num3) {
					numMayor = num2;
				} else {
					numMayor = num3;
				}
			}
			System.out.println("numMayor::"+numMayor);

		}
		System.out.println("mensaje siempre");
		scan.close();

	}

}
