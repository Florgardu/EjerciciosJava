package ejercicio4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calamar c= new Calamar(100);
		Pulpo p = new Pulpo (500);
		Cangrejo ca= new Cangrejo(300);
		
		
		Cuidador cuidador1= new Cuidador("Felipe", 13, 19, 5);
		cuidador1.cargarBaldes(c, ca, p);
		
		
		Delfin delfi= new Delfin("Delfin Flipper", 345, p, cuidador1);
		Orca orca= new Orca("Orca Willy" , 1000, c, cuidador1);
		Lobo lobo= new Lobo("Lobo Marino Rupert", 500, ca, cuidador1);
		
		Habilidad h1= new Habilidad(250, "truco 1");
		delfi.agregarHabilidad(h1);
		
		Habilidad h2= new Habilidad(50, "truco 2");
		orca.agregarHabilidad(h2);
		
		Habilidad h3= new Habilidad(150, "truco 3");
		lobo.agregarHabilidad(h3);
		
		Habilidad h5= new Habilidad(260, "truco 4");
		delfi.agregarHabilidad(h5);
		
		
		Show show = new Show();
		show.agregarAnimalesParaShow(delfi);
		show.agregarAnimalesParaShow(orca);
		show.agregarAnimalesParaShow(lobo);

		
		cuidador1.mostrarStock();
		
		
		show.hacerTruco();
		
		
		cuidador1.mostrarStock();
		
		
	}

}
