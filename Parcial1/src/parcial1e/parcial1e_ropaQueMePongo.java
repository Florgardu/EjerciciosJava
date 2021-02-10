package parcial1e;

import java.util.Scanner;

public class parcial1e_ropaQueMePongo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroCliente;
		final int VALOR_CORTE=0;
		String articuloAComprar;
		int cantidadAComprar;
		double importeNeto;
		int numeroDeDescuento; 
		final int BASE=1;
		final int TOPE=5;
		double descuentoGanado=0;
		double importeADescontar;
		double acumuladorImportesDescontados=0; 
		double importeFinalAbonarConDescuento;
		double acumuladorTotalFacturado=0;
		double mayorFactura=0;
		double numeroClienteConMayorFacturacion=0; 
		int contadorClientesIngresados=0;
		
		
		numeroCliente= leerNumero ("Ingrese numero de cliente");
		while (numeroCliente!=VALOR_CORTE) {
			articuloAComprar=leerValidarArticulo ("Ingrese articulo A1 para remera, A2 para buzo, A3 para pantalon");
			cantidadAComprar= leerNumero ("Ingrese cantidad a comprar");
			importeNeto= CalculaImporteNeto (articuloAComprar, cantidadAComprar);
			numeroDeDescuento= azar(TOPE,BASE);
			switch (numeroDeDescuento) {
			case 1:
				descuentoGanado=0.10;
				break;
			case 2:
				descuentoGanado=0.20;
				break;
			case 3:
				descuentoGanado=0.30;
				break;
			case 4:
				descuentoGanado=0.40;
				break;
			case 5:
				descuentoGanado=0.50;
				break;
			default:
				break;
			}
			
			importeADescontar= ObtenerDescuentoCompra (importeNeto, descuentoGanado);
			
			acumuladorImportesDescontados= acumuladorImportesDescontados+importeADescontar;
			
			importeFinalAbonarConDescuento= importeNeto-importeADescontar;
			
			if (importeFinalAbonarConDescuento>mayorFactura) {
				mayorFactura=importeFinalAbonarConDescuento;
				numeroClienteConMayorFacturacion=numeroCliente;
			}
			
			acumuladorTotalFacturado=acumuladorTotalFacturado+importeFinalAbonarConDescuento;
			
			contadorClientesIngresados++;
			
			numeroCliente= leerNumero ("Ingrese numero de cliente o 0 (cero) para finalizar");
			
			
			
		}
		
		if (contadorClientesIngresados==0) {
			System.out.println("No se ingresaron cliente");
		} else {
			System.out.println("El total facturado con descuentos incluidos fue " + acumuladorTotalFacturado + " pesos");
			System.out.println("El cliente que más facturo fue el numero " + numeroClienteConMayorFacturacion);
			System.out.println("La suma de dinero que se desconto de todos los clientes fue " + acumuladorImportesDescontados + "pesos");
		}
		
		
	}
	
	public static int leerNumero (String texto) {
		int numero;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		return numero;
	}
	
	
	public static String leerValidarArticulo (String texto) {
		String articulo;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		articulo = scan.next();
		while (!articulo.equals("A1")&&!articulo.equals("A2")&&!articulo.equals("A3")) {
			System.out.println("Error " + texto);
			articulo = scan.next();
		}
		return articulo;
	}
	
	public static double CalculaImporteNeto (String articuloAComprar, int cantidadAComprar) {
		double importeNeto=0;
		double precioRemera=200;
		double precioBuzo=300;
		double precioPantalon=400;
		
		switch (articuloAComprar) {
		case "A1":
			importeNeto= precioRemera*cantidadAComprar;
			break;
		case "A2":
			importeNeto= precioBuzo*cantidadAComprar;
			break;
		case "A3":
			importeNeto= precioPantalon*cantidadAComprar;
			break;
		default:
			break;
		}
		return importeNeto;
	}
	
	
	private static int azar(int tope, int base){
		// GENERA VALORES AL AZAR QUE SERIA LO QUE ELIGE LA MAQUINA
		int result;
		result=(int)((Math.random())*(tope+1-base))+base;
		return result;
		}
	
	public static double ObtenerDescuentoCompra (double importeNeto, double descuentoGanado) {
		double importeADescontar;
		importeADescontar= importeNeto*descuentoGanado;
		return importeADescontar;
	}

}
