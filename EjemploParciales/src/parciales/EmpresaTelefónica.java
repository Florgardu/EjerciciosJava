package parciales;

import java.util.Scanner;

public class EmpresaTelefónica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int codigoCliente;
		int duracionLlamada;
		String tipoAbono;
		double importeAcumuladoA = 0;
		double importeAcumuladoB = 0;
		double importeAcumuladoC = 0;
		int llamadaMasLarga=0;
		int contadorLlamadas6min = 0;
		int contadorLlamadas = 0;
		final int VALOR_CORTE = 0;
		double costoLlamada;
		double promedioLlamadas; 

		codigoCliente = leerValidar("Ingrese código del cliente, 5 digitos");
		while (codigoCliente != 0) {
			duracionLlamada = leerValidarDuracion("Ingrese duración de llamada mayor a 0");
			tipoAbono = leerValidarAbono("Ingrese tipo de abono A, B o C");
			costoLlamada = calcularCostoLlamada(duracionLlamada, tipoAbono);

			switch (tipoAbono) {
			case "A":
				importeAcumuladoA = importeAcumuladoA + costoLlamada;
				break;
			case "B":
				importeAcumuladoB = importeAcumuladoC + costoLlamada;

				break;

			case "C":
				importeAcumuladoC = importeAcumuladoC + costoLlamada;

				break;

			default:
				break;
			}

			llamadaMasLarga = buscaLlamadaMasLarga(duracionLlamada);

			if (duracionLlamada < 6) {
				contadorLlamadas6min++;

			}
			contadorLlamadas++;
			codigoCliente = leerValidar(
					"Otro cliente a ingresar? Ingrese código del cliente, 5 digitos o 0 (cero) para terminar");
		}
		
		if (contadorLlamadas<=0) {
			System.out.println("No se ingresaron llamadas");
		}
		else {
			
			System.out.println("Lo acumulado por abono A fue" + importeAcumuladoA);
			System.out.println("Lo acumulado por abono B fue" + importeAcumuladoB);
			System.out.println("Lo acumulado por abono C fue" + importeAcumuladoC);
			System.out.println("La cantidad de minutos de la llamada más larga fue " + llamadaMasLarga+ " minutos");
	        System.out.println("La cantidad de llamadas de menos de 6 min fue " + contadorLlamadas6min);
			
	        promedioLlamadas= CalculaPromedio ( importeAcumuladoA, importeAcumuladoB, importeAcumuladoC, contadorLlamadas);
            
	        System.out.println("El valor promedio de llamadas fue " + promedioLlamadas + "pesos");
			
		}
		
	}

	public static int leerValidar(String texto) {
		int codigo;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		codigo = scan.nextInt();
		while (codigo != 0 && (codigo < 10001 || codigo > 99999)) {
			System.out.println("Error " + texto);
			codigo = scan.nextInt();
		}
		return codigo;

	}

	public static int leerValidarDuracion(String texto) {
		int duracionLlamada;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		duracionLlamada = scan.nextInt();
		while (duracionLlamada < 0) {
			System.out.println("Error " + texto);
			duracionLlamada = scan.nextInt();
		}

		return duracionLlamada;
	}

	public static String leerValidarAbono(String texto) {
		String tipoAbono;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		tipoAbono = scan.next();
		while (!tipoAbono.equals("A") && !tipoAbono.equals("B") && !tipoAbono.equals("C")) {
			System.out.println("Error" + texto);
			tipoAbono = scan.next();

		}
		return tipoAbono;

	}

	public static double calcularCostoLlamada(int duracionLlamada, String tipoAbono) {
		double costoLlamada = 0;
		int valorMinutoA = 2;
		double valorMinutoB = 1.5;
		int valorMinutoC = 1;
		int topeLlamadasB = 5;

		switch (tipoAbono) {
		case "A":
			costoLlamada = valorMinutoA * duracionLlamada;
			break;
		case "B":
			if (duracionLlamada <= topeLlamadasB) {
				costoLlamada = duracionLlamada * valorMinutoA;
			} else {
				costoLlamada = (duracionLlamada * valorMinutoB);
			}
			break;
		case "C":
			if (duracionLlamada < 10) {
				costoLlamada = duracionLlamada * valorMinutoC;

			} else
				costoLlamada = 10;
			break;
		default:
			break;
		}

		return costoLlamada;

	}

	public static int buscaLlamadaMasLarga(int duracionLlamada) {
		int maxLlamada = 0;

		if (duracionLlamada > maxLlamada) {
			maxLlamada = duracionLlamada;
		}
		return maxLlamada;
	}
	
 public static double CalculaPromedio (double importeAcumuladoA, double importeAcumuladoB, double importeAcumuladoC, int contadorLlamadas) {
	 double promedio;
	 promedio= (importeAcumuladoA+importeAcumuladoB+importeAcumuladoC)/contadorLlamadas;
	 return promedio; 
	 
 }
 
 
}
