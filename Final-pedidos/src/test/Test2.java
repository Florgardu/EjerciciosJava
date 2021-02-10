package test;

import clases.Empresa;
import clases.Pedido;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// creo una empresa
		
		Empresa miEmpresa = new Empresa("Pedidos S.A");
		
	//	creo pedidos 
		
	Pedido pedido1=	miEmpresa.cargarPedido(1, 22, 10, 300);
	Pedido pedido2=	miEmpresa.cargarPedido(1, 22, 50, 300);
	Pedido pedido3=	miEmpresa.cargarPedido(1, 22, 100, 300);
		
	
	System.out.println(pedido1);
	
	// pruebo cambiar estado pedido 1
	
	miEmpresa.entregar(11, 1);

	System.out.println(pedido1);
	
	System.out.println(pedido1.getClass().getCanonicalName());
	System.out.println(pedido1.getClass().getSimpleName());
	
	}

}
