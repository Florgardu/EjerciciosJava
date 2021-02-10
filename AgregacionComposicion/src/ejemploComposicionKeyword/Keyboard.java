package ejemploComposicionKeyword;

public class Keyboard {

	private int numeroSerie;
	private String layout;
	
	
	// en el constructor llamo a los set para poder hacer validaciones si es necesario
	public Keyboard(int numeroSerie, String layout) {
		setNumeroSerie (numeroSerie);
		setLayout(layout);
	}
	
	// así seria un constructor por default , pero con validación (set de numero de serie). Entonces llamo al contructor de arriba.
	// es llamarse a sí mismo, mandando esos parametros.
	public Keyboard () {
		this(100, "");
	}
	

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public String getLayout() {
		return layout;
	}

	public void setNumeroSerie(int numeroSerie) {
		if (numeroSerie>10) {
			this.numeroSerie = numeroSerie;
		}
		
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

}
