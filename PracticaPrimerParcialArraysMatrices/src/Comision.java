import java.util.ArrayList;
import java.util.Arrays;

public class Comision {

	private int codigo;
	private char[][] presentismo;
	private Alumno[] alumnosEnClase = new Alumno[9];

	public Comision(int codigo) {
		this.codigo = codigo;
	}

	public void cargarMatriz() {
		presentismo = new char[][] { { 'P', 'P', 'P', 'P', 'P', 'P', 'T', 'P', 'P', 'P', 'P', 'P' },
				{ 'A', 'P', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'T', 'P' },
				{ 'T', 'P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
				{ 'P', 'P', 'T', 'T', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
				{ 'T', 'P', 'T', 'P', 'P', 'A', 'P', 'P', 'A', 'P', 'P', 'A' },
				{ 'P', 'P', 'P', 'P', 'T', 'T', 'P', 'P', 'P', 'P', 'A', 'P' },
				{ 'P', 'T', 'A', 'P', 'P', 'P', 'T', 'T', 'A', 'P', 'P', 'A' },
				{ 'P', 'P', 'P', 'P', 'A', 'A', 'T', 'P', 'P', 'P', 'P', 'A' },
				{ 'P', 'P', 'A', 'P', 'A', 'T', 'P', 'P', 'T', 'P', 'P', 'P' } };

	}

	public void cargarAlumnos() {
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
	// presentismo de cada uno

	public void mostrarApellidoYPorcentajeHabilitados() {

		int cantidadAlumnos = this.presentismo.length;
		double porcentajeAsistencia;
		double PORCENTAJE_PEDIDO = 75;

		for (int i = 0; i < cantidadAlumnos; i++) {
			porcentajeAsistencia = calcularPorcentajeAsistencia(i);
			if (porcentajeAsistencia >= PORCENTAJE_PEDIDO) {
				System.out.println(this.alumnosEnClase[i].getApellido() + porcentajeAsistencia + "%");
			}

		}

	}

	private double calcularPorcentajeAsistencia(int alumno) {

		int cantidadClasesCursadas = this.presentismo[alumno].length;
		double acumulador = cantidadClasesCursadas;

		for (int i = 0; i < cantidadClasesCursadas; i++) {
			switch (this.presentismo[alumno][i]) {
			case 'A':
				acumulador = acumulador - 1;
				break;

			case 'T':
				acumulador = acumulador - 0.5;

				break;

			}
		}

		double porcentajeAsistencia = (acumulador / cantidadClasesCursadas) * 100;

		return porcentajeAsistencia;
	}

	public double promedioEdadInhabilitados() {
		double promedioEdad = 0;
		int cantidadAlumnos = this.presentismo.length;
		double PROMEDIO_ESPERADO = 75;
		double porcentajePresente;
		double acumularEdad = 0;
		int contadorInhabilitados = 0;

		for (int i = 0; i < cantidadAlumnos; i++) {
			porcentajePresente = this.calcularPorcentajeAsistencia(i);
			if (porcentajePresente < PROMEDIO_ESPERADO) {
				acumularEdad = acumularEdad + this.alumnosEnClase[i].getEdad();
				contadorInhabilitados++;
			}
		}

		promedioEdad = acumularEdad / contadorInhabilitados;

		return promedioEdad;
	}

	// 3. Obtener el número total de llegadas tarde para todo el período de cursada.

	public int totalTardes() {

		int llegadasTardes = 0;
		int filasAlumnos = this.presentismo.length;

		for (int i = 0; i < filasAlumnos; i++) {
			for (int j = 0; j < this.presentismo[i].length; j++) {
				char estado = this.presentismo[i][j];
				if (estado == 'T') {
					llegadasTardes++;
				}
			}
		}

		return llegadasTardes;

	}

	// Mostrar el listado de porcentaje de presentismo por cada clase. (Las llegadas
	// tarde
	// cuentan como presente).

	public void mostrarClasesConNivelDePresentismo() {

		double cantidadAlumnos = this.presentismo.length;
		int cantidadClases = this.presentismo[0].length;
		double porcentajePresentismo = 0;
		double contadorPresentes = 0;

		for (int i = 0; i < cantidadClases; i++) {
			for (int j = 0; j < cantidadAlumnos; j++) {
				char presentismo = this.presentismo[j][i];
				if (presentismo == 'T' || presentismo == 'P') {
					contadorPresentes++;
				}

			}
			porcentajePresentismo = (contadorPresentes / cantidadAlumnos) * 100;
			System.out.println("Para la clase " + (i + 1) + " " + porcentajePresentismo);
			contadorPresentes = 0;
		}

	}

	// Obtener el número de clases con asistencia perfecta. (Las llegadas tarde
	// cuentan como
	// presente).

	public int clasesAsistPerfect() {

		int clasesConAsistenciaPerfecta = 0;
		int cantidadClases = this.presentismo[0].length;

		for (int i = 0; i < cantidadClases; i++) {
			if (esPerfecta(i)) {
				clasesConAsistenciaPerfecta++;
			}
		}

		return clasesConAsistenciaPerfecta;
	}

	private boolean esPerfecta(int clase) {
		boolean esPerfecta = true;
		int cantidadAlumnos = this.presentismo.length;
		int a = 0;

		while (esPerfecta && a < cantidadAlumnos) {
			if (this.presentismo[a][clase] == 'A') {
				esPerfecta = false;
			} else {
				a++;
			}
		}

		return esPerfecta;

	}

}
