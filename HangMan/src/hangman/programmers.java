package hangman;

public class programmers {
	
	
	
	 public void printMenu() {
		    String[] programmers = {
		            "Yukihiro Matsumoto",
		            "David Nolen",
		            "Grace Hopper",
		            "Linus Torvalds",
		            "You"
		    };

		    System.out.println("Choose a programmer:");
		    
		    for (int i =0; i<programmers.length; i++){
	 	    	System.out.println(
	 	    				i+1 + 
                          programmers[i]
		    			);
		    	
		    
		    }

		    // TODO: Print out a menu by looping through the programmers array.
		    /*
		      The menu should be in the form of (each on a line of its own, starting with 1):
		      1. Yukihiro Matsumoto
		      2. David Nolen
		      ...
		    */
		    

		  }

		}






