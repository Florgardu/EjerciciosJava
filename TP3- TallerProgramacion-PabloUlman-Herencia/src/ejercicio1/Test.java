package ejercicio1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		Crear la clase TP2Test1.java tal que cree dos empleados usando el constructor parametrizado
obligatoriamente :
Un Asalariado de nombre "Jose" edad 30 gana 10000
Un SubContratado de nombre "Carlos" edad 23 quien trabajará 50 horas al mes a un precio de 100 cada una.
• Mostrar la clase, el nombre y el sueldo percibido de cada empleado.
La salida será:
Asalariado Jose gana:10000.0
SubContratado Carlos gana:5000.0 	*/
		
		
		Asalariado empleado1= new Asalariado("Jose", 30, 10000);
		Subcontratado empleado2= new Subcontratado("Carlos", 23, 50, 100);
		
		
		System.out.println("Asalariado " + empleado1.getNombre()+ " gana " + empleado1.calcularPago());
		
		System.out.println("Subcontratado " + empleado2.getNombre()+ " gana " + empleado2.calcularPago());

		

	}

}
