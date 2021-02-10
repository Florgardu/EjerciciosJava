package instituto.ort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	void testBuscarAlumnosPorEncimaDe() {
		
		Alumno miguelo = new Alumno();
		miguelo.setNombre("Miguelo");
		
		Evaluacion evaluacion1 = new Evaluacion(TipoEvaluacion.PRIMER_EXAMEN, 9);
		Evaluacion evaluacion2 = new Evaluacion(TipoEvaluacion.PRIMER_EXAMEN, 9);
		
		miguelo.addEvaluacion(evaluacion1);
		miguelo.addEvaluacion(evaluacion2);
		
		Alumno flor = new Alumno();
		flor.setNombre("Flor");
		
		Evaluacion evaluacion3 = new Evaluacion(TipoEvaluacion.PRIMER_EXAMEN, 10);
		
		flor.addEvaluacion(evaluacion3);
		
		Alumno pedro = new Alumno();
		pedro.setNombre("PEDRO");
		
		Evaluacion evaluacion4 = new Evaluacion(TipoEvaluacion.PRIMER_EXAMEN, 5);
		Evaluacion evaluacion5 = new Evaluacion(TipoEvaluacion.PRIMER_EXAMEN, 6);
		
		
		pedro.addEvaluacion(evaluacion4);
		pedro.addEvaluacion(evaluacion5);	
		
		Curso cursoMate = new Curso("12", "mate", 8);
		cursoMate.addAlumno(miguelo);
		cursoMate.addAlumno(pedro);
		cursoMate.addAlumno(flor);
		
		assertEquals(cursoMate.buscarAlumnosPorEncimaDe(8).size(), 1);
		
		Curso cursoPoo = new Curso("12", "mate", 4);
		cursoPoo.addAlumno(miguelo);
		cursoPoo.addAlumno(pedro);
		cursoPoo.addAlumno(flor);
		
		assertEquals(cursoPoo.buscarAlumnosPorEncimaDe(4).size(), 2);
		
		
		
		
	}

}
