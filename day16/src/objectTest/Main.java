package objectTest;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car(1234);
		Car c2 = new Car(1234);

		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString()); // toString �����Ǿ��ִ��Ŷ� ����
		System.out.println(c1);
		System.out.println(c2); // ��ü�� println �ȿ� ���̸� toString() �޼ҵ尡 ������ �����̴�.
								// ���� toString()�� �������̵��ϸ� ����Ҷ��� ����� ������ �� �ִ�.
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
