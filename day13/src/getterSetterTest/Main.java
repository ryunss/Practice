package getterSetterTest;

public class Main {

	public static void main(String[] args) {
//		Student kim = new Student();
//		Student park = new Student("�ڿ���", 100, 100, 100);
//		Student hong = new Student("ȫ�浿", 70, 70, 70);
//		
//		
////		kim.name = "��ö��"; 
////		Student Ŭ�������� �����̺����� �����Ǿ��ֱ� ������ �ٷ� ����� �� ����.
//		kim.setName("��ö��");
//		kim.setKor(100);
//		kim.setEng(70);
//		kim.setMath(50);
//		
//		// ��ö���� ���������� 100��, �������� 70��, �������� 50���̴�
//		// �ش� ������ kim �̶�� ��ü �� �ν��Ͻ� ������ �����ϰ�
//		
////		System.out.println(kim.name);
//		// ---��ö�� ��������---
//		// ���� : 100��
//		// ���� : 70��
//		// ���� : 50��
//		// ������� : 00.00��
//		
//		System.out.println("---"+kim.getName()+" ��������---");
//		System.out.println("���� : "+ kim.getKor()+"��");
//		System.out.println("���� : "+ kim.getEng()+"��");
//		System.out.println("���� : "+ kim.getMath()+"��");
//		System.out.println("������� : "+(double)(kim.getKor()+kim.getEng()+kim.getMath())/(double)3);
		
		//----------------------------------------------------------
		//��üŸ�� �迭 kim, park, hong�� ��ҷ� ����ִ� �迭
		
		//ex) int num1 = 100;
		//	  int num2 = 200;
		//    int[] ar = {num1, num2}; �̰Ŷ� �����ǹ�.
		Student[] students = {
				new Student("��ö��", 50, 50, 50), 
				new Student("�ڿ���", 100, 100, 100), 
				new Student("ȫ�浿", 50, 50, 50)
				};
		
		System.out.println(students[0].getName());
		System.out.println(students[1].getName());
		System.out.println(students[2].getName());
	}

}
