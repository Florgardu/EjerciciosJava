package hangman;

import java.util.Random;

public class Scratch {
	/// multidimencional Array. Un array que contiene muchos/otros arrays adentro

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] friends = { "Ben", "Alena", "Pasan" };
		int[][] scoreCards = {

				// Ben's
				{ 1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2 },
				// Alena's
				{ 2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2 },
				// Pasan's
				{ 4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2 } };

		// quiero ver el resultado especifico de del array que esta dentro de mi array
		// scoreCards =
		int scoreAlena = scoreCards[1][3];
		System.out.println(scoreAlena);

// for each friend // print their name 

		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);

// for each hole // print their score 

			for (int j = 0; j < scoreCards[i].length; j++) {
				
				System.out.println("Hole" + j+1 + scoreCards[i][j]);

			}
		}
	}
	
	//método devuelve String, pasa por parametro una lista Strings
	
	public String pickLunchSpot(String[]spots) {
		System.out.printf("randomly picking %d lunch spots %d", 
				spots.length) ;
		Random random = new Random();
		return spots [random.nextInt(spots.length)];
		
	}
	
}
