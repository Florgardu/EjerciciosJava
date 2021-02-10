package ejercicio6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Crear el objeto, mediante el contructor, en la clase Test con la siguiente informacion
		//"Aeroparque","Miami","01/06/2018",1234, 250.
	//	Asientos ocupados:15 (con setter)
	//	Probar el método reservar con distintos casos para que devuelva true o false.
	//	Idem con el método liberarAsientos. 
		
		
		Vuelo Vuelo1= new Vuelo ("Aeroparque", "Miami" , "01/06/2018", 1234, 250);
		
		System.out.println(Vuelo1);
		Vuelo1.setAsientosOcupados(15);
		
		System.out.println(Vuelo1);
		Vuelo1.reservar(250);
		System.out.println(Vuelo1.reservar(100));
		System.out.println(Vuelo1);
		Vuelo1.liberararAsientos(115);
		System.out.println(Vuelo1.getAsientosOcupados());
		
	}

}
