package ejercicio3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Email miMail = new Email("florencia@gmail.com");
	
	System.out.println(miMail);
	
	System.out.println(miMail.getValor());
	
	
	NumTel telDeMessi = new NumTel(1414, 333, 444, TipoDeLinea.CELULAR);
	NumTel telDeMessi2 = new NumTel(555, 1111, 022, TipoDeLinea.FIJO);

	
	
	telDeMessi.getValor();
	
	System.out.println(telDeMessi.getValor());
	
	
	Persona p = new Persona("Lionel", "Messi");
	
	p.agregarEmail("lio@messi.com");
	
	// la relacion entre persona y telefono es de agregacion, por eso recibe un objeto numTel
	
	p.agregarTel(telDeMessi);
	p.agregarTel(telDeMessi2);
	
	p.mostrarTodo();
	
	// ejercicio 2
	
	Mascota nuevaMascota =  new Mascota ("Nano", "Perro");
	p.agregarMascota(nuevaMascota);
	
	p.cambiarNombreMascota(nuevaMascota, "Pochi");
	
	p.mostrarTodo();
	
	
	// ejercicio 3 
	
	Persona p2= new Persona("Antonella", "Coluchi");
	
	// creo un hito 
	
	Hito nacimientoHijo = new Hito("23 de nov", "nacimiento de primer hijo",p2 );
	Hito cumpleaños = new Hito("13 de oct", "cumple de mi tio",p2 );
	
	
	p.agregarHito(nacimientoHijo);
	
	
	
	
	
}
	
}
