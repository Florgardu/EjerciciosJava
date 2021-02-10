package ejercicioFrigorifico;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Empresa miEmpresa= new Empresa();
		
		Calendar calendarCarne = Calendar.getInstance();
		// 1st January 2015
		calendarCarne.set(2015, 0, 31);
        Date fechaElaboracionCarne = calendarCarne.getTime();
        
        
        Calendar calendarLechuga = Calendar.getInstance();
        calendarLechuga.set(2015, 0, 31);
        Date fechaElaboracionLechuga = calendarLechuga.getTime();
        
        Calendar calendarCongelado = Calendar.getInstance();
        calendarCongelado.set(2015, 0, 31);        
        Date fechaElaboracionCongelado = calendarCongelado.getTime();

		Producto carne = new ProductoFresco(fechaElaboracionCarne , "123", "Argentina", 3);
		Producto lechuga = new ProductoRefrigerado(fechaElaboracionLechuga , "123", "Argentina");
		Producto congelado = new ProductoCongelado(fechaElaboracionCongelado , "123", 12d);
		
		
		miEmpresa.addProducto(carne);
		miEmpresa.addProducto(lechuga);
		miEmpresa.addProducto(congelado);
		
		
		

		System.out.println(carne.calcularfechaVencimiento());
		System.out.println(lechuga.calcularfechaVencimiento());
		System.out.println(congelado.calcularfechaVencimiento());
		
	}

}
