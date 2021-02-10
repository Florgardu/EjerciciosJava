package test;

import clases.CuentaBancaria;
import clases.Domicilio;
import clases.Fecha;
import clases.Persona;

// clases.* me trae todas las clases dentro de mi paquete "clases"

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Domicilio miCasa= new Domicilio ("Acevedo", 652, "Villa Crespo");
		Fecha fechaNacimiento = new Fecha (23, 11, 1990);
		Persona titular1 = new Persona ( "35805837" ,"florencia", "garduno", fechaNacimiento, miCasa); 
		System.out.println("El nuevo cliente es " + titular1);
		CuentaBancaria miCuenta = new CuentaBancaria ( "CA", titular1);
		System.out.println("Su cuenta bancaria es"  + miCuenta);
		
		miCuenta.depositar(100);
		System.out.println("Su saldo es "  +  miCuenta.getSaldo());
		
		miCuenta.mostrarInfo();
		miCuenta.extraerMonto(500);
		miCuenta.mostrarInfo();

		
		
		
	}

}
