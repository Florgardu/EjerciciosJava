package clases;

public class Auto {

	private String color;
	private String marca;
	private int puerta;
	private String motor;
	private String combustible;
	private int rueda;
	private String modelo;

	public String getColor() {
		return color;
	}

	public String getMarca() {
		return marca;
	}

	public int getPuerta() {
		return puerta;
	}

	public String getMotor() {
		return motor;
	}

	public String getCombustible() {
		return combustible;
	}

	public int getRueda() {
		return rueda;
	}

	public String getModelo() {
		return modelo;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public void setRueda(int rueda) {
		this.rueda = rueda;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Auto(String color, String motor, String combustible, String modelo) {
		this.color = color;
		this.motor = motor;
		this.combustible = combustible;
		this.modelo = modelo;
		this.marca = "FORD";
		this.rueda = 5;
		this.puerta = 4;
	}

	@Override // hace que aparezcan los atributos con sus valores
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", puerta=" + puerta + ", motor=" + motor
				+ ", combustible=" + combustible + ", rueda=" + rueda + ", modelo=" + modelo + "]";
	}

	public Auto() {
		super();
	}

	public void repintar(String color) {
		// this.color= color;
		setColor(color);
	}

}
