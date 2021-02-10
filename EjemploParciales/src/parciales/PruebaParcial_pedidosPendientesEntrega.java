package parciales;

import java.util.Scanner;

public class PruebaParcial_pedidosPendientesEntrega {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroPedido;
		String nombreCliente;
		String rubroPedido;
		double importeNeto;
		String categoriaCliente;
		final int VALOR_CORTE = 0;
		double importeTotal;
		double valorDelDescuento;
		double valorIva;
		String rubroValido1="FERR";
		String rubroValido2="PINT";
		String rubroValido3="SANI";
		String categoriaValido1="INSC";
		String categoriaValido2="MONO";
		String categoriaValido3="CFIN";
		int contadorPedidosConDescuento=0; 
		int contTotalPedidos = 0;
		double menorImporte=99999999; 
		String nombreClienteMenorImporte="";
		
		
		numeroPedido= leerNumeroPedido ("Por favor ingrese numero del pedido");
		while (numeroPedido!=VALOR_CORTE) {
			nombreCliente=leerNombre ("Ingrese nombre del cliente");
			rubroPedido= leerValidarString ("Ingrese rubro FERR, PINT O SANI", rubroValido1, rubroValido2, rubroValido3);
			importeNeto=leerImporteNeto ("Ingrese importe neto del producto"); 
			categoriaCliente=leerValidarString ("Ingrese categoria del cliente valida", categoriaValido1, categoriaValido2, categoriaValido3);			
			valorDelDescuento= calcularValorDescuento (categoriaCliente, importeNeto);
			if (valorDelDescuento>0) {
				contadorPedidosConDescuento++; 
			}
			
			valorIva= calcularValorIva (rubroPedido, importeNeto, valorDelDescuento);
			importeTotal= calcularImporteTotal (importeNeto, valorDelDescuento, valorIva);
					
			System.out.println("El numero de pedido ingresado fue " + numeroPedido);
			System.out.println("El nombre del cliente fue " + nombreCliente);
			System.out.println("El importe total a abonar es " + importeTotal);
			
			contTotalPedidos++;
			
			if (importeTotal<menorImporte) {
				menorImporte=importeTotal; 
				nombreClienteMenorImporte= nombreCliente;
			}
			
			numeroPedido= leerNumeroPedido ("Por favor ingrese numero del pedido");


		}
		
		
		if (contTotalPedidos>0) {
			System.out.println("Total pedidos con descuento "+ contadorPedidosConDescuento);
			System.out.println("Total pedidos "+ contTotalPedidos);
			System.out.println("El menor importe fue de " + menorImporte + "de"+ nombreClienteMenorImporte);

		} else {
			System.out.println("No se ingresaron pedidos");
		}
		
	}
	
	

	public static int leerNumeroPedido(String texto) {
		int numeroPedido;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		numeroPedido = scan.nextInt();
		return numeroPedido;

	}

	public static String leerNombre(String texto) {
		String nombre;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		nombre = scan.next();
		return nombre;
	}

	public static String leerValidarString(String texto, String valido1, String valido2, String valido3) {
		String string;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		string = scan.next();
		while (!string.equals(valido1) && !string.equals(valido2) && !string.equals(valido3)) {
			System.out.println("Error " + texto);
			string = scan.next();

		}
		return string;
	}

	public static double leerImporteNeto(String texto) {
		double importe;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		importe = scan.nextDouble();
		return importe;
	}

	public static double calcularValorDescuento(String categoriaCliente, double importeNeto) {
		double valorDescuento;
		double descuentoINSC = 0.08;
		double descuentoMONO = 0.03;
		double descuentoCFIN = 0;

		switch (categoriaCliente) {
		case "INSC":
			valorDescuento = importeNeto * descuentoINSC;
			break;
		case "MONO":
			valorDescuento = importeNeto * descuentoMONO;
			break;
		default:
			valorDescuento = importeNeto * descuentoCFIN;
			break;
		}

		return valorDescuento;
	}
	
	public static double calcularValorIva (String rubroPedido, double importeNeto, double valorDelDescuento) {
	    double valorIva; 
	    double ivaFeer = 21;
	    double ivaPint = 10.5;
	    double ivaSani = 0;
	
	
	    
		switch (rubroPedido) {
		case "FERR":
			valorIva = ( importeNeto-valorDelDescuento)* ivaFeer/100;
			break;
		case "PINT":
			valorIva = ( importeNeto-valorDelDescuento)* ivaPint/100;
			break;
		default:
			valorIva = ( importeNeto-valorDelDescuento)* ivaSani/100;
			break;
		}
	
		return valorIva;
		
	}
    
	
	public static double calcularImporteTotal (double importeNeto, double valorDelDescuento, double valorIva) {
		double importeTotal; 
		
		importeTotal= (importeNeto-valorDelDescuento)+valorIva; 
		return importeTotal; 
	}

}
