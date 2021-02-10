package proyecto;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Concesionario concesionaria = new Concesionario();

		concesionaria.llenarArrayVehiculos();

		concesionaria.getVehiculosDisponibles();

		System.out.println("============================================");

		concesionaria.vehiculoMasCaro();
		concesionaria.vehiculoMasBarato();
		concesionaria.buscarModeloConLetraPedida("Y");

		System.out.println("============================================");

		concesionaria.deMayorAMenorPrecio();

	}

}
