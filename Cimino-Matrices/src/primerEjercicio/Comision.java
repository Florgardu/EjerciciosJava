package primerEjercicio;

import java.lang.reflect.Array;

public class Comision {

	private Alumno[] alumnosEnClase = new Alumno[9];

	private String codigo;

	private char[][] presentismo = 
			{ { 'P', 'P', 'P', 'P', 'P', 'P', 'T', 'P', 'P', 'P', 'P', 'P' },
			{ 'A', 'P', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'T', 'P' },
			{ 'T', 'P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
			{ 'P', 'P', 'T', 'T', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
			{ 'T', 'P', 'T', 'P', 'P', 'A', 'P', 'P', 'A', 'P', 'P', 'A' },
			{ 'P', 'P', 'P', 'P', 'T', 'T', 'P', 'P', 'P', 'P', 'A', 'P' },
			{ 'P', 'T', 'A', 'P', 'P', 'P', 'T', 'T', 'A', 'P', 'P', 'A' },
			{ 'P', 'P', 'P', 'P', 'A', 'A', 'T', 'P', 'P', 'P', 'P', 'A' },
			{ 'P', 'P', 'A', 'P', 'A', 'T', 'P', 'P', 'T', 'P', 'P', 'P' } };

	public void llenarListaDeAlumnos() {
		Alumno alumno1 = new Alumno(1, "Alberti", 18);
		this.alumnosEnClase[0] = alumno1;

		Alumno alumno2 = new Alumno(2, "Azcuenaga", 20);
		this.alumnosEnClase[1] = alumno2;

		Alumno alumno3 = new Alumno(3, "Belgrano", 30);
		this.alumnosEnClase[2] = alumno3;

		Alumno alumno4 = new Alumno(4, "Castelli", 25);
		this.alumnosEnClase[3] = alumno4;

		Alumno alumno5 = new Alumno(5, "Larrea", 35);
		this.alumnosEnClase[4] = alumno5;

		Alumno alumno6 = new Alumno(6, "Matheu", 32);
		this.alumnosEnClase[5] = alumno6;

		Alumno alumno7 = new Alumno(7, "Moreno", 33);
		this.alumnosEnClase[6] = alumno7;

		Alumno alumno8 = new Alumno(8, "Paso", 22);
		this.alumnosEnClase[7] = alumno8;

		Alumno alumno9 = new Alumno(9, "Saavedra", 29);
		this.alumnosEnClase[8] = alumno9;

	}

	// Mostrar los apellidos de los alumnos habilitados para rendir final, junto al
	// porcentaje de
	// presentismo de cada uno.

	public void mostrarAlumnosHabilitadosParaRendirFinal() {
		double cantidadAlumnos = this.presentismo.length;
		double porcentajeDeAsistencia;
		double PORCENTAJE_RENDIR_FINAL = 75;

		for (int i = 0; i < cantidadAlumnos; i++) {
			porcentajeDeAsistencia = this.calcularPorcentajeDeAsistencia(i);

			if (porcentajeDeAsistencia >= PORCENTAJE_RENDIR_FINAL) {
				System.out.println(this.alumnosEnClase[i].getApellido() + " " + porcentajeDeAsistencia);
			}
		}

	}

	private double calcularPorcentajeDeAsistencia(int numeroAlumno) {
		double acumulador;
		double porcentajeAsistencia = 0;
		int cantidadDeClases;

		cantidadDeClases = this.presentismo[numeroAlumno].length;
		acumulador = cantidadDeClases;

		for (int i = 0; i < cantidadDeClases; i++) {
			if (this.presentismo[numeroAlumno][i] == 'A') {
				acumulador = acumulador - 1;
			} else {
				if (this.presentismo[numeroAlumno][i] == 'T') {
					acumulador = acumulador - 0.5;
				}
			}
		}

		porcentajeAsistencia = (acumulador / cantidadDeClases) * 100;

		return porcentajeAsistencia;
	}

	// Obtener el promedio de edad de los alumnos inhabilitados para rendir final.

	public double promedioDeEdadDeAlumnosInhabilitados() {
		double promedioEdad = 0;
		int cantidadAlumnos;
		double porcAsistencia;
		int acu = 0;
		int cont = 0;
		double PORCENTAJE_RENDIR_FINAL = 75;

		cantidadAlumnos = this.presentismo.length;
		for (int i = 0; i < cantidadAlumnos; i++) {
			porcAsistencia = this.calcularPorcentajeDeAsistencia(i);
			if (porcAsistencia < PORCENTAJE_RENDIR_FINAL) {
				cont++;
				acu = acu + this.alumnosEnClase[i].getEdad();

			}
		}

		promedioEdad = (acu / cont);

		return promedioEdad;

	}

	// Obtener el número de clases con asistencia perfecta. (Las llegadas tarde
	// cuentan como
	// presente)

	public int cantidadDeClasesConAsistenciaPerfecta() {
		int cantClasesPerf = 0;

		int cantidadClases = this.presentismo[0].length;

		for (int i = 0; i < cantidadClases; i++) {
			if (this.esClaseConAsistenciaPerfecta(i)) {
				cantClasesPerf++;
			}
		}

		return cantClasesPerf;
	}

	private boolean esClaseConAsistenciaPerfecta(int nroClase) {
		boolean esPerfecta = true;
		int a = 0;
		int cantAlumnos;

		cantAlumnos = this.presentismo.length;

		while (esPerfecta && a < cantAlumnos) {

			if (this.presentismo[a][nroClase] == 'A') {
				esPerfecta = false;
			} else {
				a++;
			}

		}
		return esPerfecta;
	}

	// Obtener el número total de llegadas tarde para todo el período de cursada.

	public int totalDeLlegadasTarde() {
		int llegadasTarde = 0;
		int cantidadAlumnos = this.presentismo.length;

		for (int i = 0; i < cantidadAlumnos; i++) {
			for (int j = 0; j < this.presentismo[i].length; j++) {
				if (this.presentismo[i][j] == 'T') {
					llegadasTarde++;
				}
			}
		}

		return llegadasTarde;

	}

	// . Mostrar el listado de porcentaje de presentismo por cada clase. (Las
	// llegadas tarde
	// cuentan como presente).

	public void mostrarClasesConNivelDePresentismo() {
		int totalClases = this.presentismo[0].length;
		double cantidadAlumnos = this.presentismo.length;
		
		double porcentajePresentismo;

		for (int c = 0; c < totalClases; c++) {
			
			double presentes = 0;			
			
			for (int a = 0; a < cantidadAlumnos; a++) {
				char valor = this.presentismo[a][c];
				if (valor == 'P' || valor == 'T') {
					presentes++;
				}
			}

			porcentajePresentismo = (presentes / cantidadAlumnos)*100;
			System.out.println("Clase " + (c + 1) + " el porcentaje de presentes fue " + porcentajePresentismo);

		}

	}

}
