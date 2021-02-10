package hangman;

public class Hangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Game game= new Game ("treehouse");
		
		System.out.println(game.applyGuess('t'));
		System.out.println(game.applyGuess('f'));

		
		
		
		
	}

}
