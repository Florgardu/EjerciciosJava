package primerEjercicio;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Comision comision1 = new Comision ();
		
		comision1.llenarListaDeAlumnos();
		
		comision1.mostrarAlumnosHabilitadosParaRendirFinal();

		comision1.promedioDeEdadDeAlumnosInhabilitados();
		
		System.out.println(comision1.promedioDeEdadDeAlumnosInhabilitados());
		
		comision1.cantidadDeClasesConAsistenciaPerfecta();
		
		System.out.println(comision1.cantidadDeClasesConAsistenciaPerfecta());
		
		comision1.totalDeLlegadasTarde();
		
		System.out.println(comision1.totalDeLlegadasTarde());
		
		comision1.mostrarClasesConNivelDePresentismo();
		
		
	}

}
