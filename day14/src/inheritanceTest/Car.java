package inheritanceTest;

public class Car {
	String name;
	int price;
	String color;
	
//	public Car() {
//		System.out.println("Car ������ �����");
//	}
	
	public Car() {}
	
	public Car(String name, int price, String color) { // �ʱ�ȭ������
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public void go() {
		System.out.println("������ ���ϴ�.");
	}
	public void engineOn() {
		System.out.println("����� �õ��� �׽��ϴ�.");
	}
	public void show() {
		System.out.println("---��������---");
		System.out.println("���� : "+this.name);
		System.out.println("���� : "+this.price +"����");
		System.out.println("���� : "+this.color);
	}
	
	
}
