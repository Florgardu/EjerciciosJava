package tpn1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En un casino de juegos se desea mostrar los mensajes respectivos por el
		 * puntaje obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a
		 * los siguientes resultados: • Si los tres dados son seis, mostrar el mensaje
		 * “Excelente” • Si dos dados son seis, mostrar el mensaje “Muy bien” • Si un
		 * dado es seis, mostrar el mensaje “Regular” • Si ningún dado se obtiene seis,
		 * mostrar el mensaje “Insuficiente”
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int dado1;
		int dado2;
		int dado3;

		System.out.println("Ingrese valor dado 1");
		dado1 = scan.nextInt();
		System.out.println("Ingrese valor dado 2");
		dado2 = scan.nextInt();
		System.out.println("Ingrese valor dado 3");
		dado3 = scan.nextInt();

		if (dado1 == 6 && dado2 == 6 && dado3 == 6) {
			System.out.println("Excelente");

		} else {
			if ((dado1 == 6 && dado2 == 6) || (dado2 == 6 && dado3 == 6) || (dado1 == 6 && dado3 == 6)) {
				System.out.println("Muy bien");
			} else {
				if (dado1 == 6 || dado2 == 6 || dado3 == 6) {
					System.out.println("Regular");

				} else {
					System.out.println("mensaje insuficiente");

				}
			}
			
		}
		
		scan.close();
	}

}
