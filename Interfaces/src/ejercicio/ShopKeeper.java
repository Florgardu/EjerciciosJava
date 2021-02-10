package ejercicio;

public class ShopKeeper extends Person implements Seller {
	
	
	ShopKeeper (String name){
		super(name);
	}
	

	@Override
	public String chat () {
		return "Hi, i am a shoop keeper" ;
	}

	
	@Override
	public void sellGoods () {
		
	}
	
}
