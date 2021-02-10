package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class ConcesionariaDeAutos {
	
	ArrayList<Auto> listaDeAutos;
	
	

	public ConcesionariaDeAutos() {
		this.listaDeAutos =  new ArrayList<Auto>();
	} 
	
	
	// el scanner debe estar afuera en el test, y guarda como parametro los datos pedidos, luego los pasa
	// por parametro a esta función agregar auto y ahí crea el objeto
	
	public void agregarAutos() {
		String valorCorte = "F";
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese matricula, pulse F para terminar de cargar autos");
		String matricula = scan.next();

		while (!matricula.equalsIgnoreCase(valorCorte)) {
			System.out.println("Ingrese marca");
			String marca = scan.next();
			System.out.println("Ingrese modelo");
			String modelo = scan.next();
			System.out.println("Ingrese Km");
			int km = scan.nextInt();

			Auto autoNuevo = new Auto(matricula, marca, modelo, km);
			listaDeAutos.add(autoNuevo);

			System.out.println("Ingrese otra matricula o pulse F para terminar de cargar autos");
			matricula = scan.next();

		}

	}
	
	public int totalAutos() {
		return listaDeAutos.size();

	}

	public ArrayList<Auto> cantidadAutosDeTalModelo(String modelo) {
		ArrayList<Auto> listaModeloElegido = new ArrayList<Auto>();

		for (Auto auto : listaDeAutos) {
			if (auto.getModelo().equals(modelo)) {
				listaModeloElegido.add(auto);
			}
		}

		return listaModeloElegido;
	}

	@Override
	public String toString() {
		return "ConcesionariaDeAutos [listaDeAutos=" + listaDeAutos + "]";
	}
	
	
	
	public ArrayList<Auto> autosConMenosDeXKm(int kilomentros) {
		ArrayList<Auto> listaAutosMenosKm = new ArrayList<Auto>();

		for (Auto auto : listaAutosMenosKm) {
			if (auto.getKm() <= kilomentros) {
				listaAutosMenosKm.add(auto);
			}
		}

		return listaAutosMenosKm;

	}
	
	public Auto autoConMayorKm () {
		int contador=0; 
		boolean encontre=false; 
		int maxKm=0;
		Auto autoConMayorKm=null; 
		
		while (contador<listaDeAutos.size() && !encontre) {
			Auto autoBuscado= listaDeAutos.get(contador);
			if (autoBuscado.getKm()>=maxKm) {
				encontre=true;
				autoConMayorKm= autoBuscado; 
				
			}
			
			contador++;
		}
		return autoConMayorKm;
	}

}
	

