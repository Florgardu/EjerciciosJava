package curso2;
import java.util.Scanner;

public class ClasePadre {

	protected int valor1;
	protected int valor2;
	protected int resultado;

	
	
	//pedimos valores a usuario
	Scanner entrada= new Scanner (System.in);
	
	public void pedirDatos () {
		System.out.print("Ingrese valor 1");
		this.valor1= entrada.nextInt(); 
		
		System.out.print("Ingrese valor 2");
		this.valor2= entrada.nextInt(); 
		
	}
	
	//este metodo muestra los resultados
	
	public void mostrarResultados () {
		System.out.println(resultado);
		
	}

	@Override
	public String toString() {
		return "ClasePadre [valor1=" + valor1 + ", valor2=" + valor2 + ", resultado=" + resultado + ", entrada="
				+ entrada + "]";
	}
}



