package ejercicio1;

public class NumTel {
	
	
	private int caracteristica;
	private int numeroAbonado;
	private int codigoDePais;
	private TipoDeLinea tipoLinea;
	
	
	//constructor por defecto
	public NumTel () {
		this(000,0000,0000,TipoDeLinea.SIN_DEFINIR);
	}
	
	
	// constructor parametrizado 
	public NumTel (int caracteristica, int numeroAbonado, int codigoPais, TipoDeLinea tipolinea) {
		setCaracteristica(caracteristica);
		setNumeroAbonado(numeroAbonado);
		setCodigoDePais(codigoPais);
		setTipoLinea(tipolinea);
	}

	public int getCaracteristica() {
		return caracteristica;
	}

	public int getNumeroAbonado() {
		return numeroAbonado;
	}

	public int getCodigoDePais() {
		return codigoDePais;
	}

	public TipoDeLinea getTipoLinea() {
		return tipoLinea;
	}

	public void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void setNumeroAbonado(int numeroAbonado) {
		this.numeroAbonado = numeroAbonado;
	}

	public void setCodigoDePais(int codigoDePais) {
		this.codigoDePais = codigoDePais;
	}

	public void setTipoLinea(TipoDeLinea tipoLinea) {
		this.tipoLinea = tipoLinea;
	}
	
	
	//Tiene también un método llamado getValor()
	//que devolverá un String en formato “(+PPP) CCCC-AAAA”, donde +PPP es un signo más (+)
	//seguido por el código del país.

	public String getValor () {
		return "(+ "+this.codigoDePais+")"+this.caracteristica+ "-" + this.numeroAbonado;
	}
	
}
