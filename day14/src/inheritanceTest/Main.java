package inheritanceTest;

public class Main {

	public static void main(String[] args) {
		Car momCar = new Car();
		System.out.println("---------------");
		SuperCar myCar = new SuperCar();
		
		
		momCar.name = "엄마";
		momCar.price = 100;
		momCar.color = "blue";
//		momCar.mode = "normal"; 부모객체에 없음. 오류
		
		myCar.name = "나";
		myCar.price = 1000;
		myCar.color = "red";
		myCar.mode = "sports";
		
		momCar.go();
		momCar.engineOn();
		momCar.show();
//		momCar.openRoof(); 부모객체에 없음. 오류
		
		System.out.println("--------------------------------------");
		
		myCar.go();
		myCar.engineOn();
		myCar.show();
		myCar.openRoof();
		
		
		//업캐스팅
		//momCar : Car타입(부모)
		//myCar : SuperCar타입(자식)
		
		//ex) int num = (int)3.14;
		// 자식 --> 부모 : 업캐스팅
		System.out.println("===================업캐스팅======================");
//		Car up = (Car)myCar;
		Car up = myCar; // 생략해도됨. ex) double d = 3; 도 가능하듯이 생략 됨.
		up.name = "변경이름";
		up.price = 200;
		up.color = "수정된색상";
//		up.mode = "normal"; 업캐스팅이 되면 자식에서 새롭게 정의된 멤버는 사용이 불가능하다.
		
		up.go();
		up.engineOn(); // 재정의된 메소드는 자식에서 재정의된 대로 동작한다.
		up.show(); // 재정의된 메소드는 자식에서 재정의된 대로 동작한다.
//		up.openRoof(); 업캐스팅이 되면 자식에서 새롭게 정의된 메소드는 사용이 불가능하다.
		
		System.out.println("===================다운캐스팅=======================");
		
		// 부모 --> 자식 : 불가능
//		SuperCar down = (SuperCar)momCar; 오류 발생
		// 다운캐스팅 : 부모타입으로 업캐스팅 된 친구를 자식타입으로 다시 되돌리는 행위
		
		SuperCar down = (SuperCar)up;
		down.openRoof();
		down.show();
		
	}

}
