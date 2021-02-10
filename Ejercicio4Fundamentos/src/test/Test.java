package test;

import ejercicio4tp.*; 

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Inmobiliaria inmo = new Inmobiliaria ("ORT Propiedades");
		Barrio barrio1 = new Barrio ("Villa Crespo");
		Barrio barrio2 = new Barrio ("Almagro");

		
		inmo.agregarBarrio(barrio1);
		inmo.agregarBarrio(barrio2);
		
		
		Propiedades p1 = new Propiedades ("Yatay 240", 5000000, "CASA");
		Propiedades p2 = new Propiedades ("Yatay 250", 6000000, "PH");
		Propiedades p3 = new Propiedades ("Yatay 260", 10000000, "DEPTO");
		Propiedades p4 = new Propiedades ("Yatay 1111", 10000000, "DEPTO");
		Propiedades p5 = new Propiedades ("Yatay 333", 10000000, "DEPTO");

		barrio1.agregarPropiedad(p1);
		barrio1.agregarPropiedad(p2);
		barrio1.agregarPropiedad(p3);
		barrio2.agregarPropiedad(p4);
		barrio2.agregarPropiedad(p5);

		System.out.println(inmo);

		inmo.mostrarPropiedades();
		System.out.println(inmo.obtenerBarrioMaxProp());
		
		
		barrio1.mostrarPropiedadesXtipo("CASA");
		
	}

}
