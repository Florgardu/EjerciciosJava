package ejercicio8;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gato tom= new Gato(250);
		Raton jerry=new Raton(100);
		
	

		System.out.println(tom.alcanzar(jerry, 100));
		System.out.println(tom);
		
		// otra opción para visualizar respuesta: 
		
		// boolean alcanzo=false;
		
	//	alcanzo=tom.alcanzar(jerry, 100);
		
 
//		if (alcanzo) {
		//	System.out.println("lo alcanzo");
//			
//		} else {
//			System.out.println("no pudo");
	//	} 
		
		
	}

}
