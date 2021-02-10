
public class Auto {

	private TipoAuto tipoAuto;

	public Auto(TipoAuto tipoAuto) {
		super();
		this.tipoAuto = tipoAuto;
	}

	public TipoAuto getTipoAuto() {
		return tipoAuto;
	}

	public void setTipoAuto(TipoAuto tipoAuto) {
		this.tipoAuto = tipoAuto;
	}

	@Override
	public String toString() {
		return "Auto [tipoAuto=" + tipoAuto + "]";
	}
	
	
	
	
	
	
	
	
}
