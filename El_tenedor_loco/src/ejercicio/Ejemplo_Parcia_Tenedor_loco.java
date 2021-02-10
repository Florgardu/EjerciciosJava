package ejercicio;
import java.util.Scanner;
public class Ejemplo_Parcia_Tenedor_loco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int COSTO_POR_PLATO=90;
		String tipoPlato;
		double pesoDelPlato;
		String nombre;
		double AcumuladorPesoTotal=0;
		int contadorPlatos=0;
		double acumuladorPesoPA=0;
		double acumuladorPesoVE=0;
		double acumuladorPesoCA=0;
		double acumuladorPesoPO=0;
		final int PESO_LIMITE=4000; // 4000GRAMOS equivalen a 4 kilos
		double porcentajeIngeridoPA;
		double porcentajeIngeridoVE;
		double porcentajeIngeridoCA;
		double porcentajeIngeridoPO;
		double precioTotalAPagar;
		final int LIMITE_PLATOS=10;
		String nombreProductoElegido;


		nombre=leerNombre ("Bienvenido. Ingrese su nombre");

		while (AcumuladorPesoTotal<PESO_LIMITE && contadorPlatos<LIMITE_PLATOS) {
	
			tipoPlato= leerValidarTipoPlato ("Ingrese plato elegido PA, VE, CA, PO");
			
			pesoDelPlato=calculaPeso (tipoPlato);
			contadorPlatos++;
			switch (tipoPlato) {
			case "PA":
				acumuladorPesoPA=acumuladorPesoPA+pesoDelPlato;
				break;
			case "VE":
				acumuladorPesoVE=acumuladorPesoVE+pesoDelPlato;
				break;
			case "CA":
				acumuladorPesoCA=acumuladorPesoCA+pesoDelPlato;
				break;
			case "PO":
				acumuladorPesoPO=acumuladorPesoPO+pesoDelPlato;
				break;
			default:
				break;
			}
			
			AcumuladorPesoTotal= acumuladorPesoPA+acumuladorPesoVE+acumuladorPesoCA+acumuladorPesoPO;
			
			nombreProductoElegido = averiguaElNombre (tipoPlato);
			System.out.println("El plato elegido es " + nombreProductoElegido);
			System.out.println("El peso del plato elegido es "+ pesoDelPlato + "gramos");
			
			
		}
		
		
		System.out.println("Nombre del cliente" + nombre);
		porcentajeIngeridoPA= calcularPorcentaje (AcumuladorPesoTotal,acumuladorPesoPA);
		System.out.println("El porcentaje ingerido de pastas fue " + porcentajeIngeridoPA);
		porcentajeIngeridoVE= calcularPorcentaje (AcumuladorPesoTotal,acumuladorPesoVE);
		System.out.println("El porcentaje ingerido de vegerales fue " + porcentajeIngeridoVE);
		porcentajeIngeridoCA= calcularPorcentaje (AcumuladorPesoTotal,acumuladorPesoCA);
		System.out.println("El porcentaje ingerido de carne fue " + porcentajeIngeridoCA);
		porcentajeIngeridoPO= calcularPorcentaje (AcumuladorPesoTotal,acumuladorPesoPO);
		System.out.println("El porcentaje ingerido de postres fue " + porcentajeIngeridoPO);
		
		precioTotalAPagar= calcularPrecio(contadorPlatos, COSTO_POR_PLATO);
		
		if (porcentajeIngeridoCA>porcentajeIngeridoPA && porcentajeIngeridoCA>porcentajeIngeridoVE && porcentajeIngeridoCA>porcentajeIngeridoPO) {
			precioTotalAPagar= precioTotalAPagar*1.10;
		}
		
		System.out.println("El precio a pagar es " + precioTotalAPagar);
		
	}
	
	
	public static String leerNombre (String texto) {
		String nombre;
		Scanner scan= new Scanner (System.in);
		System.out.println(texto);
		nombre=scan.next();
		return nombre; 
	}

	public static String leerValidarTipoPlato (String texto) {
		String tipoPlato;
		System.out.println(texto);
		Scanner scan= new Scanner (System.in);
		tipoPlato= scan.next();
		while (!tipoPlato.equals("PA") && !tipoPlato.equals("VE")&& !tipoPlato.equals("CA")&& !tipoPlato.equals("PO")) {
			System.out.println("Error "+ texto);
			tipoPlato= scan.next();
		}
		return tipoPlato; 
	}
	
	
	public static double calculaPeso (String TipoPlato) {
		double pesoPlato=0;
		switch (TipoPlato) {
		case "PA":
			pesoPlato=250;
			break;
		case "VE":
			pesoPlato=400;
			break;
		case "CA":
			pesoPlato=350;
			break;
		case "PO":
			pesoPlato=300;
			break;


		default:
			break;
		}
		
		return pesoPlato; 
	}

	
	public static double  calcularPorcentaje (double AcumuladorPesoTotal, double acumuladorPesoPA) {
		double porcentaje;
		porcentaje=(acumuladorPesoPA/AcumuladorPesoTotal)*100;
		return porcentaje;
	}

	public static int calcularPrecio(int contadorPlatos, int COSTO_POR_PLATO) {
		int precioPagar;
		precioPagar=contadorPlatos*COSTO_POR_PLATO;
		return precioPagar; 
	}
	
	public static String  averiguaElNombre (String tipoPlato) {
		String nombre=""; 
		switch (tipoPlato) {
		case "PA":
			nombre="Pastas";
			break;
		case "VE":
			nombre="Vegetales";
			break;
		case "CA":
			nombre="Carnes";
			break;
		case "PO":
			nombre="Postre";
			break;

		default:
			break;
		}
		
		return nombre; 
	}
	
	 
}
