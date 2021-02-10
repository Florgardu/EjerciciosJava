package test;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Academia;
import clases.Alumno;
import clases.Nivel;

public class TestConTeclado {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crear una academia

		Academia miAcademia = new Academia("ComoSeDice");

		// ingreso alumnos, hasta 0 valor de corte
		ArrayList<Alumno> miLista = ingresarAlumnos(miAcademia);

		// ingresar baja alumno

		darBajaAlumno(miAcademia);

		// probar método cargarPago

		Alumno alum1 = miLista.get(0);
		alum1.setDeuda(1000);

		cargarPago(miAcademia);

		// listar alumnos de nivel determinado
		listarAlumnos(miAcademia);

	}

	public static void cargarPago(Academia miAcademia) {
		String dni;
		int importePago;

		dni = leerTexto("Ingrese dni");
		importePago = leerInt("Ingrese monto a pagar");

		miAcademia.cargarPago(dni, importePago);

	}

	public static void listarAlumnos(Academia miAcademia) {
		Nivel nivelPedido;

		String texto = leerTexto("Ingrese nivel: BAJO, INTERMEDIO O AVANZADO");
		nivelPedido = Nivel.valueOf(texto);
		miAcademia.listarAlumnos(nivelPedido);

	}

	public static ArrayList ingresarAlumnos(Academia miAcademia) {
		String VALOR_CORTE = "0";
		String dni;
		String nombre;
		Nivel nivel;
		Alumno alum = null;
		ArrayList<Alumno> alumnosInscriptos = new ArrayList<Alumno>();

		dni = leerTexto("Ingrese dni o 0 para terminar");

		while (!dni.equals(VALOR_CORTE)) {
			nombre = leerTexto("Ingrese nombre");
			String textoIngresado = leerTexto("Ingrese nivel: BAJO, INTERMEDIO O AVANZADO");
			nivel = Nivel.valueOf(textoIngresado);
			alumnosInscriptos.add(miAcademia.inscribirAlumno(nombre, dni, nivel));
			dni = leerTexto("Ingrese dni o 0 para terminar");

		}
		return alumnosInscriptos;

	}

	public static void darBajaAlumno(Academia miAcademia) {
		String dni;
		dni = leerTexto("Ingrese dni de alumno a dar de baja");

		miAcademia.ingresarBajaAlumno(dni);

	}

	public static String leerTexto(String texto) {
		String dato;
		System.out.println(texto);
		dato = scan.next();
		return dato;
	}

	public static int leerInt(String texto) {
		System.out.println(texto);
		int dato = scan.nextInt();
		return dato;
	}

}
