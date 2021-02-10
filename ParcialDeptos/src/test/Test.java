package test;

import clases.Departamento;
import clases.Edificio;
import clases.Encargado;
import clases.Propietaria;
import clases.Voto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// creo un encargado
		Encargado encargado1= new Encargado("juan perez");
		
		//creo un edificio
				
		Edificio torresLeParc= new Edificio("juana de arco 123", encargado1);
		
		//creo propietarios
		
		Propietaria vecino1= new Propietaria("flor",  "35805837");
		Propietaria vecino2= new Propietaria("Juan",  "35805833");
		Propietaria vecino3= new Propietaria("Jose",  "33805837");
		Propietaria vecino4= new Propietaria("Alberto","15805837");
		
		// asigno unidades a edificio - debe dar que se agrego exitosamente, crea la unidad si no existe
		
		torresLeParc.agregarUnidad(3, vecino1);
		torresLeParc.agregarUnidad(5, vecino2);
		torresLeParc.agregarUnidad(6, vecino3);
		torresLeParc.agregarUnidad(7, vecino4);
		
		// repito unidades, debe darme que ya existen y no se puede agregar 
		
  Departamento depto6=  torresLeParc.agregarUnidad(6, vecino3);
  Departamento depto5=	torresLeParc.agregarUnidad(5, vecino2);
  Departamento depto3=	torresLeParc.agregarUnidad(3, vecino1);
  Departamento depto7=	torresLeParc.agregarUnidad(7, vecino4);
		
		
		// actualizo votos, el segundo caso debe darme que ya se cambio, no se puede volver a cambiar

		torresLeParc.actualizarVoto(3, Voto.POSITIVO);
		torresLeParc.actualizarVoto(3, Voto.POSITIVO);
		torresLeParc.actualizarVoto(5, Voto.POSITIVO);
		
		
		// listar votos positivos, debe darme el edificio 3 y 5 como voto positivo. El porcentaje debe dar 50%. 
		// debe dar que 2 unidades votaron positivo
		
		torresLeParc.listarVotosPositivos(); 
	

		// mostrar deptos
		
		System.out.println(depto3.getDueño());
		
		
		
	}

}
