package z_0506;

import java.util.Scanner;

public class Main42 {

	public static void main(String[] args) {
		// 1�ݺ��� 6�ݱ����� ��������� ������ �� �� ���� �� ��ȣ�� �Է¹޾� �� �� ��������� ���� ����ϴ� ���α׷��� �ۼ�
		// �ݺ� ��������� �ʱⰪ���� 1�ݺ��� ���ʷ� 85.6 79.5 83.1 80.0 78.2 75.0���� �ʱ�ȭ�ϰ� 
		// ����� �Ҽ� �� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� �Ѵ�.
		
		
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		
		double ban[] = new double[] {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		int a = sc.nextInt()-1;
		int b = sc.nextInt()-1;
		
		System.out.printf("%.1f", ban[a]+ban[b]);
	}

}
