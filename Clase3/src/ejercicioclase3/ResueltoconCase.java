package ejercicioclase3;
import java.util.Scanner;

public class ResueltoconCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int numeroIngresado;
		System.out.println("Ingrese un numero, le dire que día de la semana es");
		numeroIngresado = scan.nextInt();
		final int DOMINGO=1;
		final int LUNES=2;
		final int MARTES=3;
		final int MIERCOLES=4;
		final int JUEVES=5;
		final int VIERNES=6;
		final int SABADO=7;
		
		// no sirve para todo, para comparar con rangos < > no sirve. Se usa para opciones finitas. cuando hay muchas opciones para comparar no se usa. 
		
		switch (numeroIngresado){ 
		case DOMINGO: //el uno no es la posicion, es el valor con el quiero comparar domingo vale 1. 
			System.out.println("Domingo");
			break;
			
	    case LUNES:
				System.out.println("Lunes");
				break; //solo se usa para case. para la funcion switch. 
				
	    case MARTES:
			System.out.println("Martes");
			break;
			
	    case MIERCOLES:
			System.out.println("Miercoles");
			break;
			
	    case JUEVES:
			System.out.println("Jueves");
			break;
			
	    case VIERNES:
			System.out.println("Viernes");
			break;
			
	    case SABADO:
			System.out.println("Sabado");
			break;
			

	    
	}
		scan.close();
	}

}		
 
