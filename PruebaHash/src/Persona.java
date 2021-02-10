
public class Persona {
	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		
		return 31;
	}

	@Override
	public boolean equals(Object obj) {

		return true;
	}

}
