package day12;

public class ClassTest {
	// �����ε�, ��ü, �ʵ� �� ��� ������ �� ����, ���� �ٽ� Ȯ��.

	public static void main(String[] args) {
//		String name = "��ö��";
//		int kor = 100;
//		int eng = 70;
//		int math = 50;
//		
//		String name1 = "ȫ�浿";
//		int kor1 = 50;
//		int eng1 = 30;
//		int math1 = 40;
		
		Student kim = new Student("���Ϸ�", 90, 100, 80); // ��üȭ.
		Student hong = new Student("ȫ�浿", 50, 30, 40);
		       //kim : ��ü, �ν��Ͻ���� �θ�
			   //new : �޸𸮿� �Ҵ�����ִ� ������
		       //Student() : ������. ��ü�� ������ �� ����Ѵ�.
		
			   // ��� �ڼ��Ѱ� kim �� ��������, new Student �� ��ü�� �θ��°ǵ�
			   // ���� ��� ���ο���.
	//	Student hong = new Student();
		
	//	kim.setVariables("��ö��", 100, 70, 50);
//		kim.name = "��ö��";
//		kim.kor = 100;
//		kim.eng = 70;
//		kim.math = 50;
		
	//	hong.setVariables("ȫ�浿", 50, 30, 40);
//		hong.name = "ȫ�浿";
//		hong.kor = 50;
//		hong.eng = 30;
//		hong.math = 40;
		
		kim.show();
		hong.show();
		ClassTest.printStudent(kim);
//		System.out.println("---�л�����---");
//		System.out.println("�̸�: "+kim.name);
//		System.out.println("��������: "+kim.kor);
//		System.out.println("��������: "+kim.eng);
//		System.out.println("��������: "+kim.math);

		ClassTest.printStudent(hong);
//		System.out.println("---�л�����---");
//		System.out.println("�̸�: "+hong.name);
//		System.out.println("��������: "+hong.kor);
//		System.out.println("��������: "+hong.eng);
//		System.out.println("��������: "+hong.math);
		
		
		}
	
	public static void printStudent(Student s) {
		System.out.println("---�л�����---");
		System.out.println("�̸�: "+s.name);
		System.out.println("��������: "+s.kor);
		System.out.println("��������: "+s.eng);
		System.out.println("��������: "+s.math);
		
		Student s1 = new Student("�ڿ���",100,100,100);
		s1.show();
		
		Student s2 = new Student();
	}
}
class Student { // Ŭ���� �ȿ��� ���� �����ϸ� �ʱⰪ ���൵ �� �ʱ�ȭ �Ǿ�����.    // �ʵ�
	String name;								 // ���, ��� ���� == �ν��Ͻ�����
	int kor;									 // ���, ��� ����	== �ν��Ͻ�����
	int eng;									 // ���, ��� ����	== �ν��Ͻ�����	
	int math;								     // ���, ��� ���� == �ν��Ͻ�����
	
	public Student() { // 67��°�� �Ű����� �ϳ��� ���� �� ���� �ǰԲ� �ϴ� ��. �޼��� �����ε�
		 			   // �⺻ ������
	}
	
	// �ʱ�ȭ ������
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// ���, ����Լ� == �޼ҵ�
	public void setVariables(String s, int num1, int num2, int num3) {
		name = s;
		kor = num1;
		eng = num2;
		math = num3;
	}
	// ���, ����Լ� == �޼ҵ�
	public void show() {
		System.out.println("show() �޼ҵ� �����");
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+this.kor);
		System.out.println("���� : "+this.eng);
		System.out.println("���� : "+this.math);
	}
}
