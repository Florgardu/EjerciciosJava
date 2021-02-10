package programa;

import clases.Auto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String miMarca; 
		
		Auto miAuto= new Auto("Rojo", "Super7" , "nafta" , "X7");
		System.out.println(miAuto); //si lo dejo así sin el toString muestra la posición en la memoria, no sabe cómo mostrar los atributos. con el tostring muestra el contenido de esa posicion de memoria
		
		
		Auto gol= new Auto ();  //se da cuenta q es el contructor vacio por los parametros q le paso.
		System.out.println(gol);
		
		
		miAuto.repintar("azul");
		System.out.println(miAuto); 
		
		miMarca=miAuto.getMarca();
		System.out.println("mi marca de auto es: " + miMarca);
		
	}

}
