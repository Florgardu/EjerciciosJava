package parciales;

import java.util.Scanner;

public class parcialCalcularSueldos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreEmpleado;
		String categoria;
		int antiguedad;
		final String VALOR_CORTE = "FIN";
		double sueldoBasico;
		int diasDeVacaciones;
		final int TOTAL_DIAS_MES = 30;
		int diasTrabajados;
		double sueldoDiasTrabajados = 0;
		double sueldoDiasVacaciones = 0;
		double sueldo;
		double sueldoMax = 0;
		int antMax = 0;
		int contEmpl = 0;
		String nombreSueldoMax="";
		String nombreAntMax="";

		nombreEmpleado = leerNombre("Ingrese nombre del empleado");
		while (!nombreEmpleado.equals(VALOR_CORTE)) {
			categoria = leerCategoriaValida("Ingrese categoria A, B o C");
			antiguedad = leerAntiguedad("Ingrese antiguedad de 1 a 50 años");
			sueldoBasico = PasarSueldoBasico(categoria);
			diasDeVacaciones = PasarDiasDeVacaciones(antiguedad);
			diasTrabajados = PasarDiasTrabajados(diasDeVacaciones, TOTAL_DIAS_MES);
			sueldoDiasTrabajados = CalcularSueldoDiasTrabajados(sueldoBasico, diasTrabajados, TOTAL_DIAS_MES);
			sueldoDiasVacaciones = CalcularSueldoDiasVacaciones(sueldoBasico, diasDeVacaciones);

			System.out.println(nombreEmpleado);
			sueldo = sueldoDiasTrabajados + sueldoDiasVacaciones;
			System.out.println(sueldo);

			sueldoMax = guardarSueldoMax(sueldoMax, sueldo); //mal, no se puede hacer en función
			nombreSueldoMax = nombreEmpleado;

			antMax = guardarAntiguedadMax(antiguedad, antMax); //mal 
			nombreAntMax = nombreEmpleado;

			contEmpl++;

			nombreEmpleado = leerNombre("Ingrese nombre del empleado");
		}
		
		if (contEmpl==0) {
			System.out.println("No se hicieron ingresos");
			
		} else {
			System.out.println("El empleado de mayor sueldo es " + nombreSueldoMax);
			System.out.println("El empleado más antigue es " + nombreAntMax);
			System.out.println("La cantidad de empleados ingresados fueron " + contEmpl);
		}

		

	}

	public static String leerNombre(String texto) {
		String dato;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		dato = scan.next();
		return dato;

	}

	public static String leerCategoriaValida(String texto) {
		String categoria;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		categoria = scan.next();
		while (!categoria.equals("A") && !categoria.equals("B") && !categoria.equals("C")) {
			System.out.println("Error" + texto);
			categoria = scan.next();
		}
		return categoria;

	}

	public static int leerAntiguedad(String texto) {
		int antiguedad;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		antiguedad = scan.nextInt();
		while (antiguedad < 1 || antiguedad > 50) {
			System.out.println("Error" + texto);
			System.out.println(texto);
			antiguedad = scan.nextInt();
		}

		return antiguedad;

	}

	public static int PasarSueldoBasico(String categoria) {
		int sueldoBasico;
		switch (categoria) {
		case "A":
			sueldoBasico = 20000;
		case "B":
			sueldoBasico = 30000;

		default:
			sueldoBasico = 40000;
			break;
		}

		return sueldoBasico;

	}

	public static int PasarDiasDeVacaciones(int antiguedad) {
		int diasVacaciones;
		if (antiguedad > 0 && antiguedad <= 5) {
			diasVacaciones = 14;

		} else {
			if (antiguedad >= 6 && antiguedad <= 10) {
				diasVacaciones = 21;
			}

			else {
				diasVacaciones = 28;
			}
		}

		return diasVacaciones;

	}

	public static int PasarDiasTrabajados(int diasDeVacaciones, int TOTAL_DIAS_MES) {
		int diasTrabajados;

		diasTrabajados = (TOTAL_DIAS_MES - diasDeVacaciones);

		return diasTrabajados;

	}

	public static double CalcularSueldoDiasTrabajados(double sueldoBasico, int diasTrabajados, int TOTAL_DIAS_MES) {
		double sueldoDiasTrabajados;

		sueldoDiasTrabajados = (sueldoBasico / TOTAL_DIAS_MES) * diasTrabajados;

		return sueldoDiasTrabajados;
	}

	public static double CalcularSueldoDiasVacaciones(double sueldoBasico, int diasDeVacaciones) {
		double sueldoDiasVacaciones;

		sueldoDiasVacaciones = (sueldoBasico / 25) * diasDeVacaciones;

		return sueldoDiasVacaciones;

	}

	public static double guardarSueldoMax(double sueldoMax, double sueldo) {

		if (sueldo > sueldoMax) {
			sueldoMax = sueldo;
		}

		return sueldoMax;

	}

	public static int guardarAntiguedadMax(int antiguedad, int antMax) {
		if (antiguedad > antMax) {
			antMax = antiguedad;
		}

		return antMax;
	}

}
