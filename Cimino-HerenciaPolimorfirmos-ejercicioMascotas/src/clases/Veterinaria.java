package clases;

import java.util.ArrayList;

public class Veterinaria {
	
	
	ArrayList<Mascota> misMascotas;
	
	

	public Veterinaria() {
		super();
		this.misMascotas = new ArrayList();
	}
	
	
	public void agregarMascotas (Mascota mascotita) {
		this.misMascotas.add(mascotita);
	}

	
	public void saludarCliente () {
		for (Mascota mascota : misMascotas) {
			mascota.hacerGracia();
		}
	}
	
	
	public int cantidadDePerros () {
		int contador=0; 
		for (Mascota mascota : misMascotas) {
			if (mascota instanceof Perro) {
				contador++;
			}
		}
		return contador; 
	}
	
	
}
