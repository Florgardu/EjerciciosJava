package test;

import clases.Empresa;
import clases.Viaje;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa miEmpresa = new Empresa();

		miEmpresa.llenarListaDeCamiones();
		miEmpresa.llenarListaChoferes();

		// creo viajes

		Viaje viaje1 = new Viaje(0, "A1", 300);
		Viaje viaje2 = new Viaje(0, "A1", 500);
		Viaje viaje3 = new Viaje(0, "A1", 1000);
		Viaje viaje4 = new Viaje(0, "A2", 500);
		Viaje viaje5 = new Viaje(1, "A2", 300);
		Viaje viaje6 = new Viaje(1, "A2", 1000);
		Viaje viaje7 = new Viaje(1, "A2", 300);
		Viaje viaje8 = new Viaje(3, "A3", 500);
		Viaje viaje9 = new Viaje(2, "A4", 600);
		Viaje viaje10 = new Viaje(4, "A1", 300);
		
		
		
		// agrego viajes a la empresa
		
		miEmpresa.agregarViajes(viaje1);
		miEmpresa.agregarViajes(viaje2);
		miEmpresa.agregarViajes(viaje3);
		miEmpresa.agregarViajes(viaje4);
		miEmpresa.agregarViajes(viaje5);
		miEmpresa.agregarViajes(viaje6);
		miEmpresa.agregarViajes(viaje7);
		miEmpresa.agregarViajes(viaje8);
		miEmpresa.agregarViajes(viaje9);
		miEmpresa.agregarViajes(viaje10);

		
		

		// probar método informarCostoPorViaje
		
		miEmpresa.informarCostoViajes();
		
		// probar método informarViajesXChoferCamion
		miEmpresa.informarViajesXChoferCamion();
		
		

	}

}
