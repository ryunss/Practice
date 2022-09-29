package abstractTest;

public abstract class Animal {
	public void eat() {
		System.out.println("부모에서 정의된 eat()");
	}
	
	abstract public void play(); // 중괄호가 없으면 바디가 없는 것이다. 이런 메소드가 추상메소드
					             // 오류나는 이유는 추상메소드인지 일반메소드인지 구분을 못하기 때문
								 // abstract 를 앞에 붙이면 됨 (추상 클래스와 메소드 둘다)
}
