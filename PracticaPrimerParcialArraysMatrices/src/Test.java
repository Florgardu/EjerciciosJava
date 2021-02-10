
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// creo un instituto
		
		
		Instituto ort = new Instituto();
		
		Comision comision= new Comision(1);
		
		comision.cargarAlumnos();
		
		comision.cargarMatriz();
				
		comision.mostrarApellidoYPorcentajeHabilitados();
		
		System.out.println(comision.promedioEdadInhabilitados());
		
		System.out.println(comision.totalTardes());
		
		comision.mostrarClasesConNivelDePresentismo();
		
		int cantidad= comision.clasesAsistPerfect();
		
		System.out.println(cantidad);
		
	}
	

}
