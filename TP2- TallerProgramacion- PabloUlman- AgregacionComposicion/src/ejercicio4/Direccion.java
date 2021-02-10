package ejercicio4;

public class Direccion {

	private String calle;
	private int altura;
	private int piso;
	private String departamento;

	public Direccion(String calle, int altura, int piso, String departamento) {
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}

	public String getCalle() {
		return calle;
	}

	public int getAltura() {
		return altura;
	}

	public int getPiso() {
		return piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
