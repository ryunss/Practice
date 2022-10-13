package day08;

public class Car {
	String brand;
	String color;
	int price;
	
	public Car() {}

	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println(brand + " 열쇠로 시동 켜기");
	}
	void engineStop() {
		System.out.println(brand + " 열쇠로 시동 끄기");
	}
	
}
