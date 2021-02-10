package sueldos;

import java.util.Scanner;

public class Pedidos_pendientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numeroPedido;
		String nombreCliente;
		String rubroProducto;
		double importeNeto;
		String categoriaCliente;
		final int VALOR_CORTE = 0;
		double descuento; 
		double valorDescuento;
		double importeConDescuento;
		double iva;
		double valorIva;
		double importeTotal;
		int contadorDescuentos=0;
		double importeMenor=999999999;
		String nombreClienteImporteMenor="";
		double pedidosConDescuento=0; 

		numeroPedido = leerNumero("Ingrese numero de pedido");
		while (numeroPedido != VALOR_CORTE) {
			nombreCliente = leerNombre("Ingrese nombre cliente");
			rubroProducto = leerValidarRubro("Ingrese rubro producto FERR, PINT, SANI");
			importeNeto = leerNumero("Ingrese importe neto");
			categoriaCliente = leerValidarCategoria("Ingrese categoria INS, MONO CFIN");
			valorDescuento= descuento (importeNeto, categoriaCliente);
			
			if (valorDescuento>0) {
				contadorDescuentos++;
				pedidosConDescuento=numeroPedido; 
				
			}
			
			if (importeNeto<importeMenor) {
				importeMenor=importeNeto;
				nombreClienteImporteMenor=nombreCliente; 
			}
			
			importeConDescuento= importeNeto-valorDescuento; 
			valorIva= CalcularValorIva (importeConDescuento,rubroProducto );
			importeTotal= (importeNeto-valorDescuento)+valorIva; 
			
			System.out.println(numeroPedido);
			System.out.println(nombreCliente);
			System.out.println(importeTotal);
			
			System.out.println(valorDescuento);
			System.out.println(valorIva);
			
			numeroPedido = leerNumero("Ingrese numero de pedido");

			
		}
		
		System.out.println("Se hicieron esta cantidad de pedidos con descuento:" + contadorDescuentos);
		System.out.println(pedidosConDescuento);
		System.out.println("El importe menor fue del cliente"+ nombreClienteImporteMenor);
		
	}

	public static double leerNumero(String texto) {
		double numero;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		return numero;
	}

	public static String leerNombre(String texto) {
		String nombre;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		nombre = scan.next();
		return nombre;
	}

	public static String leerValidarRubro(String texto) {
		String rubro;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		rubro = scan.next();
		while (!rubro.equals("FERR") && !rubro.equals("PINT") && !rubro.equals("SANI")) {
			System.out.println("Error" + texto);
			rubro = scan.next();
		}

		return rubro;
	}

	public static String leerValidarCategoria(String texto) {
		String categoria;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		categoria = scan.next();
		while (!categoria.equals("MONO") && !categoria.equals("INSC") && !categoria.equals("CFIN")) {
			System.out.println("Error" + texto);
			categoria = scan.next();

		}
		return categoria;

	}
	
	
	public static double descuento (double importeNeto, String categoria) {
		double descuento=0;
		switch (categoria) {
		case "INSC":
			descuento=importeNeto* 0.08;
			break;
		case "MONO":
			descuento=importeNeto* 0.03;
			break;
		case "CFIN":
			descuento=0;
			break;
		default:
			break;
		}
		return descuento;
	}
	
	
	public static double CalcularValorIva (double importeConDescuento , String rubroProducto) {
		double iva=0;
		switch (rubroProducto) {
		case "FERR":
			iva=importeConDescuento*21/100;
			break;
		case "PINT":
			iva=importeConDescuento*10.5/100;
			break;
		case "SANI":
			iva=0;
			break;
		default:
			break;
		}
		return iva;
		
	}
	
	


}
