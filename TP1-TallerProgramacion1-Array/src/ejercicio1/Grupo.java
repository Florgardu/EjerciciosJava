package ejercicio1;

import java.util.ArrayList;

public class Grupo {

	private String nombreGrupo;
	private ArrayList<String> nombresIntegrantesGrupo;
	
	

	public Grupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
		this.nombresIntegrantesGrupo = new ArrayList<>();
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public int getCantidadIntegrantes() {
		return this.nombresIntegrantesGrupo.size();
	}

	public void agregarIntegrante(String nombreIntegrante) {
		
		if (obtenerPosicion(nombreIntegrante) != -1) {
			System.out.println("Ya existe no se puede agregar ese nombre");
		} else {
			this.nombresIntegrantesGrupo.add(nombreIntegrante);
			System.out.println(nombreIntegrante + " fue agregado con éxito al " + this.nombreGrupo);
		}

	}

	private int obtenerPosicion(String nombreIntegrante) {
		int posicion = -1;
		int contador = 0;

		while (contador < this.nombresIntegrantesGrupo.size() && posicion == -1) {

			if (this.nombresIntegrantesGrupo.get(contador).equals(nombreIntegrante)) {
				posicion = contador;
			} else {
				contador++;

			}
		}
		return posicion;
	}


	public String obtenerIntegrante(int posicion) {
		String integrante = null;

		if (posicion <= this.nombresIntegrantesGrupo.size()) {
			integrante = this.nombresIntegrantesGrupo.get(posicion);
		}

		return integrante;
	}
	

	
	public String buscarIntegrante (String nombre) {
		String nombrePersona= null;
		
		int posicion= obtenerPosicion (nombre);
		if (posicion != -1) {
			nombrePersona= this.obtenerIntegrante(posicion);
		} 
		return nombrePersona;
	}
	

	
	public String removerIntegrante(String nombreIntegrante) {
		int posicionARemover = this.obtenerPosicion(nombreIntegrante);
		String integranteRemovido;

		if (posicionARemover == -1) {
			integranteRemovido = null;
		} else {
			integranteRemovido = obtenerIntegrante(posicionARemover);
			this.nombresIntegrantesGrupo.remove(posicionARemover);

		}
		return integranteRemovido;
	}
	
	
	
	private void mostrarIntegrantes() {
		System.out.println("La cantidad de integrantes es " + this.getCantidadIntegrantes());
		for (String integrante : nombresIntegrantesGrupo) {
		     System.out.println("Los nombres son "+ integrante);
		}
		
	}

	public void mostrar() {
		
		System.out.println("El nombre del grupo es " + this.getNombreGrupo());
		mostrarIntegrantes();
		
		
	}
	
	
	public void vaciar () {
		
		//.clear tmb borra
		
		this.nombresIntegrantesGrupo.removeAll(nombresIntegrantesGrupo);
		
	}
	
	
	@Override
	public String toString() {
		return "Grupo [nombreGrupo=" + nombreGrupo + ", nombresIntegrantesGrupo=" + nombresIntegrantesGrupo + "]";
	}
	
	

}
