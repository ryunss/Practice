package classTest;

public class Student {
	// ����ƽ����(��������), ���, �������, Ŭ��������
	// ��� �ν��Ͻ����� ���� �����Ѵ�. ���� ����� �� �ν��Ͻ���.�������̾ƴ϶�
	// Ŭ������.���������� ����ϴ� ���� �ٶ����ϴ�
	static String school = "����б�";
	
	String name;
	int kor;
	int eng;
	int math;
	
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public static void f() { // ����ƽ�޼ҵ�
		//��� �ν��Ͻ��� ���� ������ ���� �ȴ�
		System.out.println("����ƽ�޼ҵ� f() ȣ���");
//		System.out.println(name); �ν��Ͻ��� ���� �ٸ� ���� �����ϰ� �ִ� �ν��Ͻ� ������ ����ƽ�������� ����� �� ����.
	}
	public void show() {
		System.out.println("---�л�����---");
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+this.kor);
		System.out.println("���� : "+this.eng);
		System.out.println("���� : "+this.math);
	}
}
