package clases;

public class PersonalComision extends Personal {

	private double SALARIO_MINIMO = 10000;
	private int clientesCaptados;
	private double montoXCliente;

	// constructor

	public PersonalComision(String numeroDni, String nombre, String apellido, int anioIngreso,
			int clientesCaptados, double montoXCliente) {
		super(numeroDni, nombre, apellido, anioIngreso);
		this.clientesCaptados = clientesCaptados;
		this.montoXCliente = montoXCliente;
	}

//metodo abstracto sobre-escrito 

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		double salario;

		salario = this.clientesCaptados * this.montoXCliente;
		if (salario < this.SALARIO_MINIMO) {
			return SALARIO_MINIMO;
		} else {
			return salario;
		}

	}

	@Override
	public String toString() {
		return "PersonalComision [SALARIO_MINIMO=" + SALARIO_MINIMO + ", clientesCaptados=" + clientesCaptados
				+ ", montoXCliente=" + montoXCliente + ", getNumeroDni()=" + getNumeroDni() + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getAnioIngreso()=" + getAnioIngreso() + "]";
	}

}
