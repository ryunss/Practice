package inheritanceTest;

public class SuperCar extends Car{
	// 만약 자식 클래스에서 새로운 멤버들(멤버변수, 메소드)이 필요하다면 써주면 된다.
	String mode;
	
	public SuperCar(String name, int price, String color, String mode) {
		super(name, price, color);
//		this.name = name;
//		this.price = price;
//		this.color = color;
		this.mode = mode;
	}
	
	public SuperCar() {}
//	public SuperCar() {
//		// 부모생성자를 호출하고 있음
//		// Car(); 생략이 되어있는 것임. == super();
//		super();
//		System.out.println("SuperCar 생성자 실행됨");
//	}
	
	public void openRoof() {
		System.out.println("지붕을 열었습니다");
	}
	
	@Override // 어노테이션 주석 : 컴퓨터에게 설명하기 위한 주석
	public void engineOn() { // 오버라이딩(over riding) : 메소드 재정의
		System.out.println("버튼으로 시동을 켰습니다.");
	}
	
	public void show() {
		super.show(); // super(부모) Car에 있는 show 를 가져온다.
//		System.out.println("---차량정보---");
//		System.out.println("차주 : "+this.name);
//		System.out.println("가격 : "+this.price +"만원");
//		System.out.println("색깔 : "+this.color);
		System.out.println("모드 : "+this.mode);
	}
}
