package road;

public class Bus extends Car implements Vehicle{

	public Bus(String brand, String color, int price) {
		super(brand, color, price);
	}

	@Override
	public void engineStart() {
		System.out.println(brand + " 지문으로 시동켜기");
	}

	@Override
	public void engineStop() {
		System.out.println(brand + " 지문으로 시동끄기");
	}

	
}
