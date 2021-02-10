package ar.com.ort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultadoJuego;

		/* superHeroe1: Nombre: Batman, Fuerza: 90, Resistencia: 70, Superpoderes: 0
		superHeroe2: Nombre: Superman, Fuerza: 95, Resistencia: 60, Superpoderes: 70  */
		
	    Superheroe superHeroe1 = new Superheroe("Batman", 10, 9, 9 );
	    Superheroe superHeroe2 = new Superheroe("Superman", 90, 90, 90 );

		resultadoJuego= superHeroe2.jugar(superHeroe1); 
		
		
		System.out.println(resultadoJuego);
	}

}
