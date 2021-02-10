package ejercicio1;

public class CeldaSudoku {
	
	private int [][] sudoku;

	public CeldaSudoku() {
		this.sudoku = new int [3][3];
	}
	
	
	public void mostrar () {
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[0].length; j++) {
				System.out.print(this.sudoku[i][j]+  "\t\t");
			}
			System.out.println();
		}
		
	}
	
	public boolean agregarValor (int fila, int columna, int valor) {
		boolean seAgrego=false;
		if (estaLibre(fila, columna) && valor>0 && valor<10) {
			this.sudoku[fila][columna]=valor;
			seAgrego=true;
		} else {
		}
		return seAgrego;
	}
	
	private boolean estaLibre (int fila, int columna) {
		boolean estaLibre=true;
		
		if (this.sudoku[fila][columna]!=0) {
			estaLibre=false;
		}
		return estaLibre;
	}
	
	

}
