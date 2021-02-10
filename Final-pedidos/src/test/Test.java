package test;

import java.util.ArrayList;
import java.util.Scanner;

import clases.*;

public class Test {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// genero una empresa

		scan.useDelimiter(System.lineSeparator());
		
		Empresa miEmpresa = new Empresa("Mi empresa");

		agregarPedidos(miEmpresa);

		entregarPedidos(miEmpresa);

		pedidoMasCaro(miEmpresa);

		mostrarPedidoDeArticulo(miEmpresa);

		listarPedidosPendientesEntrega(miEmpresa);

	}

	public static void listarPedidosPendientesEntrega(Empresa miEmpresa) {
		miEmpresa.listarPedidosPendientesEntrega();
	}

	public static void mostrarPedidoDeArticulo(Empresa miEmpresa) {
		int codigo;
		codigo = leerYValidarCodigo("Ingrese codigo del articulo a buscar de 1 al 10");

		miEmpresa.mostrarPedidoDeArticulo(codigo);
	}

	public static void pedidoMasCaro(Empresa miEmpresa) {

		miEmpresa.pedidoMasCaro();
	}

	public static void entregarPedidos(Empresa miEmpresa) {
		int cantidadEntregar;
		int numeroDePedido;

		numeroDePedido = leerInt("Ingrese numero de pedido");
		cantidadEntregar = leerInt("Ingrese cantidad a entregar");

		miEmpresa.entregar(cantidadEntregar, numeroDePedido);
	}

	public static void agregarPedidos(Empresa miEmpresa) {
		int VALOR_CORTE = 0;
		int numeroPedido;
		int codigo;
		int cantidadPedido;
		int importePedido;

		numeroPedido = leerInt("Ingrese numero de pedido o 0 para terminar");

		while (numeroPedido != VALOR_CORTE) {
			codigo = leerYValidarCodigo("Ingrese codigo del articulo de 1 al 10");
			cantidadPedido = leerInt("Ingrese cantidad");
			importePedido = leerInt("Ingrese el importe del pedido");
			miEmpresa.cargarPedido(numeroPedido, codigo, cantidadPedido, importePedido);
			numeroPedido = leerInt("Ingrese numero de pedido o 0 para terminar");

		}

	}

	public static int leerYValidarCodigo(String texto) {
		int dato;
		scan.useDelimiter(System.lineSeparator());
		System.out.println(texto);
		dato = scan.nextInt();
		while (dato < 1 || dato > 10) {
			System.out.println("Error, ingrese del 1 al 10");
			dato = scan.nextInt();
		}

		return dato;

	}

	public static String leerTexto(String texto) {
		String dato;
		System.out.println(texto);
		dato = scan.next();
		return dato;
	}

	public static int leerInt(String texto) {
		int dato;
		System.out.println(texto);
		dato = scan.nextInt();
		return dato;
	}

}
