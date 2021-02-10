package ejercicio4;

public class Cuidador extends Personal {

	private int cantidadAnimalesACargo;
	private Calamar baldeCalamares;
	private Cangrejo baldeCangrejos;
	private Pulpo baldePulpos;
	
	
	public Cuidador(String nombre, int horarioIngreso, int horarioSalida, int cantidadAnimales) {
		super(nombre, horarioIngreso, horarioSalida);
		this.cantidadAnimalesACargo= cantidadAnimales;
		// TODO Auto-generated constructor stub
	}

	
	public void cargarBaldes(Calamar calamar, Cangrejo cangrejo, Pulpo pulpo) {
		this.baldeCalamares=calamar;
		this.baldeCangrejos= cangrejo;
		this.baldePulpos=pulpo;
	}
	
	
	public void mostrarStock () {
		int stockCalamar= this.baldeCalamares.getStock();
		int stockPulpo=this.baldePulpos.getStock();
		int stockCangrejo= this.baldeCangrejos.getStock();
		
		System.out.println(
				"Stock de alimento:" + 	"Calamar:" +  stockCalamar+ " Pulpo:" + stockPulpo +  " Cangrejo: " +  stockCangrejo); 
				
	}
	
	
	public boolean hayAlimento(ComidaDeAnimal comida, int kilos) {
		boolean hayAlimento = true;

		if (comida.equals(baldeCalamares)) {
			if (baldeCalamares.getStock() < kilos) {
				hayAlimento = false;
			}
		}

		if (comida.equals(baldeCangrejos)) {
			if (baldeCangrejos.getStock() < kilos) {
				hayAlimento = false;
			}
		}

		if (comida.equals(baldePulpos)) {
			if (baldePulpos.getStock() < kilos) {
				hayAlimento = false;
			}
		}

		return hayAlimento;

	}


	public void descontarStock(ComidaDeAnimal tipoDeComida, int cantidadKilos) {
		// TODO Auto-generated method stub
		
		if (tipoDeComida.equals(baldeCalamares)) {
			int nuevoStock= this.baldeCalamares.getStock()-cantidadKilos;
			this.baldeCalamares.setStock(nuevoStock);
		}

		if (tipoDeComida.equals(baldeCangrejos)) {
			int nuevoStock= this.baldeCangrejos.getStock()-cantidadKilos;
			this.baldeCangrejos.setStock(nuevoStock);
		}

		if (tipoDeComida.equals(baldePulpos)) {
			int nuevoStock= this.baldePulpos.getStock()-cantidadKilos;
			this.baldePulpos.setStock(nuevoStock);
		}
		
	}
	
	
}
