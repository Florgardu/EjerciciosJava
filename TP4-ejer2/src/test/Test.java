package test;
import ejercicio2.*;
import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		 Cancion cancion1= new Cancion("la cucaracha", 62);
		 Cancion cancion2= new Cancion("let it be", 62);
		 Cancion cancion3= new Cancion("el amor despues del amor", 62);
		 Cancion cancion4= new Cancion("flaca", 62);
		 Cancion cancion5= new Cancion("señorita", 62);
		 Cancion cancion6= new Cancion("shallow", 62);
		 
		 
		 CD miCd = new CD();
		 miCd.agrega(cancion1);;
		 miCd.agrega(cancion2);
		 miCd.agrega(cancion3);
		 miCd.agrega(cancion4);

		 System.out.println(miCd);


		Cancion cancionposicion= miCd.dameCancion(2);
		 System.out.println(cancionposicion);
		 
		System.out.println(miCd.numeroCanciones());
		
		miCd.grabaCancion(2, cancion5);
		miCd.EliminaCancion(3);
		 
		 System.out.println(miCd);

		
	}
	
}



