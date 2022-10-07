package day06;

public class ClassTest {

	public static void main(String[] args) {
//		Car mycar = new Car();
//				
//		mycar.brand = "Ferrari";
//		mycar.color = "Red";
//		mycar.price = 30000;
//		
//		mycar.engineStart();
//		mycar.engineStop();
		
		new Car().engineStart();
		
		Car mycar = new Car("Ferrari", "Red", 70000);
		
		mycar.engineStart();
		
		Car momcar = new Car();

		momcar.engineStart();
		
		Car dadcar = new Car(25000);
		
	}

}
class Car{
	
	String brand;
	String color;
	int price;
	
	Car(){}
	
	Car(String brand, String color, int price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	Car(int price) {
		this.price = price;
	}

	void engineStart() {
		System.out.println(this.brand+" 시동켜기");
	}
	void engineStop() {
		System.out.println(brand+" 시동끄기");		
	}
}
