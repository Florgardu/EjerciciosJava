package ar.edu.ort.tp1.unidad2.asociacion;

public class Test {

	public static void main(String[] args) {
		/*
		 * Como la relacion es de asociacion, puedo crear ambos objetos de manera separada,
		 * ninguno depende del otro para su creacion. Tampoco existe un dueño.
		 */
		Profesor profesorMatematica = new Profesor("Juan", "Perez", "Matematica");
		Estudiante pedro = new Estudiante("Pedro", "Garcia", "A132");

		/*
		 * Pedro comienza a cursar matematica con el profesor Juan.
		 * A partir de este momento, pedro tiene una relacion de asociacion con Juan.
		 * Pero ni Juan es dueño de Pedro, ni Pedro es dueño de Juan. Es una relacion debil.
		 * Ademas la asociacion permite que muchos objetos compartan la misma relacion.
		 * El profesor de matematica va a estar relacionado con muchos estudiantes.
		 */
		pedro.agregarProfesor(profesorMatematica);
		
		/*
		 * Pedro abandona la cursada de matematica con el profesor Juan.
		 * A partir de este momento, pedro deja de tener una relacion de asociacion con Juan.
		 */
		pedro.eliminarProfesor(profesorMatematica);
	}
}