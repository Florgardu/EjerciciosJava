package curso2polimorfismo;

public class Suma_claseHija extends Operacion_clasePadre {
	
	public boolean soyHijo(){
		return true;
	}
	
	@Override
	public void operaciones () {
		this.resultado= this.valor1+this.valor2;
	}

}
