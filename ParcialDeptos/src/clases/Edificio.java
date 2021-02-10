package clases;

import java.util.ArrayList;

public class Edificio {
	
	
	private String direccion;
	private ArrayList <Departamento> listaDepartamentos;
	private Encargado encargardoDelEdificio;
	
	
	
	public Edificio(String direccion, Encargado encargardoDelEdificio) {
		super();
		this.direccion = direccion;
		this.listaDepartamentos = new ArrayList<Departamento>();
		this.encargardoDelEdificio = encargardoDelEdificio;
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	public ArrayList<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}
	public Encargado getEncargardoDelEdificio() {
		return encargardoDelEdificio;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}
	public void setEncargardoDelEdificio(Encargado encargardoDelEdificio) {
		this.encargardoDelEdificio = encargardoDelEdificio;
	} 
	
	
	public Departamento agregarUnidad (int numeroUnidad, Propietaria propietaria) {
		Departamento deptoAgregar;
		
		deptoAgregar= this.buscarDepto(numeroUnidad);
		if (deptoAgregar== null) {
			Departamento departamento = new Departamento (numeroUnidad, propietaria);
			listaDepartamentos.add(departamento);
			System.out.println("Se agrego exitosamente el depto" + numeroUnidad + " de " + propietaria);
				
		} else {
			System.out.println("No se pudo agregar, el depto: " + numeroUnidad + " ya existe");
		}
		return deptoAgregar;
	}

	
	private Departamento buscarDepto(int numeroUnidad) {
		int contador = 0;
		Departamento deptoBuscado = null;
		Departamento deptoEnLista;
		int tope= listaDepartamentos.size();

		while (contador < tope && deptoBuscado == null) {
			deptoEnLista = listaDepartamentos.get(contador);
			if (deptoEnLista.getNumeroUnidad() == numeroUnidad) {
				deptoBuscado = deptoEnLista;

			} else {
				contador++;
			}

		}
		return deptoBuscado;
		
		

	}

	public void actualizarVoto(int numeroUnidad, Voto tipoVoto) {
		Departamento deptoQueCambiaVoto;

		deptoQueCambiaVoto = buscarDepto(numeroUnidad);
		if (deptoQueCambiaVoto == null) {
			System.out.println("No existe el depto");

		} else {
			if (deptoQueCambiaVoto.isYaVoto()) {
				System.out.println("Este depto ya voto");
			}

			else {
				deptoQueCambiaVoto.setVotoParaHecharEncargado(tipoVoto);
				System.out.println("Se cambio exitosamente el voto");
				deptoQueCambiaVoto.setYaVoto(true);

			}

		}
			}
			
		
     private int CantidadDeDepartamentos () {
    	 return this.listaDepartamentos.size();
     }
     
     

     private double porcentaje (double total, double dato) {
    	 double porcentaje; 
    	 
    	 porcentaje= (dato/total)*100;
    	 return porcentaje;
     }
     
     
     public double listarVotosPositivos () {
    	 int contadorDeVotoPos=0; 
    	 double porcentaje; 
    	 
    	 for (Departamento departamento : listaDepartamentos) {
			if (departamento.getVotoParaHecharEncargado().equals(Voto.POSITIVO)) {
				contadorDeVotoPos++;
				System.out.println("El depto" + departamento.getNumeroUnidad() + "voto positivo");
				System.out.println(departamento);
			}
			
			
		}
    	 porcentaje= this.porcentaje(CantidadDeDepartamentos(), contadorDeVotoPos);
    	 System.out.println("El porcentaje de votos positivos es" + porcentaje);
    	 System.out.println("El total de unidades que votaron positivo fueron" + contadorDeVotoPos);
    	 return porcentaje;
     }
	
}
