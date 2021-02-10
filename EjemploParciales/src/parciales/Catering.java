package parciales;

import java.util.Scanner;

public class Catering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int precioMenuClasico = 300;
		final int precioMenuCeliaco = 310;
		final int precioMenuKosher = 430;
		final int precioMenuLight = 290;
		final int precioBebidas = 30;
		String respuestaComenzar;
		int cantidadInvitados;
		String tipoMenu;
		final String VALOR_CORTE = "fin";
		int cantidadInvitadosPorMenu;
		int acumuladorInvitadosClasico = 0;
		int acumuladorInvitadosCealico = 0;
		int acumuladorInvitadosKosher = 0;
		int acumuladorInvitadosLight = 0;
		int acumuladorPlatosTotales = 0;
		int costoTotalBebida;
		int costoTotalComida;
		int costoTotal;

		respuestaComenzar = leerValidarRespuesta(
				"Bienvenido! ¿Desea calcular el precio total del catering para su fiesta?");
		cantidadInvitados = leerValidarCantidadInvitados("Ingrese cantidad invitados");
		tipoMenu = leerValidarTipoMenu("Ingrese el tipo de menú clásico/celiaco/kosher/light. Fin para finalizar",
				VALOR_CORTE);
		while (!tipoMenu.equals(VALOR_CORTE)) {
			cantidadInvitadosPorMenu = leerValidarCantidadInvitadosPorMenu(
					"Ingrese cantidad de invitados que eligeron este menu", acumuladorPlatosTotales, cantidadInvitados);
			
			acumuladorPlatosTotales = acumuladorPlatosTotales + cantidadInvitadosPorMenu;

			switch (tipoMenu) {
			case "clasico":
				acumuladorInvitadosClasico = acumuladorInvitadosClasico + cantidadInvitadosPorMenu;
				break;
			case "celiaco":
				acumuladorInvitadosCealico = acumuladorInvitadosCealico + cantidadInvitadosPorMenu;
				break;
			case "kosher":
				acumuladorInvitadosKosher = acumuladorInvitadosKosher + cantidadInvitadosPorMenu;
				break;
			case "light":
				acumuladorInvitadosLight = acumuladorInvitadosLight + cantidadInvitadosPorMenu;
				break;
			default:
				break;
				
			}

			tipoMenu = leerValidarTipoMenu("Ingrese el tipo de menú clásico/celiaco/kosher/light. Fin para finalizar",
					VALOR_CORTE);

		}

		System.out.println("Usted ha invitado" + cantidadInvitados);
		System.out.println("Clásico" + acumuladorInvitadosClasico);
		System.out.println("Celiaco" + acumuladorInvitadosCealico);
		System.out.println("Kosher" + acumuladorInvitadosKosher);
		System.out.println("Light" + acumuladorInvitadosLight);

		costoTotalComida = CalcularCosto(precioMenuClasico, precioMenuCeliaco, precioMenuKosher, precioMenuLight,
				acumuladorInvitadosClasico, acumuladorInvitadosCealico, acumuladorInvitadosKosher,
				acumuladorInvitadosLight);

		System.out.println("El costo total de la comida es" + costoTotalComida + "pesos");
		costoTotalBebida= cantidadInvitados*precioBebidas;
		System.out.println("El costo de la bebida es "+ costoTotalBebida + "pesos" );
		costoTotal=costoTotalComida+costoTotalBebida; 
		System.out.println("El total a pagar es " + costoTotal+  " pesos");
		
		
	}

	public static String leerValidarTipoMenu(String texto, String valorCorte) {
		String tipomenu;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		tipomenu = scan.next();

		while (!tipomenu.equals("clasico") && !tipomenu.equals("celiaco") && !tipomenu.equals("kosher")
				&& !tipomenu.equals("light") && !tipomenu.equals(valorCorte)) {
			System.out.println("Error" + texto);
			tipomenu = scan.next();
		}

		return tipomenu;
	}

	public static String leerValidarRespuesta(String texto) {
		String respuesta;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		respuesta = scan.next();
		while (!respuesta.equals("si")) {
			System.out.println("Error" + texto);
			respuesta = scan.next();
		}
		return respuesta;
	}

	public static int leerValidarCantidadInvitados(String texto) {
		int cantidadInvitados;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		cantidadInvitados = scan.nextInt();
		while (cantidadInvitados <= 0) {
			System.out.println("Error ingrese cantidad superior a cero");
			cantidadInvitados = scan.nextInt();

		}
		return cantidadInvitados;
	}

	public static int leerValidarCantidadInvitadosPorMenu(String texto, int acumuladorActualPlatosTotales, int cantidadInvitados) {
		int cantidadInvitadosMenu;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		cantidadInvitadosMenu = scan.nextInt();
		
		while ((acumuladorActualPlatosTotales + cantidadInvitadosMenu) > cantidadInvitados) {
			System.out.println("Error. Ha ingresado más cantidad de platos que de invitados, ingrese de nuevo");
			cantidadInvitadosMenu = scan.nextInt();
		} 		
		
		return cantidadInvitadosMenu;
	}

	public static int CalcularCosto(int precioMenuClasico, int precioMenuCeliaco, int precioMenuKosher,
			int precioMenuLight, int acumuladorInvitadosClasico, int acumuladorInvitadosCealico,
			int acumuladorInvitadosKosher, int acumuladorInvitadosLigh) {
		int costoTotalComida;

		costoTotalComida = (precioMenuClasico * acumuladorInvitadosClasico)
				+ (precioMenuCeliaco * acumuladorInvitadosCealico) + (precioMenuKosher * acumuladorInvitadosKosher)
				+ (precioMenuLight * acumuladorInvitadosLigh);
		return costoTotalComida;
	}

}
