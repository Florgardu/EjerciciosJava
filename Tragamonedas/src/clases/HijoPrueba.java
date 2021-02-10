package clases;

public class HijoPrueba extends PadrePrueba {

	int edad;
	private int ojos=3;
	
	public HijoPrueba( int colorPelo, int edad) {
		super(colorPelo);
		this.edad = edad;
	}
	
	public void dameCantidadDeOjos() {
		System.out.println(super.getOjos());

	}
	
	@Override
	public int getOjos() {
		System.out.println(this.ojos);
		return ojos;


	}
	
	
}
