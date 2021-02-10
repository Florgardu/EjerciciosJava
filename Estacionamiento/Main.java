package ar.edu.ort.tp1.estacionamiento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estacionamiento e = new Estacionamiento(4, 22);
		
		Estacionamiento e1 = new Estacionamiento(10, 5);
		
		Automovil t = new Automovil(TipoDeAutomovil.Taxi);
		Automovil a = new Automovil(TipoDeAutomovil.Comun);
		
		e1.ocuparEspacio(1, 2, a);
		
		e1.ocuparEspacio(1, 2, a);
		e1.ocuparEspacio(1, 2, t);
		e1.ocuparEspacio(1, 3, t);
		
		System.out.println("Los Disponibles son: " + e1.cantidadDisponible());
		
		
	
	}

}
