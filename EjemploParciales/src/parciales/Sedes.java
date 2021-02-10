package parciales;

import java.util.Scanner;

public class Sedes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int contador=0;
	    final int sedes=12;
	    int cantidadSocios;
	    int minSocios=20;
	    int maxSocios=3000;
	    int cantidadVotos;
	    int minVotos=0;
	    String antiguedadSede; 
	    double porcentajeVotos;
	    int contadorSedeHCumplenObjetivo=0;
	    double acumuladorPorcentajeVotosH=0;
	    double acumuladorPorcentajeVotosR=0;
	    double acumuladorPorcentajeVotosN=0;
	    int contadorSedeH=0;
	    int contadorSedeR=0;
	    int contadorSedeN=0;
	    int menorSocios=3001;
	    int cantidadVotosMenorSocios=0;
	    double porcentajePromedio;
	    
	    
	    while (contador<sedes) {
			cantidadSocios=leerValidar("Ingrese cantidad de socios en sede", minSocios, maxSocios);
			cantidadVotos= leerValidar ("Ingrese cantidad de votos", minVotos, cantidadSocios);
			antiguedadSede= leerValidarSede ("Ingrese sede H, R, N");
			
			porcentajeVotos= obtenerPorcentaje (cantidadSocios, cantidadVotos); 
		

			switch (antiguedadSede) {
			case "H":
				if (porcentajeVotos >= 35) {
					contadorSedeHCumplenObjetivo++;
				}

				acumuladorPorcentajeVotosH = acumuladorPorcentajeVotosH + porcentajeVotos;
				contadorSedeH++;
				break;
			case "R":
				acumuladorPorcentajeVotosR = acumuladorPorcentajeVotosR + porcentajeVotos;
				contadorSedeR++;
				break;
			default:
				acumuladorPorcentajeVotosN = acumuladorPorcentajeVotosN + porcentajeVotos;
				contadorSedeN++;

				break;
			}

			if (cantidadSocios<menorSocios) {
				menorSocios=cantidadSocios; 
				cantidadVotosMenorSocios=cantidadVotos;
			}
			
			
			contador++;
		}
		
		System.out.println("Las sedes H que cumplieron el objetivo fueron "+ contadorSedeHCumplenObjetivo );
		System.out.println("La cantidad de votos obtenida en la sede con menor de cantidad de socios fue " + cantidadVotosMenorSocios);
        
		porcentajePromedio= obtenerPromedio (acumuladorPorcentajeVotosH, contadorSedeH);
		System.out.println("El porcentaje promedio de H fue " + porcentajePromedio);
		porcentajePromedio= obtenerPromedio (acumuladorPorcentajeVotosR, contadorSedeR);
		System.out.println("El porcentaje promedio de R fue " + porcentajePromedio);

		porcentajePromedio= obtenerPromedio (acumuladorPorcentajeVotosN, contadorSedeN);
		System.out.println("El porcentaje promedio de N fue " + porcentajePromedio);


}
	
	public static int leerValidar (String texto, int min, int max) {
		int valor; 
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		valor=scan.nextInt();
		while (valor<min || valor>max) {
			System.out.println("Error " + texto);
			valor=scan.nextInt();
		}
		
		return valor; 
	}
	
	
	public static String leerValidarSede (String texto) {
		String tipoSede;
		System.out.println(texto);
		Scanner scan= new Scanner (System.in);
		tipoSede=scan.next();
		while (!tipoSede.equals("H") &&!tipoSede.equals("R") && !tipoSede.equals("N")) {
			System.out.println("Error "+ texto);
			tipoSede=scan.next();
		}
		
		return tipoSede;
	}
	
	
	public static double obtenerPorcentaje (int cantidadSocios, int cantidadVotos) {
		double porcentaje; 
		
		porcentaje= (double)cantidadVotos/cantidadSocios*100; 
		return porcentaje; 
	}
	
	
	public static double obtenerPromedio (double acumuladorPorcentajeVotos,int contadorSede) {
		double promedio;
		
		promedio=acumuladorPorcentajeVotos/contadorSede; 
		
		return promedio; 
	}

	
	
}
