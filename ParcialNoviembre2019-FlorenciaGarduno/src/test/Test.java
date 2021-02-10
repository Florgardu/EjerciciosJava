package test;

import clases.Instalador;
import clases.InstaladorPremium;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// test pedido 
		
	// creo un instalador 
		
		Instalador miInstalador= new InstaladorPremium(150);
		
		
		// hay lugar en memoria y no existe - se instalan correctamente 
		miInstalador.instalar("Whatsapp", 50, "2019-11-15 15:00:00");
		System.out.println("memoria disponible: 100! ==" + miInstalador.getMemoriaDisponible());
		miInstalador.instalar("Instagram",70, "2019-11-20 12:15:30");
		System.out.println("memoria disponible: 30! ==" + miInstalador.getMemoriaDisponible());
		
		
		// hay lugar en memoria pero ya existe 
		// fecha es menor  debe decir q no se puede por fecha
		
		miInstalador.instalar("Whatsapp", 10, "2019-11-13 15:00:00");
		System.out.println("memoria disponible:  30! ==" + miInstalador.getMemoriaDisponible());
		
		// no hay lugar en memoria 
		// no existe, así q no debe dejar instalar por falta de lugar

	
	miInstalador.instalar("Twitter", 100, "2019-11-13 12:00:00");
	System.out.println("memoria disponible:  30! ==" + miInstalador.getMemoriaDisponible());
	
	// no hay lugar pero la nueva app es menor q la vieja y fecha esta ok- se debe actualizar
	
	miInstalador.instalar("Whatsapp", 10, "2019-11-16 15:00:00");
	System.out.println("memoria disponible: 70!==" + miInstalador.getMemoriaDisponible());
	

	// no hay lugar pero la nueva app es menor q la vieja y fecha esta mal, no debe dejar por fecha

	miInstalador.instalar("Instagram", 20, "2019-10-10 15:00:00");
	System.out.println("memoria disponible: 70!==" + miInstalador.getMemoriaDisponible());

	
	// no hay lugar pero la nueva app es mayor q la vieja, no me debe dejar por falta de lugar de memoria
	
	miInstalador.instalar("Whatsapp", 90, "2019-11-10 15:00:00");
	System.out.println("memoria disponible: 70!==" + miInstalador.getMemoriaDisponible());

		
	}

}
