package ejemploParccial2;

public class Jugador {

	private String nombre;
	private int puestoAustralia;
	private int puestoUsOpen;
	private int puestoRolandGarros;
	private int puestoWimbledon;
	private int puestoShangai;

	public Jugador() {
		
	}
	
	
	public Jugador(String nombre, int puestoAustralia, int puestoUsOpen, int puestoRolandGarros, int puestoWimbledon,
			int puestoShangai) {
		this.nombre = nombre;
		this.puestoAustralia = puestoAustralia;
		this.puestoUsOpen = puestoUsOpen;
		this.puestoRolandGarros = puestoRolandGarros;
		this.puestoWimbledon = puestoWimbledon;
		this.puestoShangai = puestoShangai;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPuestoAustralia() {
		return puestoAustralia;
	}

	public int getPuestoUsOpen() {
		return puestoUsOpen;
	}

	public int getPuestoRolandGarros() {
		return puestoRolandGarros;
	}

	public int getPuestoWimbledon() {
		return puestoWimbledon;
	}

	public int getPuestoShangai() {
		return puestoShangai;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPuestoAustralia(int puestoAustralia) {
		this.puestoAustralia = puestoAustralia;
	}

	public void setPuestoUsOpen(int puestoUsOpen) {
		this.puestoUsOpen = puestoUsOpen;
	}

	public void setPuestoRolandGarros(int puestoRolandGarros) {
		this.puestoRolandGarros = puestoRolandGarros;
	}

	public void setPuestoWimbledon(int puestoWimbledon) {
		this.puestoWimbledon = puestoWimbledon;
	}

	public void setPuestoShangai(int puestoShangai) {
		this.puestoShangai = puestoShangai;
	}

	@Override
	public String toString() {
		return "Puesto Australia=" +  " " + puestoAustralia + ", puestoUsOpen=" + puestoUsOpen
				+ ", puestoRolandGarros=" + puestoRolandGarros + ", puestoWimbledon=" + puestoWimbledon
				+ ", puestoShangai=" + puestoShangai + "";
	}
	
	
	public int damePosicionEnTorneo(int torneo) {
		int puesto=0;
		switch (torneo) {
		case 0:
			puesto= this.puestoAustralia;
				break;
				
		case 1:
			puesto= this.puestoUsOpen;
				break;
		case 2:
			puesto= this.puestoRolandGarros;
				break;
				
		case 3:
			puesto= this.puestoWimbledon;
				break;
				
		case 4:
			puesto= this.puestoShangai;
				break;

		}
		
		return puesto;
		
	}
	
	


}
