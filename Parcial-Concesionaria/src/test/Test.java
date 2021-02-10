package test;
import clases.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona personaInteresada1 = new Persona ("35805837", "23nov1990");
		Persona personaInteresada2 = new Persona ("35111111", "24nov1991");
		Persona personaInteresada3 = new Persona ("32222222", "25nov1992");
		Persona personaInteresada4 = new Persona ("33333333", "26nov1993");
		Persona personaInteresada5 = new Persona ("92081299", "27nov1994");

		Vehiculo vehiculo1 = new Vehiculo (1000000, Marca.FIAT, Tipo.AUTO); 
		Vehiculo vehiculo2 = new Vehiculo (2000000, Marca.PEUGEOT, Tipo.AUTO); 
		Vehiculo vehiculo3 = new Vehiculo (55000000, Marca.CHEVROLET, Tipo.CAMIONETA); 
		Vehiculo vehiculo4 = new Vehiculo (4000000, Marca.FIAT, Tipo.UTILITARIO); 
		
		Concesionaria nuevaConcesionaria = new Concesionaria("Los mejores Autos");
		
		
		nuevaConcesionaria.agregarAutos(vehiculo1);
		nuevaConcesionaria.agregarAutos(vehiculo2);
		nuevaConcesionaria.agregarAutos(vehiculo3);
		nuevaConcesionaria.agregarAutos(vehiculo4);
		
		vehiculo1.agregarPersonaInteresada(personaInteresada1);
		vehiculo2.agregarPersonaInteresada(personaInteresada1);
		vehiculo3.agregarPersonaInteresada(personaInteresada2);
		vehiculo3.agregarPersonaInteresada(personaInteresada3);
		vehiculo4.agregarPersonaInteresada(personaInteresada4);
		
		System.out.println(nuevaConcesionaria.elAutoMasCaro()); // debe devolver vehiculo3
		System.out.println(nuevaConcesionaria.vehiculosMasBaratosQuePromedio()); 
		System.out.println(nuevaConcesionaria.cantidadVehiculosSegunMarca(Marca.FIAT)); // debe dar 2
		System.out.println(vehiculo1.obtenerCliente("35805837"));  // debe dar 23nov1990 persona1
		System.out.println(vehiculo3.obtenerCliente("35805837"));  // debe dar null
		

	}

}
