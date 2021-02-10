package ejercicio1;

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
	
}
	
}
