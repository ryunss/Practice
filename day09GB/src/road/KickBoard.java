package road;

public class KickBoard extends Car implements Vehicle{

	public KickBoard(String brand, String color, int price) {
		super(brand, color, price);
	}

	@Override
	public void engineStart() {
		System.out.println(brand + " 밀어서 시동켜기");
	}

	@Override
	public void engineStop() {
		System.out.println(brand + " 세워서 시동끄기");
	}
	
	
	
}
