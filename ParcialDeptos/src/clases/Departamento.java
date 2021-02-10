package clases;

public class Departamento {
	
	
	private Propietaria dueño;
	private int numeroUnidad;
	private Voto votoParaHecharEncargado= Voto.NEGATIVO;
	private boolean yaVoto=false; 
	
	
	
	public Departamento( int numeroUnidad, Propietaria dueño) {
		
		this.dueño = dueño;
		this.numeroUnidad = numeroUnidad;
		
	}

	
	


	public boolean isYaVoto() {
		return yaVoto;
	}





	public void setYaVoto(boolean yaVoto) {
		this.yaVoto = yaVoto;
	}





	public Propietaria getDueño() {
		return dueño;
	}



	public int getNumeroUnidad() {
		return numeroUnidad;
	}



	public Voto getVotoParaHecharEncargado() {
		return votoParaHecharEncargado;
	}



	public void setDueño(Propietaria dueño) {
		this.dueño = dueño;
	}



	public void setNumeroUnidad(int numeroUnidad) {
		this.numeroUnidad = numeroUnidad;
	}



	public void setVotoParaHecharEncargado(Voto votoParaHecharEncargado) {
		this.votoParaHecharEncargado = votoParaHecharEncargado;
	}



	@Override
	public String toString() {
		return "Departamento [dueño=" + dueño + ", numeroUnidad=" + numeroUnidad + ", votoParaHecharEncargado="
				+ votoParaHecharEncargado + "]";
	} 
	
	
	

}
