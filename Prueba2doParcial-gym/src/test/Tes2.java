package test;

import java.util.Scanner;

import clases.Categoria;
import clases.Gym;
import clases.Socio;

public class Tes2 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo un gym

		Gym nuevoGym = new Gym("Megatlon");

		String opcion = menuIngreso();

		boolean debeSalir = false;

		while (!debeSalir) {
			switch (opcion.toUpperCase()) {
			case "A":
				if (inscribirSocio(nuevoGym)) {
					debeSalir = true;
				} else {
					opcion = menuIngreso();
				}

				break;

			case "B":
				eliminarSocio(nuevoGym);
				opcion = menuIngreso();
				break;

			case "C":
				buscarDeudores(nuevoGym);
				opcion = menuIngreso();
				break;

			case "D":
				ponerMoroso(nuevoGym);
				opcion = menuIngreso();
				break;

			case "E":
				agregarDeuda(nuevoGym);
				opcion = menuIngreso();
				break;

			default:
				System.out.println("Ingrese una opción valida");
				opcion = menuIngreso();
				break;

			}

		}
	}

	public static void ponerMoroso(Gym gim) {
		String dni;
		dni = leerTexto("Ingrese dni a poner moroso");

		gim.ponerMoroso(dni);

	}

	public static void agregarDeuda(Gym gimnasio) {
		String dni;
		Socio socio;

		dni = leerTexto("Ingrese dni de socio a agregar deuda");

		socio = gimnasio.buscarSocio(dni);
		if (socio != null) {
			int deuda = leerNumero("Ingrese deuda a agregar");
			socio.setDeuda(deuda);

		}

	}

	public static void buscarDeudores(Gym gimnasio) {
		int montoDeuda;
		Categoria tipoCategoria;

		montoDeuda = leerNumero("Ingrese el monto de deuda a buscar");
		String textoIngresado = leerTexto("Ingrese la categoria: numero1, numero2, o numero3");
		// construyo Enum a partir del String
		tipoCategoria = Categoria.valueOf(textoIngresado);

		gimnasio.listarDeudores(montoDeuda, tipoCategoria);

	}

	public static boolean inscribirSocio(Gym gimnasio) {
		String dni;
		String nombre;
		boolean salir = false;

		dni = leerTexto("ingrese dni del socio, o 0 para terminar");
		if (dni.equals("0")) {
			salir = true;
		} else {
			nombre = leerTexto("Ingrese nombre del socio");
			gimnasio.inscribirSocio(dni, nombre);
		}

		return salir;

	}

	public static void eliminarSocio(Gym gimnasio) {
		String dni;

		dni = leerTexto("Ingrese dni del socio que quiere borrar");
		gimnasio.quitarSocio(dni);

	}

	public static String menuIngreso() {
		String dato;
		dato = leerTexto(
				"Ingrese A para inscribir socio, B para quitar socio, C para listar deudores, D para poner moroso o E para agregar deuda");
		return dato;
	}

	public static String leerTexto(String texto) {
		String dato;
		System.out.println(texto);
		dato = scan.next();
		return dato;
	}

	public static int leerNumero(String texto) {
		int dato;
		System.out.println(texto);
		dato = scan.nextInt();
		return dato;
	}

}
