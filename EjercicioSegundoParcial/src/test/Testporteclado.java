package test;

import java.util.Scanner;

import clases.Cargo;
import clases.Dieta;
import clases.Empleado;
import clases.Empresa;

public class Testporteclado {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scan.useDelimiter(System.lineSeparator());

		
		// creo una empresa

		Empresa empresa = new Empresa();

		// CONFIRMAR INVITADOS

		confirmarInvitados(empresa);

	}

	public static void confirmarInvitados(Empresa miEmpresa) {
		String dni;
		String nombreyApellido;
		Cargo puestoEnEmpresa;
		Dieta preferenciaComida;
		String respuesta;
		String corte = "n";
		String textoPasarAEnum1;
		String textoPasarAEnum2;

		respuesta = leerYValidarTexto("¿quiere confirmar asistencia? Pulse S para sí y N para no");

		while (!respuesta.equalsIgnoreCase(corte)) {
			dni = leerTexto("Ingrese dni");
			nombreyApellido = leerTexto("Ingrese nombre y apellido");
			
			textoPasarAEnum1 = leerTexto("Ingrese puesto en empresa: DESARROLLADOR – TESTER – LIDER – GERENTE");
			puestoEnEmpresa = Cargo.valueOf(textoPasarAEnum1);
			
			textoPasarAEnum2 = leerTexto("Ingrese preferencia comida: NORMAL, VEGANA, VEGETARIANA, KOSHER");
			preferenciaComida = Dieta.valueOf(textoPasarAEnum2);
			
			miEmpresa.confirmarAsistencia(dni, nombreyApellido, puestoEnEmpresa, preferenciaComida);
			respuesta = leerYValidarTexto("¿quiere confirmar asistencia? Pulse S para sí y N para no");

		}

	}

	public static String leerYValidarTexto(String texto) {
		String dato;
		System.out.println(texto);
		dato = scan.next();
		while (!dato.equalsIgnoreCase("S") && !dato.equalsIgnoreCase("N")) {
			System.out.println("Error, ingrese S para sí y N para no");
			dato = scan.next();
		}

		return dato;
	}

	public static String leerTexto(String texto) {
		String dato;
		System.out.println(texto);
		dato = scan.next();
		return dato;
	}

	public static int leerInt(String texto) {
		int dato;
		System.out.println(texto);
		dato = scan.nextInt();
		return dato;
	}

}
