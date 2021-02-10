package test;

import clases.Producto;
import clases.Sucursal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Producto leche= new Producto("leche", 100); 
		Producto cafe= new Producto("cafe", 50); 
		Producto pan= new Producto("pan", 200); 
		Producto yogurt= new Producto("yogurt", 200); 
		
		Sucursal sucursal1 = new Sucursal(1, "acevedo 652");
		Sucursal sucursal2 = new Sucursal(2, "corriente 1459");

		sucursal1.agregarProductoAlaSucursal(leche);
		sucursal1.agregarProductoAlaSucursal(cafe);
		sucursal2.agregarProductoAlaSucursal(pan);


		
		sucursal1.agregarSucursalCerca(sucursal2);
		
		//pido producto que tiene, debe bajar el stock e imprimir "venta realizada", aumenta contador en 1
		System.out.println(sucursal1.vender(leche, 50));
		System.out.println(leche.getStock());
		
		
		// pido producto que no tiene, pero tiene la sucursal de al lado, imprime nombre sucursal amiga, no descuenta 
		System.out.println(sucursal1.vender(pan, 100));
	
		
		// pido producto que no lo tiene nadie, debe decir que no hay en ningun lado
	    System.out.println(sucursal1.vender(yogurt, 200));

	    //cantidadVendida de yogurth 
	    
	    
	    
	}

}
