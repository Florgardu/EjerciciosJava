package curso2polimorfismo;

public class Resta_claseHija extends Operacion_clasePadre {
	
	
	
	@Override
	public void operaciones () {
		this.resultado= this.valor1-this.valor2;
	}



}
