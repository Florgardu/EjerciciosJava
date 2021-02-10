package ejercicio2;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vendedor vendedor1= new Vendedor("Pedro", 25,100,200,5);
		
		Vendedor vendedor2= new Vendedor("Maria", 30,100,200,10);

		
		System.out.println("Vendedor 1 " +  vendedor1.getNombre()+ " gana "+  vendedor1.calcularPago());
		
		System.out.println("Vendedor 2 "+ vendedor2.getNombre()+ " gana "+  vendedor2.calcularPago());

	}

}
