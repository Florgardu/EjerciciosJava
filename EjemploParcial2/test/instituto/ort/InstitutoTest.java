package instituto.ort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InstitutoTest {

	@Test
	void testCalcularPromedio() {
		Evaluacion evaluacionMate = new Evaluacion();
		evaluacionMate.setTipoEvaluacion(TipoEvaluacion.PRIMER_EXAMEN);
		evaluacionMate.setNota(7);
		
		Evaluacion evaluacionPoo = new Evaluacion();
		evaluacionPoo.setTipoEvaluacion(TipoEvaluacion.PRIMER_EXAMEN);
		evaluacionPoo.setNota(8);
		
		Evaluacion evaluacionCreatividad = new Evaluacion();
		evaluacionCreatividad.setTipoEvaluacion(TipoEvaluacion.PRIMER_EXAMEN);
		evaluacionCreatividad.setNota(9);
		
		Alumno flor = new Alumno();
		flor.setDni("354435345");
		flor.addEvaluacion(evaluacionCreatividad);
		flor.addEvaluacion(evaluacionMate);
		// flor.addEvaluacion(evaluacionPoo);
		flor.getEvaluaciones().add(evaluacionPoo);
		
		
		assertEquals(flor.calcularPromedio(), 8);
	}
	
	@Test
	void testBuscarCurso() {
		Curso cursoMate = new Curso("12", "mate", 8);
		Curso cursoPoo = new Curso("35", "poo", 8);
		Curso cursoCreatividad = new Curso("18", "creatividad", 2);
		
		Instituto analogicalHouse = new Instituto();
		analogicalHouse.addCurso(cursoCreatividad);
		analogicalHouse.addCurso(cursoPoo);
		analogicalHouse.addCurso(cursoMate);
		
		assertNull(analogicalHouse.buscarCurso("76"));
		assertEquals(analogicalHouse.buscarCurso("12"), cursoMate);
		
	}

}
