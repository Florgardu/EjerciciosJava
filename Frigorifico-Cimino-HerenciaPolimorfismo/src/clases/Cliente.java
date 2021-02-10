package clases;

public class Cliente {
	
	private String razonSocial;
	private int cuit;
	private int tel;
	private Pais pais;
	
	
	public Cliente(String razonSocial, int cuit, int tel, Pais pais) {
		super();
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.tel = tel;
		this.pais = pais;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public int getCuit() {
		return cuit;
	}


	public int getTel() {
		return tel;
	}


	public Pais getPais() {
		return pais;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public void setCuit(int cuit) {
		this.cuit = cuit;
	}


	public void setTel(int tel) {
		this.tel = tel;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}


	@Override
	public String toString() {
		return "Cliente [razonSocial=" + razonSocial + ", cuit=" + cuit + ", tel=" + tel + ", pais=" + pais + "]";
	}
	
	
	
	

}
