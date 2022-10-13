package day08;

public class Road2 {
	public static void main(String[] args) {
//		SuperCar mycar = new SuperCar("Ferrari", "Red", 70000);
//		Car momcar = new Car("K8", "White", 5000);
//		SuperCar dadcar = new SuperCar("Porsche", "Yellow", 25000);
//		
//		mycar.engineStart();
//		momcar.engineStart();
//		dadcar.engineStart();
		
		Car[] garage = {
				new SuperCar("Ferrari", "Red", 70000),
				new Car("K8", "White", 5000),
				new SuperCar("Porsche", "Yellow", 25000)
		};
		
		for (int i = 0; i < garage.length; i++) {
			garage[i].engineStart();
//			((SuperCar)garage[i]).openDoor(); momcar는 업캐스팅이 되지 않았기 때문에 다운캐스팅 할 수 없다. 에러.
			if(garage[i] instanceof SuperCar) {
				((SuperCar)garage[i]).openDoor();
			}
		}
	}
}
