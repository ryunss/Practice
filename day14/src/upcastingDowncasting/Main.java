package upcastingDowncasting;

public class Main {
	
	public static void test(Parent c) { // ����� Ÿ������ �����ϱ� ����. �Ｚ - ����,����,���� ��...
										// �Ｚ�� ���������� ����� �� �ִ� �κ��� ������ �ٿ�ĳ�����ϸ� �ڽ��� ������ ����� ����� ���ְ� �ȴ�.
										// Ȯ���� �´��� �ٽ� Ȯ���ϱ�.
	}


	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Child2 c2 = new Child2();
		
		Object[] ar = {"�ȳ�", p, c, c2}; // String, parent, child, child2 ���� ��ĳ���� �ǰ� �ִ� ��.
		
//		ar[1]. <- ��ĳ�����߱� ������ p �� �ִ� f1() f2() ����� �� ����. ������ �� ���� �ִٸ� ��� ������. 
		
		Main.test(c2);
		Main.test(c);
		
		// Ÿ��
		// p �� Ÿ���� �˰� �ʹ�.
		// �ν��Ͻ� instanceof Ŭ���� : �ν��Ͻ��� Ŭ����Ÿ���̴�? ������ true, Ʋ���� false
		System.out.println(p instanceof Object);
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Child);
		
		System.out.println(c instanceof Object);
		System.out.println(c instanceof Parent); // �ڽ��� �θ�Ÿ�Ե� �ȴ�.
		System.out.println(c instanceof Child);
	
		System.out.println("============================");
		Parent up = (Parent)c;
		System.out.println(up instanceof Object);
		System.out.println(up instanceof Parent);
		System.out.println(up instanceof Child);
	}

}
