package interTest;

public class SecondMan implements Soldier{

	@Override
	public void eat() {
		System.out.println("�̵Ŭ�������� �����ǵ� eat()");
	}

	@Override
	public void work() {
		System.out.println("�̵Ŭ�������� �����ǵ� work()");
	} // �������̽��� implements �� ��ӹ޴´�.
	
}
