package z_0507;

import java.util.Scanner;

public class Main45 {

	public static void main(String[] args) {
		// 10���� ������ �Է¹޾� �迭�� ������ �� ¦�� ��° �Էµ� ���� �հ� Ȧ�� ��° �Էµ� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ����� �ݿø��Ͽ� �Ҽ�ù°�ڸ����� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		int sum = 0;
		int sum2 = 0;
		double avg = 0;
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			
			if(i%2 != 0) { // ����� ���� 2��°�� ��ǻ�Ͱ� ���� 2��°(0, 1) �ٸ�.
				sum += ar[i];
			}
			else if(i%2 == 0) {
				sum2 += (double)ar[i];
			}
		}
		avg = (double)sum2/(ar.length/2); // ���� ����ȯ���� ����� �Ҽ����ڸ��� ��Ÿ���� ����.
		                                  // ar.length/2  => 10���� �Է°��� Ȧ�� ���� ����� ���ϱ� ������ sum2/5 �� �Ǿ����.
		System.out.println("sum : " +sum);
		System.out.printf("avg : %.1f", avg );
	}

}
