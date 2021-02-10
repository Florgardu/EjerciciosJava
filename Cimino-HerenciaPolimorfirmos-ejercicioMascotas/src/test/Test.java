package test;

import java.util.ArrayList;
import java.util.Calendar;

import clases.Gato;
import clases.Loro;
import clases.Mascota;
import clases.Perro;
import clases.Veterinaria;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mascota gatito1 = new Gato ("Michi", "5", 8, "naranja");
		
		Mascota gatito2 = new Gato ("MichiFuz", "5", 8, "naranja");
		
		Mascota loro = new Loro("pepe","32",8, 5);
		
		Mascota perrito1= new Perro ("Pochi", "10", 20, "callejero");
		Mascota perrito2= new Perro ("Pochuto", "10", 20, "callejero");

		Veterinaria vete= new Veterinaria(); 
		
		vete.agregarMascotas(gatito1);
		vete.agregarMascotas(gatito2);
		vete.agregarMascotas(loro);
		vete.agregarMascotas(perrito1);
		vete.agregarMascotas(perrito2);
		
		Perro perrito= (Perro) perrito1;
		perrito.darLaPata();
		vete.saludarCliente();
		int cantidadPerros= vete.cantidadDePerros();
		System.out.println(cantidadPerros);
		
		Calendar cal= Calendar.getInstance();
		int year= cal.get(Calendar.YEAR);
		System.out.println(year);
		
	
		
		
	}

}
