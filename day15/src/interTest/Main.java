package interTest;

public class Main {

	public static void main(String[] args) {
//		Soldier s = new Soldier(); // 인터페이스도 객체화를 하지 못한다.
		
		SecondMan sm = new SecondMan();
		
		sm.eat();
		sm.work();
	}

}
