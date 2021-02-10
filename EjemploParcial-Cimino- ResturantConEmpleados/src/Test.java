import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo un restaurant
		
		
		Restaurant miResto= new Restaurant();
		
		// creo un convenio
		
		ConvenioSindical convenioRubroCocina= new ConvenioSindical(20, 03);
		
		// creo mozos 
		
		Mozo mozo1= new Mozo("Juan",miResto, 1," 3/1/20" ,convenioRubroCocina, Categoria.AYUDANTE);
		Mozo mozo2= new Mozo("Jose", miResto, 2," 3/2/20" ,convenioRubroCocina, Categoria.METRE);
		Mozo mozo3= new Mozo("Fernando", miResto,  3," 3/3/20" ,convenioRubroCocina, Categoria.MOZOEXTERIOR);
		Mozo mozo4= new Mozo("Andres", miResto,  4," 3/12/19" ,convenioRubroCocina, Categoria.AYUDANTE);
		Mozo mozo5= new Mozo("Marcelo",miResto, 5,"10/1/20" ,convenioRubroCocina, Categoria.MOZOEXTERIOR);

		
		// creo mesas
		
		Mesa mesa1= new Mesa(1, 3);
		Mesa mesa2= new Mesa(2, 6);
		Mesa mesa3= new Mesa(3, 4);
		Mesa mesa4= new Mesa(4, 4);
		Mesa mesa5= new Mesa(5, 2);
		Mesa mesa6= new Mesa(6, 2);

		
		// agrego mesas a restaurant
		
		miResto.cargarMesas(mesa1, 1);
		miResto.cargarMesas(mesa2, 2);
		miResto.cargarMesas(mesa3, 3);
		miResto.cargarMesas(mesa4, 4);
		miResto.cargarMesas(mesa5, 5);
		miResto.cargarMesas(mesa6, 6);

		// agrego mozos
		
		miResto.cargarMozos(mozo1, 1);
		miResto.cargarMozos(mozo2, 2);
		miResto.cargarMozos(mozo3, 3);
		miResto.cargarMozos(mozo4, 4);
		miResto.cargarMozos(mozo5, 5);
		
		
		// creo productos
		
		Plato plato1= new Plato("Carne", 800, "carne al horno", false, false);
		Plato plato2= new Plato("ensalada", 300, "ensalada verde", true, true);
		Plato plato3= new Plato("fideos", 500, "fideos con verduras", false, true);
		Bebida bebida1= new Bebida("coca cola", 50, 500, false);
		Bebida bebida2= new Bebida("vino blanco", 300, 200, true);

		
		
		// creo un menú y lo agrego al resto
		
		Menu menuDelDia= new Menu();
		menuDelDia.agregarProductosDelMenu(plato1);
		menuDelDia.agregarProductosDelMenu(plato2);
		menuDelDia.agregarProductosDelMenu(plato3);
		miResto.agregarMenuDelDia(menuDelDia);
		
		// creo cocineros
		
		Cocinero cocinero1= new Cocinero("Alberto", 121, "3/1", "ttp", 10);
		Cocinero cocinero2= new Cocinero("Andrea", 122, "5/1", "ttp", 5);
		Cocinero cocinero3= new Cocinero("Roberta", 123, "3/2", "ttp", 15);

		
		// genero array de productos pedidos.
		
		
		ArrayList<Producto> pedidoProducto1= new ArrayList();
		pedidoProducto1.add(plato1);
		pedidoProducto1.add(plato2);
		pedidoProducto1.add(bebida2);
		
		ArrayList<Producto>pedidoProducto2= new ArrayList();
		pedidoProducto2.add(plato2);
		pedidoProducto2.add(plato2);
		pedidoProducto2.add(bebida1);

			
		ArrayList<Producto>pedidoProducto3= new ArrayList();	
		
		pedidoProducto3.add(bebida2);
		pedidoProducto3.add(bebida2);
		pedidoProducto3.add(plato3);


		
		ArrayList<Producto>pedidoProducto4= new ArrayList();
		pedidoProducto4.add(bebida2);
		pedidoProducto4.add(plato1);
		
				
		ArrayList<Producto>pedidoProducto5= new ArrayList();
		
		pedidoProducto5.add(plato1);
		pedidoProducto5.add(plato3);
		
	
		// generar Pedidos 
				
		mozo1.generarPedido(mesa2, cocinero1, pedidoProducto1, formaDePago.E);
		mozo1.generarPedido(mesa2, cocinero1, pedidoProducto2, formaDePago.D);
		mozo2.generarPedido(mesa4, cocinero2, pedidoProducto3, formaDePago.C);
		mozo3.generarPedido(mesa5, cocinero2, pedidoProducto4, formaDePago.E);
		mozo4.generarPedido(mesa6, cocinero2, pedidoProducto5, formaDePago.C);
		mozo4.generarPedido(mesa6, cocinero2, pedidoProducto1, formaDePago.C);


		
		miResto.verListaPedidos();

		// pruebo método: pedidos por cocinero  dado el nro de legajo de un cocinero,
		// informe todos los pedidos que tenga a su cargo.
		// pruebo con número de legajo 122 que es cocinero 2 me tiene que decir 3 pedidos
		
		
		miResto.pedidosPorCocinero(122);
		
		// pruebo método calcular importe 
	
		miResto.liberarMesa(2);
		System.out.println(miResto.liberarMesa(2));
		
		
		miResto.verListaPedidos();

		
		// pruebo método informar cantidad de Pedidos
		
		miResto.informarCantPedidos();
	
		
	}

}
