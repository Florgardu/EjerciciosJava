package ar.edu.ort.tp1.unidad2.agregacion;

public class Test {

	public static void main(String[] args) {
		/*
		 * Como la relacion es de agregacion, puedo crear ambos objetos de manera separada,
		 * ninguno depende del otro para su creacion. Pero a diferencia de la asociacion,
		 * existe un dueÒo temporal, en este caso el Auto.
		 */
		Pasajero jose = new Pasajero("Jose", "Perez");
		Auto fordFiesta = new Auto("Ford", "Fiesta");

		/*
		 * Jose se sube al Auto fordFiesta.
		 * A partir de este momento, Jose tiene una agregacion con el Auto.
		 * Mientras dure esta relacion, el Auto es dueÒo de Jose. Es una relacion mas fuerte que la asociacion.
		 * Si bien en este caso no ser√≠a posible, la agregacion permite que muchos objetos compartan la misma 
		 * relacion. Por ejemplo una misma mascota puede tener varios Due√±os.
		 */
		fordFiesta.agregarPasajero(jose);
		fordFiesta.saludarPasajeros();
		
		/*
		 * Jose se baja del Auto.
		 * A partir de este momento, Jose deja de tener una relacion de agregacion con el Auto.
		 * El auto ya no es mas "Due√±o" de Jose.
		 */
		fordFiesta.eliminarPasajero(jose);
	}
}