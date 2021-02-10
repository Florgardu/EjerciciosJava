package ejercicioCosechas;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// creo una empresa
		
		EmpresaAgricola e= new EmpresaAgricola("Pollo Hermanos");
		e.cargarResultados();
		e.procesarResultados();
		
		e.mostrarArray();
		
		e.mostrarResultados();
		
		System.out.println(e.buscarCosecha(3));
		
		String cosechaMax= e.obtenerCosechaConMasKilos();
		System.out.println(cosechaMax);
		
		System.out.println(e.obtenerCosechaConMasAltura());
		
	}

}
