package ejercicio;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ShopKeeper shopKeeper = new ShopKeeper("Larry");
		TeaCup teacup = new TeaCup();
		String treehouse = "Treehouse";

		// Loop through Objects
		Object[] objects = {shopKeeper, teacup, treehouse};

		for (Object object : objects) {
		    if (object instanceof Chattable) {
		        String response = ((Chattable) object).chat();
		        System.out.println(response);
		    }
		}

		// Loop through Chattables
		Chattable[] chattables = {shopKeeper, teacup};

		for (Chattable chattable : chattables) {
		    String response = chattable.chat();
		    System.out.println(response);
		}
		
	}

}
