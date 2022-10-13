package day08;

public class SuperCar extends Car{
	
	String mode;
	
	public SuperCar() {}

	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}

	void openDoor() {
		System.out.println("위쪽으로 문 열기");
	}
	
	void closeDoor() {
		System.out.println("아래쪽으로 문 닫기");
	}

	@Override
	void engineStart() {
		System.out.println(brand + " 홍채로 시동 켜기");
	}

	@Override
	void engineStop() {
		System.out.println(brand + " 홍채로 시동 끄기");
	}
	
	
}
