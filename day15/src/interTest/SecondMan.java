package interTest;

public class SecondMan implements Soldier{

	@Override
	public void eat() {
		System.out.println("이등병클래스에서 재정의된 eat()");
	}

	@Override
	public void work() {
		System.out.println("이등병클래스에서 재정의된 work()");
	} // 인터페이스는 implements 로 상속받는다.
	
}
