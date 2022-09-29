package interTest;

public interface Soldier {
	int num = 10; // 인터페이스에는 static final 변수만 넣을 수 있다.
	
	public abstract void eat();
	
	public void work(); // 어차피 인터페이스에는 추상메소드만 넣을 수 있기 때문에 abstract를 생략 가능하다

}