package tpn1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Realizá un programa que resuelva el siguiente problema:
Deberás solicitar el ingreso de una fecha de compra (String en el siguiente formato: YYYYMMDD),
 un nombre de comprador, un nombre de producto y una cantidad y precio del producto comprado. 
 Mostrá a modo de ticket, la información ingresada y el monto a pagar.
Modelo de Ticket:
Fecha de Compra: YYYYMMDD Nombre del Comprador: xxxxx xxxxx Producto solicitado: xxxxx
Cantidad solicitada: xx
Precio Unitario: $xxx
Total a Pagar: $xxxxx
	
		*
		*
		*/
		Scanner scan = new Scanner(System.in);
     	String fechaDeCompra; 
		String nombreComprador;
		String nombreProducto;
		int cantidadComprada;
		int precioProductoComprado;
		System.out.println("Ingrese fecha de compra YYYYMMDD");
		fechaDeCompra= scan.nextLine();
		System.out.println("Ingrese nombre de comprador");
		nombreComprador=scan.nextLine();
		System.out.println("Ingrese nombre del producto comprado");
		nombreProducto= scan.nextLine();
		System.out.println("Ingrese cantidad comprada");
		cantidadComprada= scan.nextInt();
		System.out.println("Ingrese precio del producto");
		precioProductoComprado=scan.nextInt();
		
		int TotalPagar;
		TotalPagar= precioProductoComprado*cantidadComprada; 
		
		System.out.println
		("Fecha de Compra: "+  fechaDeCompra +  "Nombre del Comprador: " + nombreComprador);
		System.out.println("Producto comprado "+ nombreProducto+ " precio unitario del producto " + precioProductoComprado + "cantidad comprada " + cantidadComprada );
	    System.out.println("Total a pagar" + TotalPagar);

	
	
		scan.close();

	
}	

}
