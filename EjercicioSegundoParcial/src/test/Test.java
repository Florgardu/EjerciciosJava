package test;

import clases.Cargo;
import clases.Dieta;
import clases.Empleado;
import clases.Empresa;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// creo una empresa
		
		Empresa miEmpresa = new Empresa("Findasense");
		
		// agrego empleados a lista asistente fiesta (metodo Confirmar Asistencia)
	
		
		miEmpresa.confirmarAsistencia("35805837", "Florgardu",Cargo.DESARROLLADOR, Dieta.KOSHER);
		miEmpresa.confirmarAsistencia("35805835", "ChinoGarcia",Cargo.LIDER, Dieta.KOSHER);
		miEmpresa.confirmarAsistencia("35805836", "JuanPerez",Cargo.DESARROLLADOR, Dieta.VEGANA);
		miEmpresa.confirmarAsistencia("35805833", "IsabelNunes",Cargo.DESARROLLADOR, Dieta.VEGANA);
		
		// acá debe decir que ya existe en lista 
		miEmpresa.confirmarAsistencia("35805837", "Florgardu",Cargo.DESARROLLADOR, Dieta.NORMAL);

		// debe dar 4 confirmados
		
		System.out.println("Cantidad de confirmados" + miEmpresa.cantidadConfirmadosFiesta());
		
		
		// anular asistencia 
		
		// aca debe borrar a ese dni de la lista. lista debe tener 3 confirmados
		miEmpresa.anularAsistencia("35805837", Dieta.KOSHER);
		System.out.println("Cantidad de confirmados " + miEmpresa.cantidadConfirmadosFiesta());

		// quiero borrar a un empleado que no existe, no me debe dejar 
		miEmpresa.anularAsistencia("99805837", Dieta.KOSHER);

		// cambiar comida
		// no debe dejar porque es la misma comida que eligio
		miEmpresa.cambiarTipoComida("35805833", Dieta.VEGANA);
		// no debe dejar cambiar porque no existe persona en lista
		miEmpresa.cambiarTipoComida("358051113", Dieta.VEGANA);
		
		// cambia con exito la comida
		miEmpresa.cambiarTipoComida("35805833", Dieta.NORMAL);
		// debe cambiar la preferencia de comida de esa persona
		System.out.println(miEmpresa);

		
		// mostrar ListadoConfirmados por comida
		
		// kosher 
		
		miEmpresa.mostrarListadoConfirmados(Dieta.KOSHER);
	
		// normal
		
		miEmpresa.mostrarListadoConfirmados(Dieta.NORMAL);
		
		// vegano
		
		miEmpresa.mostrarListadoConfirmados(Dieta.VEGANA);
		
		// vegetariano
		
		miEmpresa.mostrarListadoConfirmados(Dieta.VEGETARIANA);
		
		
		
		
		
		
	}
}
