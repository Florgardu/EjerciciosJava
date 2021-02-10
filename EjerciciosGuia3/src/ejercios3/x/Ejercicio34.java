package ejercios3.x;
import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		/*Desarrollar un algoritmo que, dado un valor N, la computadora calcule e
imprima la suma de los cuadrados de los N primeros números naturales.
Ejemplo: Se ingresa 6, la computadora muestra: 91. (1 + 4 + 9 + 16 + 25 + 36 -> 91)
*/
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese cantidad de números");
		num=scan.nextInt();
		int contador =1;
		int cuadrados=1;
		int sumatoriaCuadrados=0;
		
		while (contador<=num) {
			cuadrados=(contador*contador);
			sumatoriaCuadrados= sumatoriaCuadrados+cuadrados; 
			contador++;
			
		}
		System.out.println(sumatoriaCuadrados);
		scan.close(); 
	}
        
}
