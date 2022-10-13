package day08;

public class Road1 {
	public static void main(String[] args) {
		Car brokenFerrari = new SuperCar("Ferrari", "Red", 70000);

//		업캐스팅 객체는 자식에서 새롭게 추가한 내용은 쓸 수 없다.		
//		brokenFerrari.openDoor(); 사용할 수 없다.
		
//		오버라이딩 된 메소드는 자식 것으로 사용한다.
		brokenFerrari.engineStart();
		
		// 다운캐스팅
		((SuperCar)brokenFerrari).openDoor(); // 일회용처럼 사용 가능
		// 다운캐스팅은 매번 위의 모습으로 괄호로 묶어준 후 사용해야하기 때문에 가독성이 떨어진다. 
		// 그래서 보통 다운캐스팅 한 결과로 나온 객체를 자식객체에 담아두고 사용한다.
		SuperCar fixedFerrari = (SuperCar)brokenFerrari; // 변수에 넣어두고 계속 사용가능
	}
}
