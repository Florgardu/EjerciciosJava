package sueldos;
import java.util.Scanner;

public class Sueldos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombre;
		String categoria;
		int antiguedad;
		final String VALOR_CORTE="fin";
		String categoria_A="A";
		String categoria_B="B";
		String categoria_C="C";
		final int DIAS_MES_TOTAL=30;
		int sueldoBasico;
		int diasDeVacaciones=0; 
		double sueldoDiasTrabajados;
		double sueldoDiasVacaciones;
		int cantidadDiasTrabajados;
		final int DIAS_MES_VACAS=25;
	    double sueldoTotal; 
	    int mayorAntiguedad=0;
	    String empleadoMayorAntiguedad="";
	    int contadorEmpleadosIngresados=0;
		double mayorSueldo=0;
		String nombreDelMayorSueldo="";
		
		nombre= leerNombre ("Ingrese nombre del empleado");
		while (!nombre.equals(VALOR_CORTE)) {
			categoria= leerValidarCategoria ("Ingrese categoria A, B o C",categoria_A, categoria_B, categoria_C );
			antiguedad=leerValidarAntiguedad ("Ingrese antiguedad entre 1 y 50 años");
			sueldoBasico= CalculaSueldoBasico (categoria);
			diasDeVacaciones= calculaDiasVacaciones (antiguedad);
			cantidadDiasTrabajados=DIAS_MES_TOTAL-diasDeVacaciones; 
			sueldoDiasTrabajados= calcularSueldo (sueldoBasico,cantidadDiasTrabajados, DIAS_MES_TOTAL);
			sueldoDiasVacaciones= calcularSueldo (sueldoBasico,diasDeVacaciones, DIAS_MES_VACAS);
			sueldoTotal=sueldoDiasTrabajados+sueldoDiasVacaciones;
			
			
			System.out.println("Empleado" + nombre);
			System.out.println("Sueldo" + sueldoTotal);
			
			contadorEmpleadosIngresados++;
						
			if (antiguedad>mayorAntiguedad) {
				mayorAntiguedad=antiguedad;
				empleadoMayorAntiguedad=nombre;
				
			}
			
			if (sueldoTotal>mayorSueldo) {
				mayorSueldo=sueldoTotal;
				nombreDelMayorSueldo=nombre; 
			} 
			
			nombre= leerNombre ("Ingrese nombre del empleado");

		}
		
		if (contadorEmpleadosIngresados<=0) {
		System.out.println("No se hicieron ingresos");
		}   else {
			System.out.println("El empleado más antiguo es" + empleadoMayorAntiguedad);
			System.out.println("Se ingresaron en total"+ contadorEmpleadosIngresados);
			System.out.println("El empleado con mayor sueldo es" + nombreDelMayorSueldo);
		}
		
		
		
		
	}
	
	
	public static String leerNombre (String texto) {
		String nombre;
		System.out.println(texto);
		Scanner scan= new Scanner (System.in);
		nombre=scan.next();
		return nombre; 
	}

	public static String leerValidarCategoria (String texto,String categoria_A,String categoria_B, String categoria_C) {
		String categoria; 
		System.out.println(texto); 
		Scanner scan= new Scanner (System.in);
		categoria=scan.next();
		while (!categoria.equals(categoria_A)&& !categoria.equals(categoria_B)&& !categoria.equals(categoria_C)) {
			System.out.println("Error "+ texto);
			categoria=scan.next();
		}
		return categoria; 
	}
	
	public static int leerValidarAntiguedad (String texto){
		int antiguedad;
		System.out.println(texto); 
		Scanner scan= new Scanner (System.in);
		antiguedad=scan.nextInt();
		while (antiguedad<1 || antiguedad>50) {
			System.out.println("Error "+ texto);
			antiguedad=scan.nextInt();
		}
		return antiguedad; 
}
	
	public static int CalculaSueldoBasico (String categoria) {
		int sueldoBasico=0;
		switch (categoria) {
		case "A":
			sueldoBasico = 20000;
			break;
		case "B":
			sueldoBasico = 30000;
			break;
		case "C":
			sueldoBasico = 40000;
			break;

		default:
			break;
		}
		return sueldoBasico; 
	}
	
	public static int calculaDiasVacaciones(int antiguedad) {
		int diasVacaciones;

		if (antiguedad > 0 && antiguedad <= 5) {
			diasVacaciones = 14;

		} else {
			if (antiguedad >= 6 && antiguedad <= 10) {
				diasVacaciones = 22;

			} else {
				diasVacaciones = 28;
			}

		}
		return diasVacaciones;
	}
	
	
	public static double calcularSueldo (int sueldoBasico, int cantidadDias, int dias) {
		double sueldo;
		sueldo= ((double)sueldoBasico/dias)*cantidadDias; 
		return sueldo;
	}

	
	
	
}
