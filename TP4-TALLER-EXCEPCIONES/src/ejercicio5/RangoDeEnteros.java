package ejercicio5;

public class RangoDeEnteros {
	
	
	private int limiteInferior;
	private int limiteSuperior;

	public RangoDeEnteros(int limiteInferior, int limiteSuperior) {

		if (limiteInferior > limiteSuperior) {
			int aux = limiteInferior;
			limiteInferior = limiteSuperior;
			limiteSuperior = aux;
		} else {
			this.limiteInferior = limiteInferior;
			this.limiteSuperior = limiteSuperior;
		}

	}
	
	// Su método incluye(int valor) indica si el valor recibido está dentro del rango
	
	public boolean incluye (int valor) {
		boolean estaEnRango=false;
		
		if (valor>=limiteInferior && valor<=limiteSuperior) {
			estaEnRango=true;
		}
		
		return estaEnRango;
		
	}

	public int getLimiteInferior() {
		return limiteInferior;
	}

	public int getLimiteSuperior() {
		return limiteSuperior;
	}

	public void setLimiteInferior(int limiteInferior) {
		this.limiteInferior = limiteInferior;
	}

	public void setLimiteSuperior(int limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}
	
	
}
