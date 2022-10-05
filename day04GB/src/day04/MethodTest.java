package day04;

import java.util.Date;

public class MethodTest {

	public static void main(String[] args) {
		MethodTest m = new MethodTest();
		m.sayHello();
		m.f(3);
		m.printName();
		m.getGift("나쁜짓");
		System.out.println(m.getTime());
		m.printDan(5);
	}
	
	int f(int x) {
		return 2*x+1;
	}
	void sayHello() {
		System.out.println("Hello");
	}
	
	// 내 이름을 10번 출력하는 메소드
	void printName() {
		for(int i=0; i<10; i++) {
			System.out.print("김사과 ");
		}
	}
	
	// 착한일을 하면 선물을 돌려주는 메소드
	String getGift(String action) {
		if(action.equals("착한일")) {
			return "선물";
		}else {
			return "없음";
		}
	}
	
	// 현재 시간 정보를 알려주는 메소드
	Date getTime() {
		return new Date();
	}
	
	// 구구단의 단을 출력해주는 메소드
	void printDan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.print(dan+"*"+i+"="+dan*i+" ");
		}
	}
}
