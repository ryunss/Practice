package day17;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// ����ڿ��� �ε�����ȣ�� ������ �Է¹޾Ƽ� �迭�� �ش� ��Ҹ� ������ ���� ����� ����ϴ� ���α׷�
		// x ��° ���� y �� ������.
		Scanner sc = new Scanner(System.in);
		
		int[] ar = {10, 20, 30};
	
		try {
			System.out.print("�ε��� >> ");
			int idx = sc.nextInt();
			System.out.print("���� �� >> ");
			int num = sc.nextInt();
			System.out.println("��� : "+ ar[idx] / num);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ��ȣ�� Ȯ���ϼ���.");
		}catch(ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("���� �߻���");
		}finally {
			System.out.println("���ܰ� �߻��ϵ� ���ϵ� ������ ����Ǵ� ����");
		}
		System.out.println("���α׷� �����");
	}

}
