package ort.ar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cafetera cafetera = new Cafetera(1000,300);
		cafetera.servirTaza(100);
		
		Cafetera cafetera2  = new Cafetera(500);
		
		System.out.println(cafetera);
		
		cafetera.servirTaza(100);
		System.out.println(cafetera);
		
		cafetera2.servirTaza(400);
		System.out.println("cafetera2" + cafetera2);
		
		
		cafetera.agregarCafe(300);
		System.out.println(cafetera);
		
		cafetera.agregarCafe(300);
		System.out.println(cafetera);
		
		cafetera.agregarCafe(300);
		System.out.println(cafetera);
		
		cafetera.agregarCafe(300);
		System.out.println(cafetera);

		
	}

}
