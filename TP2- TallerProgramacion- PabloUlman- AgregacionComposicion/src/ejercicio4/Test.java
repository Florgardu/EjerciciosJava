package ejercicio4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// creo una vivienda 
		
		Vivienda vivienda = new Vivienda ("Montañese", 1223, 4, "C");
		
		// creo personas
		
		
		Persona mujer = new Persona("Monica", "Gaztambide", 35);
		Persona hombre = new Persona("Arturo", "Roman", 53);

		// los agrego como inquilinos a la vivienda 
		
		vivienda.agregarPersonas(hombre);
		vivienda.agregarPersonas(mujer);

		
		// creo muebles
		
		Mueble mueble1= new Mueble("mesa", "madera", "marron");
		Mueble mueble2= new Mueble("mesada", "marmol", "rojo");
		Mueble mueble3= new Mueble("perchero", "metal", "negro");
		Mueble mueble4= new Mueble("sillon", "cuero", "azul");

		
		// los agrego a la casa
		
		vivienda.agregarMuebles(mueble1);
		vivienda.agregarMuebles(mueble2);
		vivienda.agregarMuebles(mueble3);
		vivienda.agregarMuebles(mueble4);

		
		// mostrar salida de vivienda 
		
		vivienda.mostrarTodo();
		

	}

}
