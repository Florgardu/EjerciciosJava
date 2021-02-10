package ejercicio2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroIngresado;
		Scanner scan = new Scanner(System.in);
		int enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;
		enero = 1;
		febrero = 2;
		marzo = 3;
		abril = 4;
		mayo = 5;
		junio = 6;
		julio = 7;
		agosto = 8;
		septiembre = 9;
		octubre = 10;
		noviembre = 11;
		diciembre = 12;
		System.out.println("Ingrese un numero");
		numeroIngresado = scan.nextInt();
		scan.close();
		if (numeroIngresado >= 1 && numeroIngresado <= 12) {

			if (numeroIngresado == enero) {
				System.out.println("Enero");
			}

			if (numeroIngresado == febrero) {
				System.out.println("Febrero");

			}

			if (numeroIngresado == marzo) {
				System.out.println("Marzo");

			}

			if (numeroIngresado == abril) {
				System.out.println("Abril");

			}
			if (numeroIngresado == mayo) {
				System.out.println("Mayo");

			}

			if (numeroIngresado == junio) {
				System.out.println("Junio");

			}

			if (numeroIngresado == julio) {
				System.out.println("Julio");

			}

			if (numeroIngresado == agosto) {
				System.out.println("Agosto");

			}
			if (numeroIngresado == septiembre) {
				System.out.println("Septiembre");

			}
			if (numeroIngresado == octubre) {
				System.out.println("Octubre");

			}

			if (numeroIngresado == noviembre) {
				System.out.println("Noviembre");

			}

			if (numeroIngresado == diciembre) {
				System.out.println("Diciembre");

			}

		} else {
			System.out.println("Mes no valido");

		}
	}
}
