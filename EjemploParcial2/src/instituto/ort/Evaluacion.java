package instituto.ort;

public class Evaluacion {
	private TipoEvaluacion tipoEvaluacion;
	private double nota;
	
	public Evaluacion() {
		// TODO Auto-generated constructor stub
	}
	
	public Evaluacion(TipoEvaluacion tipoEvaluacion, double nota) {
		this.nota = nota;
		this.tipoEvaluacion = tipoEvaluacion;
	}
	
	public TipoEvaluacion getTipoEvaluacion() {
		return tipoEvaluacion;
	}
	public double getNota() {
		return nota;
	}
	public void setTipoEvaluacion(TipoEvaluacion tipoEvaluacion) {
		this.tipoEvaluacion = tipoEvaluacion;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
}
