package inheritanceTest;

public class SuperCar extends Car{
	// ���� �ڽ� Ŭ�������� ���ο� �����(�������, �޼ҵ�)�� �ʿ��ϴٸ� ���ָ� �ȴ�.
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
//		// �θ�����ڸ� ȣ���ϰ� ����
//		// Car(); ������ �Ǿ��ִ� ����. == super();
//		super();
//		System.out.println("SuperCar ������ �����");
//	}
	
	public void openRoof() {
		System.out.println("������ �������ϴ�");
	}
	
	@Override // ������̼� �ּ� : ��ǻ�Ϳ��� �����ϱ� ���� �ּ�
	public void engineOn() { // �������̵�(over riding) : �޼ҵ� ������
		System.out.println("��ư���� �õ��� �׽��ϴ�.");
	}
	
	public void show() {
		super.show(); // super(�θ�) Car�� �ִ� show �� �����´�.
//		System.out.println("---��������---");
//		System.out.println("���� : "+this.name);
//		System.out.println("���� : "+this.price +"����");
//		System.out.println("���� : "+this.color);
		System.out.println("��� : "+this.mode);
	}
}
