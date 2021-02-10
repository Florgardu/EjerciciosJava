package ar.edu.ort.tp1.parcial2;

import ar.edu.ort.tp1.parcial2.entidades.Auto;
import ar.edu.ort.tp1.parcial2.entidades.Estacionamiento;
import ar.edu.ort.tp1.parcial2.entidades.Hora;
import ar.edu.ort.tp1.parcial2.entidades.TipoVehiculo;
import ar.edu.ort.tp1.parcial2.entidades.Vehiculo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hora hora1= new Hora(20, 00);
		Hora hora2= new Hora(25, 10);
		
		Vehiculo v1= new Auto("LTC824", hora1, 10);
		try {
			Vehiculo v2= new Auto("LTC824", hora2, 60);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Auto v2= new Auto("LTC825", hora1, 60);

	  System.out.println(v2.calcularImporte(hora2));  
	  
	  Estacionamiento e= new Estacionamiento(2, 2, 60, 30);
	  
    

  

}
	
	
}
