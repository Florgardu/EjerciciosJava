package ejercicio6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// creo una tienda
		
		Tienda libreria= new Tienda();
		
		
		// creo libros
		
		Libro libro1= new Libro("j.k.rowling", "Harry Potter 1", "Salamandra");
		Libro libro2= new Libro("Fernando iglesias", "Es el peronismo", "Maeva");
		Libro libro3= new Libro("j.k.rowling", "Harry Potter 2", "Salamandra");
		Libro libro4= new Libro("j.k.rowling", "Harry Potte 3", "Salamandra");

		
		

		// agrego los libros con su stock tienda 
		
		libreria.agregarLibroConStock(libro1, 2);
		libreria.agregarLibroConStock(libro2, 5);
		libreria.agregarLibroConStock(libro3, 1);
		libreria.agregarLibroConStock(libro4, 3);

		
		// genero clientes 
		
		Cliente cliente1= new Cliente("garduno","35805837", "garduno.flor@gmail.com","acevedo 652");
		Cliente cliente2= new Cliente("perez","31345667", "perez@gmail.com","ibarrola 233");
		Cliente cliente3= new Cliente("garcia","920812899", "garcia.jose@gmail.com","carlos casares 4815");

		
		// genero pedidos desde la web de la libreria
		
		libreria.generarPedido(1, "20/4", libro1, cliente1);
		libreria.generarPedido(2, "20/4", libro1, cliente2);
		libreria.generarPedido(3, "20/4", libro1, cliente3);
		libreria.generarPedido(4, "18/4", libro2, cliente1);

		
		libreria.verPedidoPendientes();
		
		
		// pruebo método , los dos primeros pasan, el tercero no hay más stock, el tercero pasa
		
		libreria.procesarPedidos();
		
		
		// me fijo que en la lista de pendientes solo haya un pedido
		
		
		libreria.verPedidoPendientes();

		
		
		
		
		
		

	}

}
