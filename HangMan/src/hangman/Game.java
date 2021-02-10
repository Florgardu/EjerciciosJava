package hangman;

public class Game {
	
	
	private String answer;
	private String hit;
	private String misses;

	

	public Game(String answer) {
		this.answer = answer;
		hit= "";
		misses="";
	}
	
	
	
	
	public boolean applyGuess(char letter) {
		boolean isHit = answer.indexOf(letter) != -1;
		if (isHit) {
			hit += letter;
		} else {
			misses += letter;
		}

		return isHit;
	}

}
