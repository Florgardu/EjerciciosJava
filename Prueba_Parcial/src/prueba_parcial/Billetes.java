package prueba_parcial;

import java.util.Scanner;

public class Billetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valorBillete;
		int cantidadDeBilletes;
		final int VALOR_CORTE = 0;
		int acumuladorBilletes10 = 0;
		int acumuladorBilletes20 = 0;
		int acumuladorBilletes50 = 0;
		int acumuladorBilletes100 = 0;
		int dineroTotal;
		int valorBilleteMasIngresado;
		double porcentajeBillete10;
		double porcentajeBillete20;
		double porcentajeBillete50;
		double porcentajeBillete100;
		int totalBilletesIngresados;
		int contadorDeCargas=0;


		valorBillete = leerValidarBillete("Ingrese el valor del billete, 10, 20, 50 o 100 pesos ", VALOR_CORTE);
		while (valorBillete != VALOR_CORTE) {
			cantidadDeBilletes = leerCantidadBilletes("Ingrese cantidad de billetes");
			switch (valorBillete) {
			case 10:
				acumuladorBilletes10 = acumuladorBilletes10 + cantidadDeBilletes;
				break;

			case 20:
				acumuladorBilletes20 = acumuladorBilletes20 + cantidadDeBilletes;

				break;

			case 50:
				acumuladorBilletes50 = acumuladorBilletes50 + cantidadDeBilletes;

				break;

			default:
				acumuladorBilletes100 = acumuladorBilletes100 + cantidadDeBilletes;

				break;
				
			}
	        contadorDeCargas++;
			valorBillete = leerValidarBillete("Ingrese el valor del billete, 10, 20, 50 o 100 pesos ", VALOR_CORTE);
		}

		if (contadorDeCargas>0) {
			dineroTotal = calcularDineroTotal(acumuladorBilletes10, acumuladorBilletes20, acumuladorBilletes50,	acumuladorBilletes100);
			System.out.println("Se recaudaron " + dineroTotal + "$");
			valorBilleteMasIngresado = averiguarMayor(acumuladorBilletes10, acumuladorBilletes20, acumuladorBilletes50,	acumuladorBilletes100);
			System.out.println("Tenemos más billetes de" + valorBilleteMasIngresado);
			totalBilletesIngresados = acumuladorBilletes10 + acumuladorBilletes20 + acumuladorBilletes50+ acumuladorBilletes100;
			porcentajeBillete10 = calcularPorcentaje(acumuladorBilletes10, totalBilletesIngresados);
			porcentajeBillete20 = calcularPorcentaje(acumuladorBilletes20, totalBilletesIngresados);
			porcentajeBillete50 = calcularPorcentaje(acumuladorBilletes50, totalBilletesIngresados);
			porcentajeBillete100 = calcularPorcentaje(acumuladorBilletes100, totalBilletesIngresados);
            
			System.out.println("La composición de billetes es");
			System.out.println("10 pesos" + porcentajeBillete10 + "%");
			System.out.println("20 pesos" + porcentajeBillete20 + "%");
			System.out.println("50 pesos" + porcentajeBillete50 + "%");
			System.out.println("100 pesos" + porcentajeBillete100 + "%");



			
		} else {
			System.out.println("No se realizaron ingresos");
		}

	}

	public static int leerValidarBillete(String texto, int valor_corte) {
		int valorBillete;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		valorBillete = scan.nextInt();
		while (valorBillete != 10 && valorBillete != 20 && valorBillete != 50 && valorBillete != 100
				&& valorBillete != valor_corte) {
			System.out.println("Error " + texto);
			valorBillete = scan.nextInt();
		}
		return valorBillete;
	}

	public static int leerCantidadBilletes(String texto) {
		int cantidad;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		cantidad = scan.nextInt();
		return cantidad;
	}

	public static int calcularDineroTotal(int acumuladorBilletes10, int acumuladorBilletes20, int acumuladorBilletes50,int acumuladorBilletes100) {
		int dineroTotal;
		int dineroTotal10;
		int dineroTotal20;
		int dineroTotal50;
		int dineroTotal100;
		int valorBillete10 = 10;
		int valorBillete20 = 20;
		int valorBillete50 = 50;
		int valorBillete100 = 100;

		dineroTotal10 = (acumuladorBilletes10 * valorBillete10);
		dineroTotal20 = (acumuladorBilletes20 * valorBillete20);
		dineroTotal50 = (acumuladorBilletes50 * valorBillete50);
		dineroTotal100 = (acumuladorBilletes100 * valorBillete100);

		dineroTotal = dineroTotal10 + dineroTotal20 + dineroTotal50 + dineroTotal100;

		return dineroTotal;

	}

	public static int averiguarMayor(int acumuladorBilletes10, int acumuladorBilletes20, int acumuladorBilletes50,
			int acumuladorBilletes100) {
		int billeteMayor = 0;
		if (acumuladorBilletes10 > acumuladorBilletes20 && acumuladorBilletes10 > acumuladorBilletes50
				&& acumuladorBilletes10 > acumuladorBilletes100) {
			billeteMayor = 10;
		} else if (acumuladorBilletes20 > acumuladorBilletes10 && acumuladorBilletes20 > acumuladorBilletes50
				&& acumuladorBilletes20 > acumuladorBilletes100) {
			billeteMayor = 20;
		} else if (acumuladorBilletes50 > acumuladorBilletes20 && acumuladorBilletes50 > acumuladorBilletes100
				&& acumuladorBilletes50 > acumuladorBilletes10) {
			billeteMayor = 50;

		} else {
			billeteMayor = 100;

		}

		return billeteMayor;
	}
	
	public static double calcularPorcentaje( int acumuladorBillete, int totalBilletesIngresados) {
		double porcentaje;
	    porcentaje= ((double)acumuladorBillete/totalBilletesIngresados)*100; 
	    return porcentaje; 
	}
	

}
