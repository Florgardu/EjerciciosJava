package test;

import clases.Curso;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// creo un Curso 
		
		Curso miCurso = new Curso("matematica");
		
		
		// Agrego Alumnos 
		
		miCurso.agregarAlumno("319090", "Juan", "Perez");
		miCurso.agregarAlumno("329090", "Pedro", "Juarez");
		miCurso.agregarAlumno("339090", "Andres", "Garcia");
		
		
		// Pruebo Cargar notas 
		
		miCurso.cargarNota("319090", 10);
		miCurso.cargarNota("319090", 10);
		
		miCurso.cargarNota("329090", 2);
		miCurso.cargarNota("329090", 3);
		
		// pruebo método listarPromocionados 
		
		miCurso.listarPromocionados();
		
		

	}

}
