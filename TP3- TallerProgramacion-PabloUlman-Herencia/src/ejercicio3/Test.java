package ejercicio3;

import java.util.Scanner;

public class Test {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creo una tienda
		
		TiendaDeElectrodomesticos tienda= new TiendaDeElectrodomesticos();
		
		// creo productos 
		
		Tv tele1 = new Tv("Philip", "49PGFS", 34, 200, false, 15000, 5);
		Lavarropa lavarropa= new Lavarropa("Whirpool", "X600", 4567665, 150, false, 20000, 1000, "automatico");
		Heladera heladera= new Heladera("Kohinoor", "plus200", 54657676, 100, false, 30000, 300, true);
		Licuadora licuadora = new Licuadora("samsun", "f400", 546565, 150, false, 5000, 200, 5);
		Tv tele2 = new Tv("Samsun", "pro500", 43, 300, false, 30000, 5);

		// cargo productos en tienda
		
		tienda.cargarProductos(tele1);
		tienda.cargarProductos(tele2);
		tienda.cargarProductos(lavarropa);
		tienda.cargarProductos(licuadora);
		tienda.cargarProductos(heladera);
		
		
		tienda.hacerVenta();
 
		
		


		
		
	}

}
