package z_0506;

import java.util.Scanner;

public class Main43 {

	public static void main(String[] args) {
		// 10���� ������ �Է¹޾� �� �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// (�Է¹��� ������ 1000�� ���� �ʴ´�.)
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int min = 0;
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		min = a[0];
		
		for(int j=1; j<a.length; j++) {
			if (min > a[j]) {
				min = a[j];
			}
		}
		System.out.println(min);
		
	}

}
