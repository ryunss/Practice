package road;

public class Car {
	String brand;
	String color;
	int price;

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void go() {
		System.out.println(brand+"이(가) 앞으로 슝~");
	}
	
	
}
