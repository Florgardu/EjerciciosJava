package ejercicio2;

public class MaquinaGolosina {

	private String[][] nombresGolosinas = { { "KitKat", "Chicles de fresa", "Lacasitos", "Palotes" },
			{ "Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix" },
			{ "Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta" },
			{ "Lacasitos", "Crunch", "Milkybar", "KitKat" } };

	private double[][] precio = { { 1.1, 0.8, 1.5, 0.9 }, { 1.8, 1, 1.2, 1 }, { 1.8, 1.3, 1.2, 0.8 },
			{ 1.5, 1.1, 1.1, 1.1 }

	};

	private int[][] cantidad = { { 5, 5, 5, 5 }, { 5, 5, 5, 5 }, { 5, 5, 5, 5 },
			{ 5,5,5,5 }

	};


	
	  public void pedirGolosina (int fila, int columna) {
		  String golosinaPedida="";
		  int cantidad=this.cantidad[fila][columna];
		  if (cantidad>0) {
			  int nuevaCantidad=cantidad-1;
			  this.cantidad[fila][columna]=nuevaCantidad;
			  golosinaPedida= this.nombresGolosinas[fila][columna];
		}
		 this.mostrarMatriz(this.cantidad);
		
		 
	  }

	//  Mostrar golosinas: mostrara todas las golosinas disponibles. Mostrará el código
	//  que debe introducir el usuario, el nombre y el precio. La cantidad no se
	//  mostrará.

	  
	  public void mostrarMatriz (int [][] matriz) {
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + "\t\t");
				}
				System.out.println();
			}
			
		}

	  
	  //Mostrar golosinas: mostrara todas las golosinas disponibles. Mostrará el código
	//  que debe introducir el usuario, el nombre y el precio. La cantidad no se
	//   mostrará.
	  
	  
	  public void mostrarGolosinas () {
		  for (int i = 0; i < cantidad.length; i++) {
			  for (int j = 0; j < cantidad[i].length; j++) {
				if (this.cantidad[i][j]>0) {
					System.out.println(this.nombresGolosinas[i][j] + "precio : " + this.precio[i][j] );
				}
			}
			
		}
	  }
	  

}
