package road;

public class SuperCar extends Car implements Vehicle{

	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}

	@Override
	public void engineStart() {
		System.out.println(brand + " 음성으로 시동켜기");
	}

	@Override
	public void engineStop() {
		System.out.println(brand + " 음성으로 시동끄기");

	}
	
	
}
