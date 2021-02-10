import java.util.ArrayList;

public class Instituto {
	
	private ArrayList<Comision>comisiones;

	
	public Instituto() {
		super();
		this.comisiones = new ArrayList ();
	}


	public ArrayList<Comision> getComisiones() {
		return comisiones;
	}


	public void setComisiones(ArrayList<Comision> comisiones) {
		this.comisiones = comisiones;
	}


	@Override
	public String toString() {
		return "Instituto [comisiones=" + comisiones + "]";
	}
	
	
	
	
	

}
