package tpn1;

import java.util.Scanner;

public class Ejercicio13otraforma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * /* Un obrero necesita calcular su salario semanal, el cual se obtiene de la
		 * siguiente manera: • Si trabaja 40 horas o menos se le paga $16 por hora
		 * (crear una constante para almacenar el 16) • Si trabaja más de 40 horas se
		 * le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
		 * (crear una constante para almacenar el 20) Pedir al usuario que ingrese la
		 * cantidad de horas trabajadas en la semana, y mostrar por pantalla el salario
		 * correspondiente.
		 */

		Scanner scan = new Scanner(System.in);
		final int VALOR_HORA = 16;
		final int VALOR_HORA_EXTRA = 20;
		int horasTrabajadas;
		int salarioTotal;
		System.out.println("Ingrese cantidad de horas trabajadas");
		horasTrabajadas = scan.nextInt();

		if (horasTrabajadas <= 40) {
			salarioTotal = VALOR_HORA * horasTrabajadas;

		} else {
			salarioTotal = (40 * VALOR_HORA + (horasTrabajadas - 40) * VALOR_HORA_EXTRA);

		}

		System.out.println("Tu salario total es " + salarioTotal);

		scan.close();
	}

}
