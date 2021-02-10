package array;

import java.util.ArrayList;

public class Test {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<String> nombres = new ArrayList();
				
				nombres.add("Ana");
				nombres.add("Luisa");
				nombres.add("Felipe");
				System.out.println(nombres); // [Ana, Luisa, Felipe]
				nombres.add(0,"Juana");  // agrego a Juana en la pos 0
				System.out.println(nombres); // [Juana,Ana, Luisa, Felipe]
				nombres.set(0,"Roberto");  // reemplazo el elemento de la pos 0 por Roberto
				System.out.println(nombres); // [Roberto, Ana, Luisa, Felipe]
				nombres.add(0, "Pablo"); // agrego a Pablo en la pos 0 
				System.out.println(nombres); // [Pablo, Roberto, Ana, Luisa, Felipe]
				nombres.remove(0); // elimino el elemento de la pos 0
				System.out.println(nombres); // [Roberto, Ana, Luisa, Felipe]
				nombres.set(0,"Alfonso"); // reemplazo el elemento de la pos 0 por Alfonso
				System.out.println(nombres); // [Alfonso, Ana, Luisa, Felipe]
				
				for(int i = 0;i<nombres.size();i++){	
					int posi= i+1;
					System.out.println("Posicion Nº: " + posi);
		            System.out.println(nombres.get(i));
				}

				
				
				nombres.remove("Ana"); // elimino el elemento Ana
				System.out.println(nombres); // [Alfonso, Luisa, Felipe]
				String primero = nombres.get(0); // obtengo el elemento de la pos 0
				String ultimo = nombres.get(nombres.size() - 1); // obtengo el ultimo elemento del array
				System.out.println("el primero es " + primero  + " , el ultimo es " + ultimo);  // el primero es Alfonso,   el ultimo es Felipe
	
				
				//busqueda
				int tope=nombres.size()-1;
				int i=0;	
				int posiBusc=0;
				boolean encontre =false;
				String nombreBuscado="Felipe";
				while (!encontre && i<nombres.size()) {
					if (nombres.get(i).equals(nombreBuscado)) {
						encontre=true;
						posiBusc= i + 1;
					}
					i++;
				}
				if (encontre) {
					System.out.println("encontre el nombre buscado");
					System.out.println("este se encuentra en la posicion:" + posiBusc);
				}else {
					nombres.add(nombreBuscado);
				}
				
				
				for(String nombreA: nombres){
			           System.out.println(nombreA);
				}

				
			}

	
}


