package test;

import java.util.Scanner;

import clases.Alumno;
import clases.Curso;

public class Test {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo un curso

		Curso miCurso = new Curso("matematica");

		// agrego alumnos a la lista del curso : este seria el método con scanner 

  	agregarAlumno(miCurso);
  	
  	
  	// A PARTIR DE ACÁ HICE TEST MANUALES PARA PROBAR MIS MÉTODOS 
	
		
		// creo alumno para probar que la notas inicializan en 0 apenas se crea el alumno
		
		Alumno alum1= new Alumno("35805837", "Flor", "gardu");
		System.out.println(alum1);
		
		
		miCurso.agregarAlumno("319090", "Juan", "Perez");
		miCurso.agregarAlumno("329090", "Pedro", "Juarez");
		miCurso.agregarAlumno("339090", "Andres", "Garcia");
		
		
		// lo agrego- solo uso este metodo para probar en el test 
		
		miCurso.agregarAlista(alum1);
		
// ACÁ PRUEBO EL MÉTODO CARGAR NOTA: 
		
		// agrego nota, se agrega a primer parcial y cambia a true tienePrimerNota - CAMBIA ESTADO A RECUPERA PORQUE NO TIENE SEGUNDO PARCIAL
		
		miCurso.cargarNota("35805837", 10);
		
		System.out.println(alum1);
		
		// agrego segunda nota- se agrega y cambia a true tieneSegundaNota - CAMBIA EL ESTADO A PROMOCIONADO
		
		miCurso.cargarNota("35805837", 9);
		
		System.out.println(alum1);
		
		// pruebo volver a agregar nota, no debe dejarme 
		
		miCurso.cargarNota("35805837", 9);
		
		System.out.println(alum1);
		
		
		// pruebo el metodo listarPromocionados - Me debe mostrar solo 1 
		
		miCurso.listarPromocionados();

	
		

	}

	public static void agregarAlumno(Curso miCurso) {
		String dni;
		String nombre;
		String apellido;
		String respuesta;
		String CORTE = "N";

		respuesta = leerYValidarTexto("¿quiere agregar alumno? Pulse S para sí y N para no");

		while (!respuesta.equalsIgnoreCase(CORTE)) {

			dni = leerTexto("Ingrese dni del alumno a agregar");
			nombre = leerTexto("ingrese nombre del alumno a agregar");
			apellido = leerTexto("Ingrese apellido del alumno a agregar");

			miCurso.agregarAlumno(dni, nombre, apellido);
			respuesta = leerYValidarTexto("¿quiere agregar alumno? Pulse S para sí y N para no");

		}

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

}
