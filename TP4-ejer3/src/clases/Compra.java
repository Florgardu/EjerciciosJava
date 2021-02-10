package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Compra {
	
	
	private ArrayList<ItemCompra> itemsCompra;
	
	
	public Compra () {
		this.itemsCompra= new ArrayList<ItemCompra>();
	}
	
	public ArrayList<ItemCompra> getListaDeProductosComprados() {
		return itemsCompra;
	}
	
	public void nuevaCompra() {
		String valorCorte = "F";

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese nombre del producto");
		String nombreProducto = scan.next();

		while (!valorCorte.equalsIgnoreCase(nombreProducto)) {

			System.out.println("Ingrese cantidad comprada");
			int cantidadComprada = scan.nextInt();
			System.out.println("Ingrese precio");
			double precioUnitario = scan.nextDouble();

			ItemCompra productoComprado = new ItemCompra(nombreProducto, precioUnitario, cantidadComprada);
			itemsCompra.add(productoComprado);

			System.out.println("Ingrese nombre del producto");
			nombreProducto = scan.next();

		}
		scan.close();

	}
	
	
	public double calcularTotal() {
		double sumatoriaTotal = 0;

		for (ItemCompra item : itemsCompra) {
			double subtotal = item.getPrecioUnitario() * item.getCantidadComprada();
			sumatoriaTotal = sumatoriaTotal + subtotal;
		}
		return sumatoriaTotal;
	}
	

}
