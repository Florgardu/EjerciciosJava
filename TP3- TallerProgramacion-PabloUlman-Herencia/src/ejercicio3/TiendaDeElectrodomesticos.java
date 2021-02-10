package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendaDeElectrodomesticos {
	public static Scanner scan = new Scanner(System.in);

	private ArrayList<Electrodomestico> productos;

	public TiendaDeElectrodomesticos() {
		this.productos = new ArrayList<Electrodomestico>();
	}

	public void cargarProductos(Electrodomestico elec) {
		this.productos.add(elec);
	}

	public void hacerVenta() {
		ArrayList<Electrodomestico> nuevaVenta = new ArrayList();
		double ticketTotalVenta = 0;
		int respuesta = 1;
		int contador = 0;

		while (contador < this.productos.size() && (respuesta == 1) || (respuesta == -1)) {
			Electrodomestico e = this.productos.get(contador);
			System.out.println("Electrodomestico disponible: " + e.getClass().getSimpleName() + " " + e.getMarca()
					+ " modelo " + e.getModelo());
			respuesta = leerYValidarTexto(
					"Pulse 1 para agregar producto a sus compra, Pulse -1 para ver siguiente producto pero no terminar o Pulse 0 para terminar y ver total");
			if (respuesta == 1) {
				nuevaVenta.add(e);
			}

			if (respuesta == 0) {
				System.out.println("Ticket de venta : ");
				mostrarYCalcularTotal(nuevaVenta);
			}
			contador++;
		}
	}

	private void mostrarYCalcularTotal(ArrayList<Electrodomestico> nuevaVenta) {
		double totalPagar = 0;
		if (nuevaVenta.size() > 0) {
			for (Electrodomestico electrodomestico : nuevaVenta) {
				totalPagar = totalPagar + electrodomestico.getPrecio();
				System.out.println(electrodomestico.toString());

			}
			System.out.println("Total : $" + totalPagar);
		}

	}

	private int leerYValidarTexto(String texto) {
		int dato;
		System.out.println(texto);
		dato = scan.nextInt();

		while (dato != 0 && dato != 1 && dato != -1) {
			System.out.println("Error, ingrese 1 para agregar y 9 para terminar");
			dato = scan.nextInt();
		}
		return dato;

	}

}
