package inheritanceTest;

public class Car {
	String name;
	int price;
	String color;
	
//	public Car() {
//		System.out.println("Car 생성자 실행됨");
//	}
	
	public Car() {}
	
	public Car(String name, int price, String color) { // 초기화생성자
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public void go() {
		System.out.println("앞으로 갑니다.");
	}
	public void engineOn() {
		System.out.println("열쇠로 시동을 켰습니다.");
	}
	public void show() {
		System.out.println("---차량정보---");
		System.out.println("차주 : "+this.name);
		System.out.println("가격 : "+this.price +"만원");
		System.out.println("색깔 : "+this.color);
	}
	
	
}
