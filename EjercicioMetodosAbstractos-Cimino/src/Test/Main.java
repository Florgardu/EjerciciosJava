package Test;

import clases.Empresa;
import clases.PersonalComision;
import clases.PersonalFijo;
import clases.Personal;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creo 4 empleados
		
	/*	        Javier Gómez, DNI: 569587A, desde 2008, salario básico = $13000.
				Eva Nieto, DNI: 695235B, desde 2010, 179 clientes captados a $80 cada uno.
				José Ruiz, DNI: 741258C, desde 2012, 81 clientes captados a $86 cada uno.
				María Núñez, DNI: 896325D, desde 2013, salario básico = $11500.
		
		*/
		
		
		PersonalFijo personal1 = new PersonalFijo("569587A", "Javier", "Gomez", 2008, 13000);
		PersonalComision personal2= new PersonalComision("695235B", "Eva", "Nieto", 2010, 179, 80);
		PersonalComision personal3= new PersonalComision ("741258C", "José", "Ruiz", 2012, 81, 86);
		PersonalFijo personal4 = new PersonalFijo("896325D", "Maria", "Nunez", 2013, 11500);

		
		// los agrego a la empresa
		
		Empresa miEmpresa= new Empresa();
		miEmpresa.agregarEmpleados(personal1);
		miEmpresa.agregarEmpleados(personal2);
		miEmpresa.agregarEmpleados(personal3);
		miEmpresa.agregarEmpleados(personal4);

		
		// 2. Mostrar en forma de tabla el nombre de cada empleado junto a su salario.
		
		miEmpresa.mostrarSalarioXEmpleado();
		
		//3. Mostrar el monto total que abona la empresa en concepto de salarios.
		
		System.out.println(miEmpresa.calcularTotalSalarios());
		
		//4. Mostrar cuántos empleados a comisión hay.
		
		
		miEmpresa.mostrarEmpleadosAComision();
		
		String[][] tablaEmpleado = miEmpresa.matrizEmpleadoSueldo();
		
		System.out.println("Tabla::");
		for (int i = 0; i < tablaEmpleado.length; i++) {
//			for (int j = 0; j < tablaEmpleado[i].length; j++) {
//				System.out.println(tablaEmpleado[i][j]);
//			}
			
			System.out.print("nombre: " + tablaEmpleado[i][0]);
			System.out.println("\tsaldo: " + tablaEmpleado[i][1]);
		}
		
	}

}
