package test;

import java.util.ArrayList;

import clases.Categoria;
import clases.Gym;
import clases.Socio;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// creo un nuevo gym
		
		Gym gim= new Gym("Megatlon");
		
		// agrego socio que no existen, los crea y los agrega a lista de socios- debe motrar que
		// se crearon exitosamente
		
	Socio socio1=	gim.inscribirSocio("35805837", "Florencia");
	Socio socio2=	gim.inscribirSocio("35805835", "Juan");
	Socio socio3=	gim.inscribirSocio("35805833", "Jose");
	Socio socio4=	gim.inscribirSocio("35805811", "Nir");
		
		// ahora agrego uno repetido, no debe dejarme, debe decir que ya existe
		
		gim.inscribirSocio("35805811", "Nir");
		
		// la lista debe tener 4 socios
		System.out.println(gim.cantidadDeSocios());
		
		
		// le seteo deuda a dos socios 
		
		socio1.setDeuda(100);
		socio2.setDeuda(50);
		
		// poner moroso 
		// al socio 1 y socio 2 los seteo en moroso
		
		gim.ponerMoroso("35805837");
		gim.ponerMoroso("35805835");
		
		
		// deben aparecen con estado moroso 
		System.out.println(socio1);
		System.out.println(socio2);
		

		// deben aparecen con estado normal
		System.out.println(socio3);
		System.out.println(socio4);
		
		
		// otra forma de hacerlo
		// proceso actualizar morosos
		//		ArrayList<Socio> socios = gim.getListaSocios();
		//		for (Socio socio : socios) {
		//			gim.ponerMoroso(socio.getDni());
		//		}
		
		
		// probar método quitar socio
		// no me debe dejar porque tiene deuda
		// no me debe dejar porque no existe
		gim.quitarSocio("35805837");
		gim.quitarSocio("11111");
		
		
		// me deja ok 
		
		gim.quitarSocio("35805811");
		
		// veo que no aparezca en la lista Nir
		
		System.out.println(gim.getListaSocios());
		
		// la lista debe tener uno menos
		
		System.out.println(gim.cantidadDeSocios());
		
		
		// seteo categorias a los socios
		
		socio1.setTipoCategoriaPertenece(Categoria.numero1);
		socio2.setTipoCategoriaPertenece(Categoria.numero2);
		socio3.setTipoCategoriaPertenece(Categoria.numero3);
		
		
		// pruebo método listarDeudoresCategoria 
		// me debe mostrar a socio 1
		gim.listarDeudores(50, Categoria.numero1);
		
		// me debe mostrar a socio 2 
		gim.listarDeudores(30, Categoria.numero2);
		
		// no debe mostrar nada
		
		gim.listarDeudores(30, Categoria.numero3);
		
	}

}
