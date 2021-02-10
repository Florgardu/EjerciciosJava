package ejercicioDisqueria;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Disqueria dis= new Disqueria ();
			
		
		Cd cd1 = new Cd("Arjona", 1);
		Cd cd2 = new Cd("los beatles", 1);
		Cd cd3 = new Cd("Laday gaga", 1);
		Cd cd4 = new Cd("pepe", 2);
		Cd cd5 = new Cd("jose", 5);
		Cd cd6 = new Cd("ricky martin", 5);
		Cd cd7 = new Cd("luis miguel", 7);
		
		dis.cargarCd(0, cd1);
		dis.cargarCd(1, cd2);
		dis.cargarCd(2, cd3);
		dis.cargarCd(3, cd4);
		dis.cargarCd(4, cd5);
		dis.cargarCd(5, cd6);
		dis.cargarCd(6, cd7);
		
		
		System.out.println(dis);

		dis.sellosPorCD();
			
		
		
		
	}
	
	
	
	
	

}
