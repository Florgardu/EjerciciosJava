package ejercicio1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int numero = 0;
		try {
		   System.out.println("El numero vale " + numero);
		   System.out.print("Ingrese un número: ");
		   numero = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException nfe) {
		   System.out.println("Hubo un error en la carga del numero: " + nfe.getMessage());
		} finally {
		   System.out.println("El numero ahora vale " + numero);

		
		
		
		}
		
		scanner.close();
		
	}

}
