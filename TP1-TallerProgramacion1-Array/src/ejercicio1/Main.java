package ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Grupo grupo1= new Grupo ("Grupo 1");
		
		grupo1.agregarIntegrante("Florencia");
		grupo1.agregarIntegrante("Damian");
		grupo1.agregarIntegrante("Federico");
		grupo1.agregarIntegrante("Juani");
		
		grupo1.buscarIntegrante("Florencia");
		grupo1.buscarIntegrante("Federico");

		grupo1.mostrar();
		
		grupo1.removerIntegrante("Damian");
		
		grupo1.mostrar();
		
		grupo1.removerIntegrante("Damian");
		
		grupo1.mostrar();
		
		grupo1.vaciar();
		
		grupo1.mostrar();

		
	}

}
