package clases;

import java.util.ArrayList;

public class Curso {

	private String materia;
	private ArrayList<Alumno> listaAlumnosDelCurso;

	public Curso(String materia) {
		super();
		this.materia = materia;
		this.listaAlumnosDelCurso = new ArrayList<Alumno>();
	}

	public String getMateria() {
		return materia;
	}

	public ArrayList<Alumno> getListaAlumnosDelCurso() {
		return listaAlumnosDelCurso;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void setListaAlumnosDelCurso(ArrayList<Alumno> listaAlumnosDelCurso) {
		this.listaAlumnosDelCurso = listaAlumnosDelCurso;
	}

	@Override
	public String toString() {
		return "Curso [materia=" + materia + ", listaAlumnosDelCurso=" + listaAlumnosDelCurso + "]";
	}

	private Alumno buscarAlumno(String dniAlumno) {
		int contador = 0;
		Alumno alumnoBuscado = null;
		Alumno alumnoEnLista;

		while (contador < this.listaAlumnosDelCurso.size() && alumnoBuscado == null) {
			alumnoEnLista = listaAlumnosDelCurso.get(contador);
			if (alumnoEnLista.getDni().equals(dniAlumno)) {
				alumnoBuscado = alumnoEnLista;
			} else {
				contador++;
			}
		}

		return alumnoBuscado;
	}

	public void agregarAlumno(String dni, String nombre, String apellido) {
		Alumno alumno;

		alumno = buscarAlumno(dni);
		if (alumno == null) {
			alumno = new Alumno(dni, nombre, apellido);
			this.listaAlumnosDelCurso.add(alumno);
			System.out.println("Se agrego alumno al curso");
		} else {
			System.out.println("No se pudo agregar, el alumno ya existe");
		}

	}

	public void cargarNota(String dni, int nota) {
		Alumno alum;

		alum = buscarAlumno(dni);
		if (alum == null) {
			System.out.println("No se puede cargar la nota, el alumno no existe");
		} else {
			if (alum.isTieneSegundaNota() && alum.isTienePrimerNota()) {
				System.out.println("No se puede cargar, ya tienen las dos notas");
			} else {
				if (alum.isTienePrimerNota()) {
					alum.setNotaSegundoParcial(nota);
				} else {
					alum.setNotaPrimerParcial(nota);
				}
			}

		}

		this.actualizarEstado(dni);
	}

	// hago esta clase solo para probar en el test - ya sé que debería tener un
	// validación.
	public void agregarAlista(Alumno alum) {
		this.listaAlumnosDelCurso.add(alum);
	}

	private int calcularPromedioNotas(int numero1, int numero2) {
		int promedio;
		promedio = (numero1 + numero2) / 2;
		return promedio;
	}

	private void actualizarEstado(String dni) {
		Alumno alum;
		int promedio;

		alum = buscarAlumno(dni);

		if (alum == null) {
			System.out.println("El alumno no existe");
		} else {
			if (alum.isTienePrimerNota() && alum.isTieneSegundaNota()) {
				int primerNota = alum.getNotaPrimerParcial();
				int segundaNota = alum.getNotaSegundoParcial();
				promedio = calcularPromedioNotas(primerNota, segundaNota);
				setearEstadoSegunPromedio(promedio, alum);

			} else {
				alum.setEstado(Estado.RECUPERA);
			}
		}
	}

	
	public void listarPromocionados() {
		for (Alumno alumno : listaAlumnosDelCurso) {
			if (Estado.PROMOCIONADO.equals(alumno.getEstado())) {
				System.out.println("Alumno promocionado" + alumno);
			}
		}
	}

	

	private void setearEstadoSegunPromedio(int promedio, Alumno alum) {

		if (promedio > 7) {
			alum.setEstado(Estado.PROMOCIONADO);

		} else {
			if (promedio < 4) {
				alum.setEstado(Estado.RECUPERA);
			} else {
				alum.setEstado(Estado.FINAL);
			}
		}
	}

}
