package instituto.ort;

import java.util.ArrayList;

public class Instituto {
	
	private ArrayList<Curso> cursos;
	
	public Instituto() {
		cursos = new ArrayList<Curso>(); // siempre instanciar la lista en el constructor
	}
	
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	
	public void addCurso(Curso curso) {
		cursos.add(curso);
	}
	
	
	public Curso buscarCurso (String codigo) {
		Curso cursoEncontrado = null;
		
		/* for each
		for (Curso curso : cursos) {
			if(curso.getCodigo().equals(codigo)){
				cursoEncontrado = curso;
			}
		}*/
		
		int indice = 0;
		
		while (cursoEncontrado == null && cursos.size() > indice) {
			Curso curso = cursos.get(indice);
			if(curso.getCodigo().equals(codigo)){
				cursoEncontrado = curso;
			}
			indice++;
		}
		
		
		
		return cursoEncontrado;
		
	}
	
	
}
