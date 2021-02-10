import java.util.Scanner;

public class ParcialBilletes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valorBillete;
		int cantidadBilletes;
		final int VALORCORTE = 0;
		boolean billeteEsValido;
		int contB10 = 0;
		int contB20 = 0;
		int contB50 = 0;
		int contB100 = 0;
		int totalBilletes; 
		 
	

		valorBillete = IngresoValorBillete("Ingrese el valor del billete"); /* lee y valida */

		while (valorBillete != 0) {
			cantidadBilletes = leerCantidadBillete("Ingrese cantidad de billetes");
			switch (valorBillete) {
				case 10:
					contB10 = contB10 + cantidadBilletes;
					break;
	
				case 20:
					contB20 = contB20 + cantidadBilletes;
					break;
	
				case 50:
					contB50 = contB50 + cantidadBilletes;
					break;
	
				default:
					contB100 = contB100 + cantidadBilletes;
					break;
			}

			valorBillete = IngresoValorBillete("Ingrese el valor del billete");
		}
		
		totalBilletes= (contB10+ contB20+ contB100+ contB50);

		if (totalBilletes == 0) {
			System.out.println("Termino programa. No se ingresaron billetes");
		} else {
			mostrarMontoTotal(contB10, contB20, contB50, contB100);
			mostrarMax(contB10, contB20, contB50, contB100);

			mostrarPorcentajeDeBilletes(totalBilletes, contB10);
			mostrarPorcentajeDeBilletes(totalBilletes, contB50);
			mostrarPorcentajeDeBilletes(totalBilletes, contB100);
			mostrarPorcentajeDeBilletes(totalBilletes, contB20);

		}
		
		


	}

	public static int IngresoValorBillete(String texto) {
		int valor;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		valor = scan.nextInt();
		while (valor != 10 && valor != 100 && valor != 50 && valor != 20 && valor != 0) {
			System.out.println("Error vuelva a ingresar un valor correcto");
			valor = scan.nextInt();
		}

		return valor;
	}

	public static int leerCantidadBillete(String texto) {
		int valor;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		valor = scan.nextInt();

		return valor;
	}
	
	public static void mostrarMontoTotal (int contB10, int contB20, int contB50, int contB100) {
		
		System.out.println(contB10*10+ contB20*20+ contB50*50+ contB100*100);
	}
	
	public static int mostrarMax(int contB10, int contB20, int contB50, int contB100) {
		int max = 0;
		if (contB10 > contB20 && contB10 > contB50 && contB10 > contB100) {
			max = contB10;
		} else if (contB20 > contB10 && contB20 > contB50 && contB20 > contB100) {
			max = contB20;
		} else if (contB50 > contB20 && contB50 > contB10 && contB50 > contB100)
			max = contB50;
		else {
			max = contB100;
		}

		return max;
		
	}
	
	public static void mostrarPorcentajeDeBilletes (int totalBilletes, int contadorbilletes) {
		System.out.println(contadorbilletes*100/totalBilletes);
		
	}
	
	
	
}
